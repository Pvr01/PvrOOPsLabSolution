package main;

import model.Employee;
import services.GenerateCredentials;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Parameterized constructor to set values rather than getting from input
        Employee employee = new Employee("pvr", "pasupuleti");
        Employee employee1 = new Employee();
        GenerateCredentials generateCredentials = new GenerateCredentials();
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("\n Please enter the Department from the following\n");
            System.out.println("1. Technical");
            System.out.println("2. Admin");
            System.out.println("3. Human Resource");
            System.out.println("4. Legal");
            System.out.println("5. Exit \n");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    //when setting values using Parameterized constructor
                    generateCredentials.generateCredentials(employee, "tech");
                    //when setting values using input
//                    generateCredentials.generateCredentials(employee1, "tech");
                    break;
                case 2:
                    //when setting values using Parameterized constructor
                    generateCredentials.generateCredentials(employee, "admin");
                    //when setting values using input
//                    generateCredentials.generateCredentials(employee1, "admin");
                    break;
                case 3:
                    //when setting values using Parameterized constructor
                    generateCredentials.generateCredentials(employee, "hr");
                    //when setting values using input
//                    generateCredentials.generateCredentials(employee1, "hr");
                    break;
                case 4:
                    //when setting values using Parameterized constructor
                    generateCredentials.generateCredentials(employee, "legal");
                    //when setting values using input
//                    generateCredentials.generateCredentials(employee1, "legal");
                    break;
                case 5:
                    generateCredentials.exit();
                    break;
                default:
                    throw new IllegalStateException("Enter valid input");
            }
        } while (option != 5);
        scanner.close();
    }
}
