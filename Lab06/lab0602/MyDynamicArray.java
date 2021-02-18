package lab0602;

public class MyDynamicArray<T> {

    /**
     * Default initial capacity.
     */
    private static final int DEFUALT_CAPACITY = 8;

    /**
     * Allocated slots.
     */
    private int capacity = 0;

    /**
     * The index of the last element in the array.
     */
    private int length;

    /**
     * Array of element.
     */
    private T[] data;

    public MyDynamicArray() {
        this(DEFUALT_CAPACITY);
    }

    public MyDynamicArray(int capacity) {
        if (capacity < 0)
            throw new IllegalArgumentException("Capacity can't be less that 0");
        this.capacity = capacity;
        data = (T[]) new Object[capacity];
    }

    // Get the size of array allocated
    public int getCapacity() { // return the size of memory allocate
        return this.capacity;
    }

    /**
     * Return the specified element by index.
     */
    public T get(int index) {
        return (T) data[index];
    }

    /**
     * Append the specified element to the end of the array.
     * @param element element to be append to the array
     */
    public void add(T element) {
        this.ensureCapacity(this.length+1);
        data[this.length] = element;
        this.length++;
    }

    /**
     * Remove the specified element in the array by index.
     * @param rm_index index of the element in the array to be removed
     */
    public void drop(int rm_index) {
        if (rm_index >= this.length || rm_index < 0)
            throw new IndexOutOfBoundsException();
        for (int i = rm_index; i < this.length - 1; i++) {
            this.data[i] = data[i + 1]; /* Shifting all elements to the left by one, starting from rm_index. */
        }
        T[] new_arr = (T[]) new Object[this.length - 1];
        for (int i = 0; i < this.length - 1; i++) {
            new_arr[i] = this.data[i];
        }
        this.length = this.length - 1;
        this.capacity = this.length;
    }

    /**
     * Remove the last element of the array.
     */
    public void drop() {
        drop(this.getSize() - 1);
    }

    /**
     * Get the number of the elements in the array.
     * @return number of the elements in the array
     */
    public int getSize() {
        return this.length;
    }

    /**
     * Remove all of the elements in the array.
     * This array will be empty after this.
     */
    public void clear() {
        while (!this.isEmpty())
            this.drop();
    }

    /**
     * Return if the array contains no elements.
     * @return true if the array contains no elements.
     */
    public boolean isEmpty() {
        if (this.data == null || this.getSize() == 0)
            return true;
        else
            return false;
    }

    /**
     * Resize and allocate memory double size of the old array.
     */
    public void ensureCapacity(int minCapacity) {
        /* Resize the capacity. */
        if (this.getSize() + 1 >= this.capacity) {
            if (this.capacity == 0) {
                this.capacity = 1;
            } else
                this.capacity *= 2; /* Double the size. */
            T[] new_arr = (T[]) new Object[this.capacity];
            for (int i = 0; i < this.length; i++) {
                new_arr[i] = this.data[i];
            }
            this.data = new_arr;
        }
    }

    public void log() {
        System.out.println("CAPACITY::" + this.getCapacity());
        System.out.println("SIZE::" + this.getSize());
        System.out.println("IS EMPTY::" + this.isEmpty());
    }

}
