package test_lambda.basicLambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class MyLambdaExample implements RequestHandler<Integer, String>{
  
	 public String handleRequest(Integer myCount, Context context) {
		 
		 context.getLogger().log("MyLambdaExample method handleRequest" + context.getAwsRequestId());
		 return String.valueOf(myCount);
	  
	 }
 
}
