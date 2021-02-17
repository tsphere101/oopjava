package lab0603;

/**
 * 
 * A simple queue-like dynamic array for Integer.
 * 
 */

import java.util.Arrays;

public class Queue {

    /**
     * Index that keep track of the last element in the array.
     */
    int index;

    /**
     * Arrays of the integer.
     */
    int[] elements;

    /**
     * Construct an array and set the index pointing to 0 position of the array,
     * reseved 2 blocks of memory.
     */
    public Queue() {
        this.index = 0;
        elements = new int[index + 1];
    }

    /**
     * Get the size of memory reserved.
     * 
     * @return Amount of reserved blocks in the array
     */
    public int getSize() {
        return elements.length;
    }

    /**
     * Get the last data stored in the array. (Array length).
     * 
     * @return the length of the array
     */
    public int getIndex() {
        return this.index;
    }

    /**
     * Get the element by index.
     * 
     * @param index index of the element in the array
     * @return data stores in the specified index in the array
     */
    public int get(int index) {
        return elements[index];
    }

    /**
     * Add element to the array.
     * 
     * @param v integer data to add to the array
     */
    public void enqueue(int v) {
        expandCapacity(index + 1);
        elements[index] = v;
        index++;
    }

    /**
     * Remove the first element in the array (the index 0).
     */
    public void dequeue() {
        dequeue(0);
    }

    /**
     * Remove the specified element in the array
     * 
     * @param index_to_remove index of element in the array
     */
    public void dequeue(int index_to_remove) {
        if (this.elements == null) {
            return;
        }
        int[] new_data = new int[elements.length - 1];
        for (int i = 0, k = 0; i < elements.length; i++) {
            if (i == index_to_remove) {
                continue;
            }
            new_data[k++] = elements[i];
        }
        this.elements = new_data;
        this.index--;
        if (this.index < 0)
            this.index = 0;

    }

    /**
     * Return true if the array is null or size = 0.
     */
    public boolean isEmpty() {
        if (this.elements == null || this.getSize() == 0)
            return true;
        else
            return false;
    }

    /**
     * Remove all elements in the array.
     */
    public void empty() {
        while (!this.isEmpty())
            this.dequeue();
    }

    /**
     * Print all elements in the array.
     */
    public void showElements() {

        if (this.index == 0 || this.getSize() == 0) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("[");
        System.out.print(this.get(0));
        for (int i = 1; i < this.getIndex(); i++) {
            System.out.print("," + this.get(i));
        }
        System.out.println("]");
    }

    /**
     * Allocate a double-size memory for the array.
     * 
     * @param min amount of the element to store in the array
     */
    public void expandCapacity(int min) {
        int old = this.getSize();
        if (min >= old) {
            int newCapacity = old * 2;
            if (newCapacity < min) {
                newCapacity = min;
            }
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

}
