import java.util.Scanner;

public class MSL {
    public static void main(String args[]) {

        System.out.println("Enter List1 : ");
        int[] list1 = ScannerNextIntArray();
        System.out.println("Enter List2 : ");
        int[] list2 = ScannerNextIntArray();

        // printing sorted merged list
        System.out.println("The merged list is " + intArrayToString(sortIntArray(mergeIntArray(list1, list2))));

    }

    public static int[] ScannerNextIntArray() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); // Get the entire line of out put
        String[] num_split = input.split("\\s+"); // Split String by space separated
        int[] result = new int[num_split.length];
        for (int i = 0; i < num_split.length; i++) {
            try {
                result[i] = Integer.parseInt(num_split[i]);
            } catch (Exception e) {
                break;
            }
        }
        return result;
    }

    public static int[] mergeIntArray(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];

        int i = 0;
        for (; i < a.length; i++) {
            result[i] = a[i];
        }
        for (int num : b) {
            result[i] = num;
            i++;
        }

        return result;

    }

    public static int[] sortIntArray(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array.length - 1; k++) {
                if (array[k] > array[k + 1]) {
                    temp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                }
            }
        }
        return array;
    }

    public static String intArrayToString(int[] arr) {
        String result = "";

        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
            result += " ";
        }

        return result;
    }

}