package Class9Homework;
/*From an array of integer elements find the largest number
 */
public class Class9hw7 {

    public static void main(String[] args) {

        int[] a={1,2,3,8,5};
        int max=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){
                max=a[i];
            }

        }
        System.out.println(max);


    }
}