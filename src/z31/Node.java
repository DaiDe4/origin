package z31;

public class Node {
    int key;
    String processorName;
    double clockSpeed;
    int cacheSize;
    double busFrequency;
    int specInt;
    int specFp;
    Node left, middle, right;

    public Node(int key, String processorName, double clockSpeed, int cacheSize, double busFrequency, int specInt,
                int specFp) {
        this.key = key;
        this.processorName = processorName;
        this.clockSpeed = clockSpeed;
        this.cacheSize = cacheSize;
        this.busFrequency = busFrequency;
        this.specInt = specInt;
        this.specFp = specFp;
        this.left = this.middle = this.right = null;
    }
}