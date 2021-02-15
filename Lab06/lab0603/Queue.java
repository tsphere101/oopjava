package lab0603;

import java.util.Arrays;

public class Queue {

    int index;
    int[] elements;

    public Queue() {

        this.index= 0;
        elements = new int[index+1];

    }

    // Getters
    public int getSize()
    {
        return elements.length;
    }

    public int getIndex()
    {
        return this.index;
    }

    public int get(int index)
    {
        return elements[index];
    }

    // Methods

    public void enqueue(int v) {
        expandCapacity(index+1);
        elements[index] = v;
        index++;
    }

    public void dequeue()
    {
        dequeue(0);
    }

    public void dequeue(int index_to_remove) {
        if(this.elements == null )
        {
            return;
        }
        int[] new_data = new int[elements.length-1];
        for(int i = 0 , k = 0 ; i< elements.length ; i++)
        {
            if(i == index_to_remove)
            {
                continue;
            }
            new_data[k++] = elements[i];
        }
        this.elements = new_data;
        this.index--;
        if(this.index < 0)
        this.index = 0;

    }


    // isEmpty
    public boolean isEmpty()
    {
        if (this.elements == null || this.getSize() == 0)
        return true;
        else return false;
    }

    // Empty queue
    public void empty()
    {
        while(!this.isEmpty())
        this.dequeue();
    }

    public void showElements() {

        if(this.index == 0 || this.getSize() == 0)
        {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("[");
        System.out.print(this.get(0) );
        for (int i = 1; i < this.getIndex(); i++) {
            System.out.print("," + this.get(i));
        }
        System.out.println("]");
    }


    // Dynamic algorithm
    public void expandCapacity(int min)
    {
        int old = this.getSize();
        if(min >= old)
        {
            int newCapacity = old*2;
            if(newCapacity < min)
            {
                newCapacity = min;
            }
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }




}
