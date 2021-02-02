import java.util.Scanner;

public class PalindromicPrime {
    public static void main(String args[]) {

        printPrimelindromeChart(100);


    }

    public static void printPrimelindromeChart(int amount)
    {
        printChart(generatePrimelindrome(amount), amount);
    }

    public static int[] generatePrimelindrome(int amount)
    {

        int[] answer = new int[amount];
        int count = 0;
        for(int i = 1 ; ; i++)
        {
            if(isPrimeAndPalindrome(i))
            {
                answer[count] = i;
                count++;
            }
            if(count == amount)
            break;
        }
        return answer;
    }

    public static int getInteger()
    {
        int value = 0;
        Scanner sc = new Scanner(System.in);
        try 
        {
            value = Integer.parseInt(sc.nextLine());
        }
        catch (Exception e)
        {
            System.out.println("PLEASE ENTER INTEGER");
            value = getInteger();
        }
        sc.close();
        return value;
    }
    
    public static boolean printChart(int[] arr , int size)
    {
        int index = 0;
        for(int i = 0 ; i < (size/10) +1; i++)
        {
            for(int k = 0 ; k < 10; k ++)
            {
                System.out.print( arr[index]+ " ");
                index++;
                if(index >= size)
                {
                    return true;
                }
            }
            System.out.println();
        }
        return true;
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
