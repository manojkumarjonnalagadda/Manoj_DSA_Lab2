import java.util.*;

public class Payment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of currency denominations:");
        int n = sc.nextInt();

        int[] denominations = new int[n];

        System.out.println("Enter the currency denominations:");
        for (int i = 0; i < n; i++) {
            denominations[i] = sc.nextInt();
        }

        System.out.println("Enter the amount you want to pay:");
        int amount = sc.nextInt();

        int[] notesCount = new int[n];

        for (int i = 0; i < n; i++) {
            notesCount[i] = amount / denominations[i];
            amount %= denominations[i];
        }

        boolean possible = true;
        for (int i = 0; i < n; i++) {
            if (notesCount[i] != 0) {
                System.out.println(denominations[i] + ":" + notesCount[i]);
            }
            if (amount == 0) {
                break;
            }
            if (i == n - 1 && amount != 0) {
                possible = false;
            }
        }

        if (!possible) {
            System.out.println("Payment cannot be made with the given denominations.");
        }
    }
}
