package Class9Homework;
/*Create an array to store char values and then print those in reverse order
 */
public class Class9hw8 {

    public static void main(String[] args) {

        char[] new1={'a','b','c','d'};
        for (int i = new1.length-1; i >=0 ; i--) {
            System.out.println(new1[i]);

        }
    }
}