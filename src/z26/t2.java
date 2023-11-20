package z26;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class t2 {

    public class CustomList<T> implements Iterable<T> {
        private Node<T> head;
        private int size;

        public CustomList() {
            head = null;
            size = 0;
        }

        public void add(T value) {
            Node<T> newNode = new Node<>(value);
            if (head == null) {
                head = newNode;
            } else {
                Node<T> current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
            size++;
        }

        public T get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException();
            }
            Node<T> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.value;
        }

        public int size() {
            return size;
        }

        @Override
        public Iterator<T> iterator() {
            return new CustomListIterator();
        }

        private class CustomListIterator implements Iterator<T> {
            private Node<T> current;

            public CustomListIterator() {
                current = head;
            }

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T value = current.value;
                current = current.next;
                return value;
            }
        }

        private static class Node<T> {
            private T value;
            private Node<T> next;

            public Node(T value) {
                this.value = value;
                next = null;
            }
        }
    }
    public void main(String[] args) {
        CustomList<String> list = new CustomList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
