import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j < m * 2; j++) {
                if (j >= m - i + 1 && j <= m + i - 1) {
                    System.out.print(" " + (i - Math.abs(m - j) + " "));
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
