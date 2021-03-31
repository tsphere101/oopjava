package lab0901;

import java.io.File;
import java.lang.Exception;
import java.util.Scanner;

public class MyMain {

    public static void main(String[] args) {

        File captain = new File("CaptainIsAwesome.txt");
        Scanner readFile = new Scanner("CaptainIsAwesome.txt");

        if(captain.canRead())
        {
            System.out.println(readFile);
        }
        else{ System.out.println("Can'nt read file.");}



    }

}
