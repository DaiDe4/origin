package z23_1;


interface Queue<T> {
    void enqueue(T element);
    T element();
    T dequeue();
    int size();
    boolean isEmpty();
    void clear();
}

