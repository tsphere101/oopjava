package lab0602;

import java.util.Arrays;

public class MyDynamicArray<T> {
    
    /**
     * Default initial capacity.
     */
    private final int DEFUALT_CAPACITY = 8;
    
    /**
     * The index of the last element in the array.
     */
    private int size;

    /**
     * Array of element.
     */
    private Object[] data;

    public MyDynamicArray() {
        this(0);
    }
    public MyDynamicArray(int size) {
        this.size = size;
        data = new Object[size+1]; // Init Object array
    }

    // Get the size of array allocated
    public int getCapacity() { // return the size of memory allocate
        return data.length;
    }

    // Get element from the array by index
    public T get(int index) {
        return (T) data[index];
    }

    // Add new element to the array
    public void add(Object element) {
        ensureCapacity(size + 1);
        data[size] = element;
        size++;
    }

    // Remove element in array by index
    public void drop(int index) {
        if(this.data == null || index < 0 || index>=this.getSize())
        {
            return;
        }
        ensureCapacity(size - 1);
        Object[] new_data = new Object[data.length - 1];
        for (int i = 0, k = 0; i < data.length; i++) {
            if (i == index) {
                continue;
            }
            new_data[k++] = data[i];
        }
        this.data = new_data;
        this.size--;
    }
    // Overloading drop() method
    public void drop()
    {
        drop(this.getSize()-1);
    }

    // Get amount of elements in the array
    public int getSize() { // return the amount of the elements
        int i;
        for(i = 0 ; i < this.size && data[i] != null ; i++)
        {
        }
        return i;
    }
    
    // Remove All elements in the array
    public void clear() {
        while(!this.isEmpty())
            this.drop();
    }


    // is Empty
    public boolean isEmpty()
    {
        if(this.data == null || this.getSize() == 0)
        return true;
        else return false;
    }


    // Dynamic Memnory Allocate :: ensureCapacity
    public void ensureCapacity(int minCapacity) {
        int old_capacity = getCapacity();
        if (minCapacity >= old_capacity) {
            int newCapacity = old_capacity * 2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            data = Arrays.copyOf(data, newCapacity);
        }
    }
    



    // Function to remove the element
    public static Object[] removeTheElement(Object[] arr, int index) {

        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null || index < 0 || index >= arr.length) {

            return arr;
        }

        // Create another array of size one less
        Object[] anotherArray = new Object[arr.length - 1];

        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {

            // if the index is
            // the removal element index
            if (i == index) {
                continue;
            }

            // if the index is not
            // the removal element index
            anotherArray[k++] = arr[i];
        }

        // return the resultant array
        return anotherArray;
    }
}
