package z23_1;

import java.util.Arrays;

class ArrayQueueModule<T> {
    private static Object[] elements = new Object[1];
    private static int size = 0;
    private static int head = 0;

    private void ensureCapacity() {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, 2 * size);
            head = 0;
        }
    }

    public void enqueue(T element) {
        ensureCapacity();
        int tail = (head + size) % elements.length;
        elements[tail] = element;
        size++;
    }

    @SuppressWarnings("unchecked")
    public T element() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return (T) elements[head];
    }

    @SuppressWarnings("unchecked")
    public T dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        T element = (T) elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return element;
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        elements = new Object[1];
        size = 0;
        head = 0;
    }
}
