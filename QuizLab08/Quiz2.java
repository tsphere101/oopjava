import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.Math;

public class Quiz2 {

    public static void main(String[] args) {
        
        run();
    }


    public static void run()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input size of matrix : ");
        int mySize = Integer.parseInt(sc.nextLine());
        if(mySize < 5)
        {
            return;
        }

        int[][] thisIsMyMatrix = genRandomMTX(mySize);

        System.out.println("Random matrix : ");

        printArrays(thisIsMyMatrix);
        checkForRowHasLeast1s(thisIsMyMatrix);
        columnCheckForHasLeast1s(thisIsMyMatrix);

    }



    public static void columnCheckForHasLeast1s(int[][] arr)
    {
        int count = 0 ;
        int prev = Integer.MAX_VALUE;
        int col_least = 0;
        for(int row = 0 ; row < arr.length ; row++)
        {
            for(int i = 0 ; i < arr.length ; i++)
            {
                if(arr[i][row] == 0)
                {
                    count ++;
                }
            }

            if(count == prev)
            {
                System.out.println("Column with the least found  \"0\" : NO");
                return;
            }

            if (count < prev)
            {
                prev = count;
                col_least = row;
            }


            count = 0 ; // reset

        }
        
        System.out.println("Column with the least found \"0\" is : " + (col_least+1));
        return;



    }



    public static void checkForRowHasLeast1s(int[][] arr )
    {
        ArrayList<Integer> myBugFix = new ArrayList<Integer>();
        int count = 0;
        int prev = Integer.MAX_VALUE;
        int row = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {



            for(int k = 0 ; k < arr[i].length ; k++)
            {
                if(arr[i][k] == 1)
                count++;
            }


            myBugFix.add(count);

            // if(count == prev)
            // {
            //     System.out.print("Row with the least found \"1\" : ");
            //     System.out.println("NO");
            //     return;
            // }

            // if(count< prev) 
            // {
            //     prev = count;
            //     row = i;
            // }

            count = 0; // reset counter
        }


        System.out.print("Row with the least found \"1\" : ");
        System.out.println("YES, " + (row + 1)); // +1 for convert to Natural number.
        return;
    }











    public static void printArrays(int[][] arr)
    {
        for(int i = 0 ; i< arr.length;i++)
        {
            for(int k = 0 ; k< arr[i].length ; k++)
            {
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

    public static int generateRandomNumber()
    {
        return ((int) (Math.random()*100)) % 2;
    }
    
}
