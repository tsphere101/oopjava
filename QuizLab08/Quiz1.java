import java.util.ArrayList;
import java.util.Scanner;

public class Quiz1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);
        numberList.add(6);
        numberList.add(7);
        numberList.add(8);
        numberList.add(9);

        ArrayList<Integer> inputs = new ArrayList<Integer>();

        System.out.println("Select 5 numbers from the list : ");

        String temp = sc.nextLine();
        String[] num_split = temp.split("\\s+"); // Split String by space separated

        // Checking if the inputs is less than 5
        if (num_split.length < 5) {
            System.out.println("not enough inputs");
            return;
        }

        // not checking if the inputs have exactly 5 numbers.

        for (int i = 0; i < 5; i++) {
            inputs.add(Integer.parseInt(num_split[i]));
        }

        for (int i = 0; i < inputs.size(); i++) {
            for (int k = 0; k < numberList.size(); k++) {
                if (numberList.get(k) == inputs.get(i)) {
                    numberList.remove(k);
                    break;

                }
            }
        }

        System.out.println("The numbers not in the list are :");
        for (int i = 0; i < numberList.size(); i++) {
            System.out.print(numberList.get(i) + " ");
        }

    }

}