package com.cheers.listerner;

public class Consumer {

	public void fireProvider(Provider service, String signal) {
		if ("Y".equals(signal)) {
			System.out.println("hello! Welcome ~ " + service.getStatus(signal));
		} else {
			System.out.println("Sorry ~ " + service.getStatus(signal));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer test = new Consumer();
		Provider service = new Provider();
		test.fireProvider(service, "Y");
		test.fireProvider(service, "N");
	}

}
