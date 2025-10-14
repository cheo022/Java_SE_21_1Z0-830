package basic_java.comments;

public class JavaComments {
    /*
     * This is multi-line comment in java
     *
     * */

    /**
     * @param args
     */
    public static void main(String[] args) {
        // this is a single-line comment in java
        // Print hello word Developers
        System.out.println("hello word Developers");
/*
        int x = 4;
        int y = 3;
        int z = 0;
        z = x + y;
        System.out.println("z = " + z);*/
        System.out.println("z = " + doMultiplication(3, 4));
    }

    /**
     * This method multipliex two integer values
     *
     * @param x first parameter
     * @param y second parameter
     * @return
     */
    public static int doMultiplication(int x, int y) {
        return x + y;
    }
}
