
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class CitySorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStringList myList = new MyStringList();

        System.out.println("Enter the first city :");
        myList.add(sc.nextLine());
        System.out.println("Enter the second city :");
        myList.add(sc.nextLine());
        System.out.println("Enter the third city:");
        myList.add(sc.nextLine());

        System.out.println(myList.asString());
        myList.sort();
        System.out.println(myList.asString());
    }

}