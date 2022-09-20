
import java.util.Scanner;

import  Model.Employee;
import  CredentialService.CredentialService;

public class Main {
	
	

	public static void main(String[] args) {
		
		Employee emp = new Employee("Vibhuti", "Grover");      
		CredentialService cs = new CredentialService();             
		String generatedEmail;                                             
		String generatedPassword;        
		
		
		System.out.println("Please Enter Department From The Following");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resourse");
		System.out.println("4.Legal");
		
		Scanner sc = new Scanner(System.in);  // Creating Scanner class object.
		int input = sc.nextInt();
		
		/*
		 * Switch case to Decide use output .
		 */
		
		switch (input) {
		
		case 1:{ generatedEmail=cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "tec");
				generatedPassword=cs.generatePassword();
				cs.showCredentials(emp, generatedEmail, generatedPassword);
			break;
		}
		case 2:{ generatedEmail=cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "adm");
		generatedPassword=cs.generatePassword();
		cs.showCredentials(emp, generatedEmail, generatedPassword);
	break;
}
			
		case 3 :{ generatedEmail=cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "hr");
		generatedPassword=cs.generatePassword();
		cs.showCredentials(emp, generatedEmail, generatedPassword);
	break;
}
			
		case 4:{ generatedEmail=cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "leg");
		generatedPassword=cs.generatePassword();
		cs.showCredentials(emp, generatedEmail, generatedPassword);
	break;
}
			
			
		
		 
		
		

	}

}
}
