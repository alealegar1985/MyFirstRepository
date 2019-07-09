package test_lambda.basicLambda;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import test_lambda.basicLambda.beans.RequestObj;
import test_lambda.basicLambda.beans.ResponseObj;

/*
 * 
 * When it's required to use external libraries it's required to create an uber jar
 * This means that the shade package is require in order to include in the jar the libs itself
 * 
 */


public class MyLambdaDynamoDb implements RequestHandler<RequestObj, ResponseObj> {

	private static String LAMBDA_TEST_ENDPOINT = "LAMBDA_TEST_ENDPOINT";
	private static String LAMBDA_TEST_REGION = "LAMBDA_TEST_REGION";
	private static String LAMBDA_TEST_SECUREKEY = "LAMBDA_TEST_SECUREKEY";
	private static String LAMBDA_TEST_KEY = "LAMBDA_TEST_KEY";
	
	String endpoint, region, key, securekey;
	
	public ResponseObj handleRequest(RequestObj arg0, Context arg1) {
		// TODO Auto-generated method stub
		arg1.getLogger().log("STARTS");
		endpoint = System.getenv(LAMBDA_TEST_ENDPOINT);
		region = System.getenv(LAMBDA_TEST_REGION);
		key = System.getenv(LAMBDA_TEST_KEY);
		securekey = System.getenv(LAMBDA_TEST_SECUREKEY);
		arg1.getLogger().log("ENV "+endpoint+"\t"+region+"\t"+key+"\t"+securekey);
		DynamoDBMapper mapper = dynamoDBMApper();
		arg1.getLogger().log("ready to accesso to dynamo" + mapper.getClass().toGenericString());
		
		return null;
	}
	
	public DynamoDBMapper dynamoDBMApper(){
		return new DynamoDBMapper(amazonDynamoDbClientConfig());
	}
	
	public AmazonDynamoDB amazonDynamoDbClientConfig(){

		return AmazonDynamoDBClientBuilder.standard()
				.withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(endpoint, region))
			    .withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials( key, securekey)))
			    .build();
		
	}
	

}
