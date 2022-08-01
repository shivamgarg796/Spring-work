package com.masai;

public class FinalizeMethod {

	public FinalizeMethod() {
		System.out.println("Object created...!");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("inside FINALIZE Method");
		System.out.println("Object dies ...!");
		
	}
	
	public static void main(String[] args) {
		
		FinalizeMethod fm =new FinalizeMethod();
		
		fm=null;
		
		System.gc();//initiate the garbage collector explicitly
		
	}
	
	

}
