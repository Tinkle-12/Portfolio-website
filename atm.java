import java.util.*;

public class atm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int initAmount = 0;
        int user_input;
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your password!!");
        String password = sc.nextLine();

        System.out.println("Welcome " + name);

        do {
            System.out.println(
                    " Press 1 to deposit \n Press 2 to withdraw \n Press 3 to enquire amount \n Press 4 to exit");
            user_input = sc.nextInt();
            switch (user_input) {
                case 1: {
                    System.out.println("Enter the amount to be deposited");
                    int deposit = sc.nextInt();
                    initAmount += deposit;
                    System.out.println(
                            "************************************ \n Amount deposited successsfully... \n ************************************");
                }
                    break;

                case 2: {
                    System.out.println("Enter the amount to be withdrawn");
                    int withdraw = sc.nextInt();
                    if (initAmount >= withdraw) {
                        initAmount -= withdraw;
                        System.out.println(
                                "************************************ \n Amount withdrawn successsfully... \n ************************************");
                    } else
                        System.out.println(
                                "************************************ \n Insufficcient Balance... \n ************************************");
                }

                case 3: {
                    System.out.println("************************************");
                    System.out.println("Your balance is : " + initAmount);
                    System.out.println("************************************");
                }
                    break;
                default:
                    System.out.println("Invalid input");
            }
        } while (user_input != 4);
    }
}