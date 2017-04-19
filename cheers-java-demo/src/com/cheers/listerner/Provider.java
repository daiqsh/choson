package com.cheers.listerner;

public class Provider {

	private String status;
	
	public String getStatus(String status) {
		if ("Y".equals(status)) {
			return "Cheers";
		}
		
		return "No body";
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
