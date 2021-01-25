import java.util.List;
import java.util.ArrayList;

public class MyStringList{
    // Field
    List<String> myList = new ArrayList<String>();

    // Constructor
    public MyStringList() {
    }

    public MyStringList(List<String> myList) {
        for (String element : myList) {
            this.myList.add(element);
        }
    }

    public MyStringList(String[] arr) {
        for (String element : arr) {
            this.myList.add(element);
        }
    }

    public MyStringList(String str) {
        this.myList.add(str);
    }

    // Accessor
    public List<String> getList() {
        return this.myList;
    }

    public String get() {
        return get(0);
    }

    public String get(int index) {
        return this.myList.get(index);
    }

    public boolean isEmpty() {
        if (this.myList.isEmpty()) {
            return true;
        } else
            return false;
    }

    public String asString()
    {
        return this.myList.toString();
    }

    // Modifier
    public void setList(List<String> myList) {
        myList.clear();
        for (String element : myList) {
            this.myList.add(element);
        }
    }

    public void add(String str) {
        this.myList.add(str);
    }

    public void remove() {
        this.remove(0);
    }

    public void remove(int index) {
        this.myList.remove(index);
    }

    public void clear() {
        this.myList.clear();
    }

    public void sort()
    {
        this.myList = sortAlphabetically(this.myList);
    }

    //Static Method
    public static List<String> sortAlphabetically(List<String> myList) {
        ArrayList<String> result = new ArrayList<String>();
        String temp = "";

        while (!myList.isEmpty()) // By the end of the loop myList should be empty.
        {
            temp = myList.get(0); // let temp var be the first element of the list.
            for (int i = 0; i < myList.size(); i++) // Compare element
            {
                temp = whichAlphabeticallyFirst(temp, myList.get(i)); // assign the temp variable be the result of the comparison.
            }
            for (int i = 0; i < myList.size(); i++)// Remove the compared element and add the word to the result
                                                   // alphabetically.
            {
                if (myList.get(i).equals(temp)) // Scan in the list , which element has the same word as "temp" will be
                                                // removed.
                {
                    result.add(myList.get(i)); // Add to the result List.
                    myList.remove(i);
                    break;
                }
            }
        }
        return result;
    }

    public static String whichAlphabeticallyFirst(String a, String b) {
        return whichAlphabeticallyFirst(a, b, 0);
    }

    public static String whichAlphabeticallyFirst(String a, String b, int pos) {
        if (a.equals(b)) // case of a and b is the same string
            return a; // return whatever 'cause they're the same.

        // Check for pos not to exceed the shortest string
        int shorter_length = 0;
        if (a.length() < b.length())
            shorter_length = a.length();
        else if (b.length() < a.length())
            shorter_length = b.length();
        else // length is equal
        {
            shorter_length = a.length();
        }

        // if the pos exceed the limit of shorter_length // EX. AAAaa and AAA
        if (pos >= shorter_length) {
            if (a.length() < b.length())
                return a;
            else if (b.length() < a.length()) {
                return b;
            }
        }

        if (a.charAt(pos) < b.charAt(pos)) // if character at index "pos" has less ascii value that means that character
                                           // comes first alphabetically
        {
            return a;
        } else if (b.charAt(pos) < a.charAt(pos)) {
            return b;
        } else // if the character is the same,at the particular pos, we have to determine
               // which string is longer
        {
            return whichAlphabeticallyFirst(a, b, ++pos);
        }
    }

}
