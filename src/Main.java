import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = Integer.parseInt(scanner.next());
        boolean correctAnswer = true;
        do {
            System.out.println("Enter Choice between Sum and Product(s/p): ");
            String choice = scanner.next();
            //For User choice
            switch (choice) {
                case "s":
                    correctAnswer = true;
                    System.out.println("Sum of numbers is :" +SumOfNumbers(n));
                    break;
                case "p":
                    correctAnswer = true;
                    System.out.println("Product of numbers is " + ProductOfNumbers(n));
                    break;
                default:
                    correctAnswer = false;
                    System.out.println("Please enter correct input(s/p)");
                    break;
            }
        } while (correctAnswer == false);

    }

    //Sum
    private static int SumOfNumbers(int number){
        int sum = 0;
        for (int i = 0;i<=number;i++){
            sum = sum + i;
        }
        return sum;
    }

    //Product
    private static int ProductOfNumbers(int number){
        if (number<= 1)
            return 1;
        else
            return number * ProductOfNumbers(number - 1);
    }

}
