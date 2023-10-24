package z3;

public class Obolo4ki {
    public static void main(String[] args) {
        String n = "456.345";
        double d1 = Double.valueOf(4.54);
        double d2 = Double.valueOf("346457.1");
        double d3 = Double.valueOf(n);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println();

        double d4 =  Double.parseDouble(n);
        System.out.println(d4);
        System.out.println();

        Double d5 = 3.1415;
        byte b1 = d5.byteValue();
        double d6 = d5.doubleValue();
        float f1 = d5.floatValue();
        int i1 = d5.intValue();
        long l1 = d5.longValue();
        short s1 = d5.shortValue();
        System.out.println(d5);
        System.out.println(b1);
        System.out.println(i1);
        System.out.println(d6);
        System.out.println(f1);
        System.out.println(l1);
        System.out.println(s1);
        System.out.println();

        String s2 = Double.toString(d5);
        System.out.println(s2);
    }
}
