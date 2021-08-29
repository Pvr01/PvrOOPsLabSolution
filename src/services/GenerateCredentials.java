package services;

import model.Employee;

import java.util.Random;
import java.util.Scanner;

public class GenerateCredentials {

    public void generateCredentials(Employee employee, String dept) {

    // Get First Name, Last name as input

        /*Scanner scanner = new Scanner(System.in);
        String firstName, lastName;
        System.out.println("\n Please enter the First Name\n");
        firstName = scanner.next();
        employee.setFirstName(firstName);
        if(firstName.isEmpty()) System.out.println("Please check your First Name");
        System.out.println("\n Please enter the Last Name\n");
        lastName = scanner.next();
        if(lastName.isEmpty()) System.out.println("Please check your Last Name");
        employee.setLastName(lastName);
        String name = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
        System.out.println("Dear " + name + " your generated credentials are as follows\nEmail ---->" + employee.getFirstName() + employee.getLastName() + "." + dept + "@gl.com\n" + "Password ---->" + generatePassword());
*/
        /* Implementation works for  Employee parameterized constructor */
        String string = employee.getFirstName().substring(0, 1).toUpperCase() + employee.getFirstName().substring(1);
        System.out.println("Dear " + string + " your generated credentials are as follows\n" +
                "Email ---->" + employee.getFirstName() + employee.getLastName() + "." + dept + "@abc.com\n" +
                "Password ---->" + generatePassword());
    }

    public String generatePassword() {
        String value = "A0b2C!dE&1F*gH#i3Jk4Lm5No6P%q9Rs7TwXy8Z@";
        int length = 8;
        StringBuilder builder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            builder.append(value.charAt(random.nextInt(value
                    .length())));
        }
        return builder.toString();
    }

    public void exit() {
        System.out.println("Thank you!! You are Exit now");
    }
}
