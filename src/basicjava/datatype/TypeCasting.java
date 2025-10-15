package basicjava.datatype;

public class TypeCasting {
    public static void main(String[] args) {
        int a = 124;
        long b = a;
        double d = b;

        System.out.println("int value " + a);
        System.out.println("long value " + b);
        System.out.println("double value " + d);

        System.out.println("--------------------------");

        double dbl = 135.35;
        long lng = (long) dbl;
        byte byt = (byte) lng;

        System.out.println("double value: " + dbl);
        System.out.println("long value: " + lng);

        // this is because ew try to convert a large number to a small number
        System.out.println("byte value: " + byt); // This resulted in some data loss

    }
}
