import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String first = "";
        String second = "";
        String third = "";

        List<String> myList = new ArrayList<String>();
        List<String> sortedList = new ArrayList<String>();
        System.out.println("Enter the First city: ");
        myList.add(sc.nextLine());
        System.out.println("Enter the Second city: ");
        myList.add(sc.nextLine());
        System.out.println("Enter the Third city: ");
        myList.add(sc.nextLine());

        String temp = "";
        for(int i = 0 ; i < myList.size() ; i ++)
        {
            temp = myList.get(0);
            temp = whichComesFirst(myList.get(i), temp);
        }
        sortedList.add(temp);
        for(int i = 0 ; i < myList.size() ; i ++)
        {
            temp = myList.get(0);
            temp = whichComesFirst(myList.get(i), temp);
        }
        sortedList.add(temp);
        for(int i = 0 ; i < myList.size() ; i ++)
        {
            temp = myList.get(0);
            temp = whichComesFirst(myList.get(i), temp);
        }
        sortedList.add(temp);

        for(int i = 0 ; i < sortedList.size() ; i++)
        {
            System.out.println("The three cities in alphabetical order are " + sortedList.get(0) + " " + sortedList.get(1) + " " + sortedList.get(2));
        }

    }

    public static String whichComesFirst(String a , String b)
    {
        if(a.equals(b))
        return a;
        if(a.charAt(0) < b.charAt(0))
        {
            return a;
        }
        else if (a.charAt(0) > b.charAt(0))
        {
            return b;
        }
        else {
            if(whichComesFirst(a.substring(1),b.substring(1)).equals(a.substring(1)))
            {
                return a;
            }
            else return b;
        }



    }

    
}
