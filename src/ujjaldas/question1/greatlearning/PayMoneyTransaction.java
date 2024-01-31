//Question 1

package ujjaldas.question1.greatlearning;
import java.util.Scanner;

public class PayMoneyTransaction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of transaction array:");
        int n = scanner.nextInt();

        System.out.println("Enter the values of array:");
        int[] transactions = new int[n];
        for (int i = 0; i < n; i++) {
            transactions[i] = scanner.nextInt();
        }

        System.out.println("Enter the total number of targets that need to be achieved:");
        int numTargets = scanner.nextInt();

        for (int t = 0; t < numTargets; t++) {
            System.out.println("Enter the value of target:");
            int target = scanner.nextInt();

            int sum = 0;
            int transactionsCount = 0;

            for (int i = 0; i < n; i++) {
                sum += transactions[i];
                transactionsCount++;

                if (sum >= target) {
                    System.out.println("Target achieved after " + transactionsCount + " transactions");
                    break;
                }
            }

            if (sum < target) {
                System.out.println("Given Target is not achieved");
            }
        }
    }
}
