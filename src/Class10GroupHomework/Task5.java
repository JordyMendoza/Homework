package Class10GroupHomework;
/*  Write a program to swap 2 numbers without a
temporary variable?
 */

public class Task5 {
    public static void main(String[] args) {

        int a=23;
        int b=65;
        System.out.println("a = " + a);
        System.out.println("b = "+b);
        System.out.println();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);

    }
}
