//Question 2

package ujjaldas.question2.greatlearning;

import java.util.Arrays;
import java.util.Scanner;

public class PaymentApproach {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of currency denominations:");
        int n = scanner.nextInt();

        System.out.println("Enter the currency denominations value:");
        int[] denominations = new int[n];
        for (int i = 0; i < n; i++) {
            denominations[i] = scanner.nextInt();
        }

        Arrays.sort(denominations);

        System.out.println("Enter the amount you want to pay:");
        int amount = scanner.nextInt();

        int remainingAmount = amount;

        System.out.println("Your payment approach in order to give the minimum number of notes will be:");

        for (int i = n - 1; i >= 0; i--) {
            int count = remainingAmount / denominations[i];
            if (count > 0) {
                System.out.println(denominations[i] + ":" + count);
                remainingAmount %= denominations[i];
            }
        }
    }
}
