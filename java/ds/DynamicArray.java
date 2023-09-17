package ds;

public class DynamicArray<T> {
    private T[] arr;
    private int size;
    private int capacity;

    public DynamicArray() {
        this(10);
    }

    public DynamicArray(int initSize) {
        // using reflection API to get rit of the warning.
        this.arr = (T[]) new Object[initSize];
    }

    public int size() {
        return this.size;
    }

    public void add() {

    }

    public void get() {

    }

    public void set() {

    }

    public void clear() {

    }

    // TOOD
    public boolean removeAt(T obj) {
        return false;
    }

    // TOOD
    public boolean remove(T obj) {
        return false;
    }

    // TODO
    public int indexOf(T obj) {
        return -1;
    }

    // TODO
    public boolean contains(T obj) {
        return false;
    }

    // TODO
    // public Iterator iterator() {
    // return
    // }

    // TODO
    public String toString() {
        return "";
    }

    public boolean isEmpty() {
        if (this.size == 0)
            return true;

        return false;
    }
}