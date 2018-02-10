/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package email.application;

import java.util.Scanner;

/**
 *
 * @author Jefferson Mendes
 */
public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity;
    private String alternateEmail;
    
    //Constructor to recieve the name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created: " + this.firstName + " " + this.lastName);
        
        //Call method asking for department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);
    
        //Call random password generating method
        this.password = randomPass(8);
        System.out.println("Senha: "+ this.password);
    }
    //Ask for department
    private String setDepartment(){
        System.out.println("CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the department:");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        switch (depChoice) {
            case 1:
                return "Sales";
            case 2:
                return "Development";
            case 3:
                return "Accounting";
            default:
                return "";
        }
    }
    //generate random password
    private String randomPass(int length){
        //Password Scope 
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345678910!@#$%*";
        char[] password = new char[length];
        for(int i=0; i<length; i++){
            //Iterate generating a random number to be used as index
            int rand = (int)(Math.random() * passwordSet.length());
            //By the index, copy passwordSet elements to our password
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    
    //Set mailbox capacity
    
    //Set alternate email
    
    //Change password
    
    
}
