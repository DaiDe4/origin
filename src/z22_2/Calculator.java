package z22_2;

public class Calculator {
    public static void main(String[] args) {
        CalModel model = new CalModel();
        CalView view = new CalView();
        CalControl control = new CalControl(model, view);
    }
}

