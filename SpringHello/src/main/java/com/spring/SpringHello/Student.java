package com.spring.SpringHello;

public class Student {
   private int id;
   private String fname,lname,email;
   public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public void init() 
{
	System.out.println("Spring Initalized");
}
public void destroy()
{
	System.out.println("Spring destroyed");
}
   
}
