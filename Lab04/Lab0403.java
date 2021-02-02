import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;
import java.util.GregorianCalendar;

public class Lab0403 {

    public static void main(String[] args) {

        GregorianCalendar now = new GregorianCalendar();

        StopWatch watch_sort = new StopWatch();
        StopWatch watch_palin_gen = new StopWatch();

        // Creating a 1000-elements list...
        System.out.println("Creating a 1000-elements list...");
        ArrayList<Double> myList = getList(1000);
        // print list
        System.out.println(myList.toString());
        // List created
        System.out.println("List created.");

        // Sorting stopwatch starts...
        watch_sort.start();
        Collections.sort(myList);
        System.out.println(myList.toString());
        // Sorted complete
        System.out.println("Sorting Completed");
        System.out.println("Sorting stopwatch stoped.");
        watch_sort.stop();
        System.out.println("The sort time is " + watch_sort.getElapseTime() + " Millisecond");

        // Palindrom

        // The parindrom stop watch start
        System.out.println("The PalindromePrime stopwatch starts...");
        watch_palin_gen.start();
        System.out.println("Creating 100 PalindromPrime...");
        // Create the 1000 palindromprime and print out

        printPrimePalinChart(100);

        // finished
        System.out.println("PalindromePrime Created.");
        // Stop the watch
        watch_palin_gen.stop();
        System.out.println("The PalindromePrime stopwatch stoped.");
        System.out.println("The PalindromePrime time is " + watch_palin_gen.getElapseTime() + " Millisecond");
    }

    public static ArrayList<Double> getList(int amount) {
        ArrayList<Double> result = new ArrayList<Double>();
        for (int i = 0; i < amount; i++) {
            result.add(genRandomDouble());
        }
        return result;
    }

    public static double genRandomDouble() {
        return Math.round(1000 * Math.random() * 100) / 100.0;
    }

    
    public static void printPrimePalinChart(int amount)
    {
        int count = 0;
        for(int i = 2 ; count < amount; i++)
        {
            if(isPrimeAndPalindrome(i))
            {
                System.out.print(i + " ");
                count++;
            }
        }
    }
    

    public static boolean isPrimeAndPalindrome(int value)
    {
        if(isPalindrome(value) && isPrime(value))
        return true;
        else return false;
    }

    public static boolean isPrime(int value)
    {
        if (value == 1)
        return false;
        for(int i = 2; i <= value/2 ; i++)
        {
            if(value % i == 0)
            return false;
        }
        return true;
    }

    public static boolean isPalindrome(int value)
    {
        String string_val = Integer.toString(value);

        for(int i = 0 ; i <= string_val.length() / 2; i ++)
        {
            if(string_val.charAt(i)!= string_val.charAt(string_val.length()-1-i))
            {
                return false;
            }
        }
        return true;
    }

    

    

    

}
