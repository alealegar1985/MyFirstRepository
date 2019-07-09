package test_lambda.basicLambda.beans;

public class ResponseObj {

	String str3, str4;
	Integer int2;
	
	public ResponseObj(){
		
	}
	
	public String getStr3() {
		return str3;
	}
	public void setStr3(String str3) {
		this.str3 = str3;
	}
	public String getStr4() {
		return str4;
	}
	public void setStr4(String str4) {
		this.str4 = str4;
	}
	public Integer getInt2() {
		return int2;
	}
	public void setInt2(Integer int2) {
		this.int2 = int2;
	}
	@Override
	public String toString() {
		return "ResponseObj [str3=" + str3 + ", str4=" + str4 + ", int2=" + int2 + "]";
	}
	
}
