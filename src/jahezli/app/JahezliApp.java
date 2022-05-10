/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jahezli.app;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class JahezliApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int choice;
        int reservationNo;
        do {
            System.out.println("---------------------------------------------------");
            System.out.println("             Welcome to Jahezli reservation app   ");
            System.out.println("---------------------------------------------------");
            System.out.println("Enter 1 to login");
            System.out.println("Enter 2 to search for table ");
            System.out.println("Enter 3 to modify the reservation ");
            System.out.println("Enter 4 to display the reservation ");
            System.out.println("Enter 5 to review and feedback ");
            System.out.print("Enter 0 to quit Enter your choice:");
            choice = input.nextInt();

            switch (choice) {
                case 0:
                    if (choice != 1 && choice == 0) {
                        System.out.println("***********You did not login ***********");
                    } else {
                        System.out.println("---------------------------------------------------");
                        System.out.println("*** Thank you for Visiting ***");
                        System.out.println("---------------------------------------------------");
                        System.exit(0);
                    }
                    break;

                case 1:
                    System.out.print("Enter your user name: ");
                    String userName = input.next();
                    System.out.print("Enter your password: ");
                    String Password = input.next();
                    break;

                case 2:
                    if (choice != 1 && choice == 2) {
                        System.out.println("***********You have to login first***********");
                    } else {

                    }
                    break;

                case 3:
                    if (choice != 1 && choice == 3) {
                        System.out.println("***********You have to login first***********");
                    } else {
                        System.out.print("Enter your reservation number: ");
                        reservationNo = input.nextInt();

                    }
                    break;

                case 4:
                    if (choice != 1 && choice == 4) {
                        System.out.println("***********You have to login first***********");
                    } else {
                        System.out.print("Enter your reservation number: ");
                        reservationNo = input.nextInt();
                    }
                    break;

                case 5:
                    if (choice != 1 && choice == 5) {
                        System.out.println("***********You have to login first***********");
                    } else {
                        System.out.print("Enter 1 to write your feedback: ");
                        System.out.print("Enter 2 to review the feedbacks: ");
                        int feedbackChoice = input.nextInt();
                        switch (feedbackChoice) {
                            case 1:
                                System.out.print("Enter your reservation number: ");
                                reservationNo = input.nextInt();
                                System.out.print("Enter your feedback: ");
                                String feedback = input.next();
                                break;

                            case 2:
                                System.out.print("Enter the restaurant name: ");
                                String resturauntName = input.next();
                                break;
                        }
                    }
                    break;

            }

        } while (choice != 0 || choice != 1 || choice != 2 || choice != 3 || choice != 4 || choice != 5);

    }

}
