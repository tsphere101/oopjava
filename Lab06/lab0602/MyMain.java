package lab0602;

import java.util.Scanner;
public class MyMain {
    public static void main(String[] args) {

        MyDynamicArray<String> da = new MyDynamicArray<String>();

        da.add("Hello");
        da.add("A1");
        da.drop(0);
        da.add("aaa");
        da.add("Love");
        da.clear();


        System.out.println("Size is :" + da.getSize());
        System.out.println("Capacity is : " + da.getCapacity());


        for(int i =0 ; i < da.getSize() && da.get(i) != null ; i++)
        {
            System.out.println(da.get(i));
        }
        
    }
}