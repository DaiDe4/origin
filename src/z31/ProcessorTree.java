package z31;

import java.io.*;
import java.util.Scanner;


class ProcessorTree {
    Node root;

    public ProcessorTree() {
        this.root = null;
    }

    public void insert(int key, String processorName, double clockSpeed, int cacheSize, double busFrequency,
            int specInt, int specFp) {
        root = insertRec(root, key, processorName, clockSpeed, cacheSize, busFrequency, specInt, specFp);
    }

    private Node insertRec(Node root, int key, String processorName, double clockSpeed, int cacheSize,
            double busFrequency, int specInt, int specFp) {
        if (root == null) {
            return new Node(key, processorName, clockSpeed, cacheSize, busFrequency, specInt, specFp);
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key, processorName, clockSpeed, cacheSize, busFrequency, specInt, specFp);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key, processorName, clockSpeed, cacheSize, busFrequency, specInt,
                    specFp);
        } else {
            System.out.println("Record with key " + key + " already exists. Cannot add duplicate records.");
        }
        return root;
    }

    public void delete(int key) {
        root = deleteRec(root, key);
    }

    private Node deleteRec(Node root, int key) {
        if (root == null) {
            System.out.println("Record with key " + key + " not found.");
            return null;
        }

        if (key < root.key) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.key) {
            root.right = deleteRec(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.key = minValue(root.right);
            root.right = deleteRec(root.right, root.key);
        }

        return root;
    }

    private int minValue(Node root) {
        int minValue = root.key;
        while (root.left != null) {
            minValue = root.left.key;
            root = root.left;
        }
        return minValue;
    }

    public void printTree(int order) {
        switch (order) {
            case 1:
                printLevelOrderLeftToRightBottomUp(root);
                break;
            case 2:
                printLevelOrderLeftToRightTopDown(root);
                break;
            case 3:
                printTreeLeftMiddleRight(root);
                break;
            case 4:
                printTreeRootLeftMiddleRight(root);
                break;
            case 5:
                printTreeLeftMiddleRightWithLevel(root, 1);
                break;
            case 6:
                printTreeRootLeftMiddleRightWithLevel(root, 1);
                break;
            default:
                System.out.println("Invalid print order.");
        }
    }

    private void printLevelOrderLeftToRightBottomUp(Node root) {
        int height = getHeight(root);

        for (int i = height; i >= 1; i--) {
            System.out.println();
        }
    }

    private void printLevelOrderLeftToRightTopDown(Node root) {
        int height = getHeight(root);

        for (int i = 1; i <= height; i++) {
            System.out.println();
        }
    }

    private void printTreeLeftMiddleRight(Node root) {
        if (root != null) {
            printTreeLeftMiddleRight(root.left);
            System.out.print(root.key + " ");
            printTreeLeftMiddleRight(root.middle);
            System.out.print(root.key + " ");
            printTreeLeftMiddleRight(root.right);
        }
    }

    private void printTreeRootLeftMiddleRight(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            printTreeRootLeftMiddleRight(root.left);
            System.out.print(root.key + " ");
            printTreeRootLeftMiddleRight(root.middle);
            System.out.print(root.key + " ");
            printTreeRootLeftMiddleRight(root.right);
        }
    }

    private void printTreeLeftMiddleRightWithLevel(Node root, int level) {
        if (root != null) {
            printTreeLeftMiddleRightWithLevel(root.left, level + 1);
            System.out.println(root.key + " (Level " + level + ")");
            printTreeLeftMiddleRightWithLevel(root.middle, level + 1);
            System.out.println(root.key + " (Level " + level + ")");
            printTreeLeftMiddleRightWithLevel(root.right, level + 1);
        }
    }

    private void printTreeRootLeftMiddleRightWithLevel(Node root, int level) {
        if (root != null) {
            System.out.println(root.key + " (Level " + level + ")");
            printTreeRootLeftMiddleRightWithLevel(root.left, level + 1);
            System.out.println(root.key + " (Level " + level + ")");
            printTreeRootLeftMiddleRightWithLevel(root.middle, level + 1);
            System.out.println(root.key + " (Level " + level + ")");
            printTreeRootLeftMiddleRightWithLevel(root.right, level + 1);
        }
    }

    private int getHeight(Node root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = getHeight(root.left);
            int middleHeight = getHeight(root.middle);
            int rightHeight = getHeight(root.right);

            return Math.max(leftHeight, Math.max(middleHeight, rightHeight)) + 1;
        }
    }
    public void writeToFile(Node root, BufferedWriter writer) throws IOException {
        if (root != null) {
            writeToFile(root.left, writer);
            writer.write(root.key + ", " + root.processorName + ", " + root.clockSpeed + ", " + root.cacheSize + ", " +
                    root.busFrequency + ", " + root.specInt + ", " + root.specFp + "\n");
            writeToFile(root.middle, writer);
            writeToFile(root.right, writer);
        }
    }

    public void executeCommand(String command, Scanner scanner) {
        switch (command.toUpperCase()) {
            case "L":
                int printOrder = getPrintOrder(scanner);
                printTree(printOrder);
                break;
            case "D":
                int deleteKey = getRecordKey(scanner, "delete");
                delete(deleteKey);
                break;
            case "A":
                int addKey = getRecordKey(scanner, "add");
                if (search(root, addKey) == null) {
                    addRecord(scanner, addKey);
                } else {
                    System.out.println("Record with key " + addKey + " already exists. Cannot add duplicate records.");
                }
                break;
            case "S":
                break;
            case "E":
                System.out.println("Exiting the program.");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid command. Please enter a valid command.");
        }
    }

    private int getPrintOrder(Scanner scanner) {
        System.out.println("Enter the print order (1-6): ");
        int printOrder = scanner.nextInt();
        while (printOrder < 1 || printOrder > 6) {
            System.out.println("Invalid print order. Please enter a valid print order (1-6): ");
            printOrder = scanner.nextInt();
        }
        return printOrder;
    }

    private int getRecordKey(Scanner scanner, String action) {
        System.out.println("Enter the key of the record to " + action + ": ");
        return scanner.nextInt();
    }

    private void addRecord(Scanner scanner, int key) {
        System.out.println("Enter processor name: ");
        String processorName = scanner.next();

        System.out.println("Enter clock speed (GHz): ");
        double clockSpeed = scanner.nextDouble();

        System.out.println("Enter cache size (KB): ");
        int cacheSize = scanner.nextInt();

        System.out.println("Enter bus frequency (GHz): ");
        double busFrequency = scanner.nextDouble();

        System.out.println("Enter SPECint result: ");
        int specInt = scanner.nextInt();

        System.out.println("Enter SPECfp result: ");
        int specFp = scanner.nextInt();

        insert(key, processorName, clockSpeed, cacheSize, busFrequency, specInt, specFp);
        System.out.println("Record added successfully.");
    }

    private Node search(Node root, int key) {
        if (root == null || root.key == key) {
            return root;
        }

        if (key < root.key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }

    }

    public static void main(String[] args) {
        ProcessorTree processorTree = new ProcessorTree();
        try (Scanner scanner = new Scanner(System.in)) {

            while (true) {
                System.out.println("Enter command (L/D/A/S/E): ");
                String command = scanner.next();
                processorTree.executeCommand(command, scanner);
            }
        }
    }
}