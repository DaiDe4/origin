package z23_1;

public class QueueTests {
    public void main(String[] args) {
        testArrayQueueModule();
        testArrayQueueADT();
        testArrayQueue();
    }

    private void testArrayQueueModule() {
        assert ArrayQueueModule.size() == 2;
        assert ArrayQueueModule.size() == 1;
        ArrayQueueModule.clear();
        assert ArrayQueueModule.isEmpty();
    }

    private void testArrayQueueADT() {
        ArrayQueueADT<Integer> queue = new ArrayQueueADT<>();
        queue.enqueue(1);
        queue.enqueue(2);
        assert queue.size() == 2;
        assert queue.element() == 1;
        assert queue.dequeue() == 1;
        assert queue.size() == 1;
        queue.clear();
        assert queue.isEmpty();
    }

    private void testArrayQueue() {
        Queue<Integer> queue = new ArrayQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        assert queue.size() == 2;
        assert queue.element() == 1;
        assert queue.dequeue() == 1;
        assert queue.size() == 1;
        queue.clear();
        assert queue.isEmpty();
    }
}