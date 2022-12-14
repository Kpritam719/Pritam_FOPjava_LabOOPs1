package com.greatlearning.labAssignment.application;

import java.util.Scanner;

import com.greatlearning.labAssignment.model.Employee;
import com.greatlearning.labAssignment.service.CrendentialService;

public class Application {
	
	
		
		public static void main(String[] args) {
			
			Employee emp = new Employee("Pritam","Kumar");
			CrendentialService cs = new CrendentialService();
			String generatedEmail;
			char[] generatedPassword;
			
			System.out.println("Please enter the department from the following ");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");
			
			Scanner sc = new Scanner(System.in);
			
			int input = sc.nextInt();
			
			switch(input) {
			
			case 1: {
				generatedEmail = cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "tech");
				generatedPassword = cs.generatePassword();
				cs.showCredentials(emp, generatedEmail, generatedPassword);
				break;
			}
			case 2: {
				generatedEmail = cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "adm");
				generatedPassword = cs.generatePassword();
				cs.showCredentials(emp, generatedEmail, generatedPassword);
				break;
			}
			case 3:{
				generatedEmail = cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "HR");
				generatedPassword = cs.generatePassword();
				cs.showCredentials(emp, generatedEmail, generatedPassword);
				break;
			}
			case 4:{
				generatedEmail = cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "legal");
				generatedPassword = cs.generatePassword();
				cs.showCredentials(emp, generatedEmail, generatedPassword);
				break;
			}
			
			}
			
		}
		
	}
