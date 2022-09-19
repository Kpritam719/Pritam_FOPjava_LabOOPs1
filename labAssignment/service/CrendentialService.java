package com.greatlearning.labAssignment.service;

import java.util.Random;

import com.greatlearning.labAssignment.model.Employee;

public class CrendentialService{
	
	public char[] generatePassword(){
		String caps ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase ="abcdefghijklmnopqrstuvwxyz";
		String number ="0123456789";
		String special ="!@#$%^&*()_+";
		String bigString = caps+lowerCase+number+special;
		Random random = new Random();
		char[] password = new char[8];
		for(int i=0;i<8;i++) {
			password[i] = bigString.charAt(random.nextInt(bigString.length()));
		}
		return password;
	}
	public String generateEmailAddress(String firstName, String lastName, String department) {
		String str = firstName+lastName+"@"+department+".gl.com";
		String lowerStr = str.toLowerCase();
		return lowerStr;
	}
	public void showCredentials(Employee emp, String email, char[] password) {
		System.out.println("Dear "+emp.getFirstName()+", your generated credentials are as follows:- ");
		System.out.println("Email: "+email);
		String str = String.valueOf(password);
		System.out.println("Password: "+str);
	}

}
		
	
