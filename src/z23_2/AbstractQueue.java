package z23_2;

public abstract class AbstractQueue<T> implements Queue<T> {
    protected int size;

    public AbstractQueue() {
        size = 0;
    }

    @Override
    public abstract void enqueue(T element);

    @Override
    public abstract T dequeue();

    @Override
    public abstract T element();

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public abstract void clear();
}