package com.example.movieconsumer;

public class SmsCommande {
	private String mobileno;
	private String route ;
	private String message;
	
	
	
	
	public SmsCommande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SmsCommande(String mobileno, String route, String message) {
		super();
		this.mobileno = mobileno;
		this.route = route;
		this.message = message;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "SmsCommande [mobileno=" + mobileno + ", route=" + route + ", message=" + message + "]";
	}
	
	
	
	
	
	

}
