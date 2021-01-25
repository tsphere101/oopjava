import java.util.Scanner;

public class NumberPyra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        printForMe(num);
        
        sc.close();

    }

    public static void printForMe(int num) {
        int row = 0;
        int j = 0;
        int k = 0;
        int p = 0;
        int n = num;

        for ( row = 0; row < n; row++) {

            for ( p = row; p < n - 1; p++) {
                System.out.print("  ");
            }
            for ( j = row + 1; j > 0; j--) {
                System.out.print(j + " ");
            }
            for ( k = 2; k < 2 + row; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }

}
