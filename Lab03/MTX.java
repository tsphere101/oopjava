import java.util.List;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Scanner;
import java.util.InputMismatchException;

public class MTX {
    public static void main(String[] args) {
        while(true)
        run();
    }

    public static void run()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the matrix : ");
        int[][] mtx = genRandomMTX(ScannerIntegerRange(1, 500));

        printArray(mtx);

        System.out.print(checkMyMTXPlease(mtx));
    }

    public static String checkMyMTXPlease(int[][] arr) {
        String output = "";
        
        if(arr.length < 2)
        {
            output += ("All " + arr[0][0] + " on row 0\n");
            output += ("All " + arr[0][0] + " on column 0\n");
            output += ("No same number on Superdiagonal(No Superdiagonal)\n");
            output += ("All " + arr[0][0] + " on Diagonal\n");
            output += ("No same number on Subdiagonal(No Subdiagonal)\n");
            return output;
        }

        // Check Rows
        if (checkEveryRow(arr).isEmpty()) {
            output += "No same numbers on a row\n";
        } else {
            List<Integer> row_has_same_num = checkEveryRow(arr);
            while (!row_has_same_num.isEmpty()) {
                int num_is = arr[row_has_same_num.get(0)][0];
                output += ("All " + num_is + "s on row " + row_has_same_num.get(0));
                output += "\n";
                row_has_same_num.remove(0);
            }
        }

        // Check Columns

        if (checkEveryCol(arr).isEmpty()) {
            output += "No same numbers on a column\n";
        } else {
            List<Integer> col_has_same_num = checkEveryCol(arr);
            while (!col_has_same_num.isEmpty()) {
                int num_is = arr[0][col_has_same_num.get(0)];
                output += ("All " + num_is + "s on column " + col_has_same_num.get(0));
                output += "\n";
                col_has_same_num.remove(0);
            }
        }

        // Check SuperDiagonal

        if (checkSuperDiagonal(arr)) {
            int num_is = arr[0][1];
            output += ("All " + num_is + "s on the Superdiagonal\n");
        } else {
            output += ("No same number on the Superdiagonal\n");
        }

        // Check Diagonal
        if (checkDiagonal(arr)) {
            int num_is = arr[0][0];
            output += ("All " + num_is + "s on the Diagonal\n");
        } else {
            output += ("No same number on the Diagonal\n");
        }

        // Check Subdiagonal
        if (checkSubDiagonal(arr)) {
            int num_is = arr[1][0];
            output += ("All " + num_is + "s on the Subdiagonal\n");
        } else {
            output += ("No same number on the Subdiagonal\n");
        }

        return output;
    }

    public static boolean checkDiagonal(int[][] arr) {
        int ref = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++) {
                if (i == k) {
                    if (arr[i][k] != ref)
                        return false;
                }
            }
        }
        return true;
    }

    public static boolean checkSuperDiagonal(int[][] arr) {
        int ref = arr[0][1];
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++) {
                if (i == k - 1) {
                    if (arr[i][k] != ref) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean checkSubDiagonal(int[][] arr) {
        int ref = arr[1][0];
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++) {
                if (i == k + 1) {
                    if (arr[i][k] != ref)
                        return false;
                }
            }
        }
        return true;
    }

    public static List<Integer> checkEveryRow(int[][] arr) {
        List<Integer> row_has_same_num = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (checkRow(arr, i)) {
                row_has_same_num.add(i);
            }
        }
        return row_has_same_num;
    }

    public static List<Integer> checkEveryCol(int[][] arr) {
        List<Integer> col_has_same_num = new ArrayList<Integer>();
        for (int i = 0; i < arr[0].length; i++) {
            if (checkColum(arr, i)) {
                col_has_same_num.add(i);
            }
        }
        return col_has_same_num;
    }

    public static boolean checkRow(int[][] arr, int row) {
        int ref = arr[row][0]; // the most left of the row
        for (int i = 0; i < arr[row].length; i++) {
            if (arr[row][i] != ref) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkColum(int[][] arr, int col) {
        int ref = arr[0][col];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][col] != ref) // the most top of the col
            {
                return false;
            }

        }
        return true;
    }

    public static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static int genRandom(int from, int to) {
        return (int) (from + Math.random() * (1 + to - from));
    }

    public static int[][] genRandomMTX(int size) {
        int[][] result = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int k = 0; k < size; k++) {
                result[i][k] = genRandom(0, 1);
            }
        }
        return result;
    }

    public static int ScannerIntegerRange(int min, int max)
    {
        Scanner sc =new Scanner(System.in);
        int value = 0;
        try
        {
            value = sc.nextInt();
            if (value < min)
            {
                throw new Exception("Please enter integer more than or equal to " + Integer.toString(min));
            }
            if (value > max)
            {
                throw new Exception("Please enter integer less than or equal to " + Integer.toString(max));
            }
        }
        catch(InputMismatchException e)
        {
            System.out.println("Please enter integer");
            return ScannerIntegerRange(min, max);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return ScannerIntegerRange(min,max);
        }
        return value;
    }

}
