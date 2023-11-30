package z23_2;

public interface Queue<T> {
    void enqueue(T element);

    T dequeue();

    T element();

    boolean isEmpty();

    int size();

    void clear();
}