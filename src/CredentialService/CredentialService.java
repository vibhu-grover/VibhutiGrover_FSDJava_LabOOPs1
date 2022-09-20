package CredentialService;

import java.util.Random; 

import Model.Employee; 

public class CredentialService {
	
	public String generatePassword() {              // generatePassword() method to generate random password.
		String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase = "abcdefghijklmnopqrstuvwxys";
		String num = "0123456789";
		String special="!@#$%^&*()_+"; 
		
		String bigString = caps+lowerCase+num+special;
		Random random = new Random();
		char [] password = new char[8];
		for(int i=0;i<8;i++) {
			
			password[i]=bigString.charAt(random.nextInt(bigString.length()));
			
	}
		 
		
	return new String (password);  // return password 
	
		
	}
	
	public String generateEmailAddress(String firstName,String lastName,String department) {  // generateEmailAddress() method will generate email adress.
		return firstName+lastName+"@"+department+".gl.com";
		
		
	}
	
	public void showCredentials(Employee emp,String email,String password) {   // showCredentials() method  to display the Credentials of Employee.
		
		System.out.println("Dear"+ "  " +emp.getFirstName()+" " +  "your generated credential are as follows  ");
		System.out.println("Email--->"+email);
		System.out.println("Password--->"+password);
	}
	

}
