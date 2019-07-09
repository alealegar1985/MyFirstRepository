package test_lambda.basicLambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import test_lambda.basicLambda.beans.*;

public class MyLambda2Example implements RequestHandler<RequestObj, ResponseObj>{

	public ResponseObj handleRequest(RequestObj arg0, Context arg1) {
		
		arg1.getLogger().log(arg0.toString());
		ResponseObj out = new ResponseObj();
		RequestObj in = arg0;
		out.setInt2(in.getInt1());
		out.setStr3(in.getStr1());
		out.setStr4(in.getStr2());
		arg1.getLogger().log(System.getenv("TEST_ENV"));
		arg1.getLogger().log(System.getenv("TEST_ENV2"));
		
		return out;
	}

}
