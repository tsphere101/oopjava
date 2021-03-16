import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.Math;

public class Quiz2 {

    public static void main(String[] args) {

        for(int i = 0 ; i< 5 ; i++)
        run();
    }

    public static void run() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input size of matrix : ");
        int mySize = Integer.parseInt(sc.nextLine());
        if (mySize < 5) {
            return;
        }

        int[][] thisIsMyMatrix = genRandomMTX(mySize);

        System.out.println("Random matrix : ");

        printArrays(thisIsMyMatrix);
        checkForRowHasLeast1s(thisIsMyMatrix);
        columnCheckForHasLeast1s(thisIsMyMatrix);

    }

    public static void columnCheckForHasLeast1s(int[][] arr) {
        ArrayList<Integer> bugFixList = new ArrayList<Integer>();
        int count = 0;
        int col_least = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][row] == 0) {
                    count++;
                }
            }

            bugFixList.add(count);

            // if (count == prev) {
            // System.out.println("Column with the least found \"0\" : NO");
            // return;
            // }

            // if (count < prev) {
            // prev = count;
            // col_least = row;
            // }

            count = 0; // reset
        }

        int duplicate_check = 0;
        int min_value_in_list = minValue(bugFixList);
        for (int i = 0; i < bugFixList.size(); i++) {

            if(bugFixList.get(i) == min_value_in_list)
            {
                duplicate_check++;
            }
        }

        System.out.println("COL DUPLICATE CHECK :: " + duplicate_check);

        if(duplicate_check > 1)
        {
            System.out.println("Column with the least found \"0\" : NO");
            return;
        }


        System.out.println("Column with the least found \"0\" is : " + (bugFixList.indexOf(min_value_in_list)+ 1));
        return;

    }

    public static void checkForRowHasLeast1s(int[][] arr) {
        ArrayList<Integer> myBugFix = new ArrayList<Integer>();
        int count = 0;
        int row = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int k = 0; k < arr[i].length; k++) {
                if (arr[i][k] == 1)
                    count++;
            }

            myBugFix.add(count);

            // if(count == prev)
            // {
            // System.out.print("Row with the least found \"1\" : ");
            // System.out.println("NO");
            // return;
            // }

            // if(count< prev)
            // {
            // prev = count;
            // row = i;
            // }

            count = 0; // reset counter
        }

        int duplicate_check = 0;
        int min_in_list = minValue(myBugFix);
        for (int i = 0; i < myBugFix.size(); i++) {

            if (myBugFix.get(i) == min_in_list) {
                duplicate_check++;
            }
        }
        System.out.println("ROW DUPLICATE CHECK :: " + duplicate_check);
        if (duplicate_check > 1) {
            System.out.print("Row with the least found \"1\" : ");
            System.out.println("NO");
            return;
        }

        System.out.print("Row with the least found \"1\" : ");
        System.out.println("YES, " + (myBugFix.indexOf(min_in_list)+ 1)); // +1 for convert to Natural number.
        return;
    }

    public static int minValue(ArrayList<Integer> arr) {
        if (arr.size() <= 1)
            return arr.get(0);

        int result = arr.get(0);
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i + 1) < result) {
                result = arr.get(i + 1);
            }
        }

        return result;

    }

    public static void printArrays(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++) {
                System.out.print(arr[i][k]);
            }
            System.out.println();
        }
    }

    public static int[][] genRandomMTX(int size) {
        int[][] result = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int k = 0; k < size; k++) {
                result[i][k] = (int) (Math.random() * (2));
            }
        }
        return result;
    }

    public static int generateRandomNumber() {
        return ((int) (Math.random() * 100)) % 2;
    }

}
