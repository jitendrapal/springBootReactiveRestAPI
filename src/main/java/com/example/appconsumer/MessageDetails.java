package com.example.appconsumer;

public class MessageDetails {

	private String name;
	private String date;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public MessageDetails(String name, String date) {
		super();
		this.name = name;
		this.date = date;
	}
	@Override
	public String toString() {
		return "MessageDetails [name=" + name + ", date=" + date + "]";
	}
	

}
