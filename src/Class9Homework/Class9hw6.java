package Class9Homework;
/*Create an array on integers
        and calculate the sum of all elements in an array
         */
public class Class9hw6 {

    public static void main(String[] args) {

        int[] a={1,2,3,4,5};
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum=a[i]+sum;
        }
        System.out.println(sum);
    }
}