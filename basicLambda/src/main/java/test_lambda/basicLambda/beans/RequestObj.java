package test_lambda.basicLambda.beans;

public class RequestObj {
	
	String str1, str2;
	Integer int1;
	
	public String getStr1() {
		return str1;
	}
	public void setStr1(String str1) {
		this.str1 = str1;
	}
	public String getStr2() {
		return str2;
	}
	public void setStr2(String str2) {
		this.str2 = str2;
	}
	public Integer getInt1() {
		return int1;
	}
	public void setInt1(Integer int1) {
		this.int1 = int1;
	}
	@Override
	public String toString() {
		return "RequestObj [str1=" + str1 + ", str2=" + str2 + ", int1=" + int1 + "]";
	}

}
