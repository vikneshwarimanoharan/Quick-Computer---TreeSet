package task3;
import java.util.Scanner;

public class NumberAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumAvg numAvg = new NumAvg();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add number");
            System.out.println("2. Find Average");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter number to add: ");
                    int numToAdd = scanner.nextInt();
                    numAvg.addNum(numToAdd);
                    System.out.println("Number added successfully!");
                    break;
                case 2:
                    double average = numAvg.calAvg();
                    if (average == 0) {
                        System.out.println("The set is empty");
                    } else {
                        System.out.println("Average of numbers: " + average);
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using the application");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please select a valid option (1-3).");
            }
        }
    }
}