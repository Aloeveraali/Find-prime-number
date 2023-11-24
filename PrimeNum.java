import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("1. Check if a number is prime");
            System.out.println("2. List prime numbers in a range");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1, 2 or 3): ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Enter a number: ");
                    int number = scanner.nextInt();
                    if (isPrime(number)) {
                        System.out.println(number + " is a prime number.");
                    } else {
                        System.out.println(number + " is not a prime number.");
                    }
                    break;
                case 2:
                    System.out.print("Enter the start of the range: ");
                    int start = scanner.nextInt();
                    System.out.print("Enter the end of the range: ");
                    int end = scanner.nextInt();
                    System.out.print("Prime numbers in the range [" + start + ", " + end + "]: ");
                    for (int i = start; i <= end; i++) {
                        if (isPrime(i)) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please choose 1, 2 or 3.");
                    break;
            }
        } while (option != 3);
        scanner.close();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}