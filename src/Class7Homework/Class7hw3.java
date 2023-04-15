package Class7Homework;
/* Print even numbers from 20 to 1 (2 ways) */

public class Class7hw3 {

    public static void main(String[] args) {

        for (int i = 20; i >= 1; i--) {
            if (i%2==0)
            System.out.print(i+" ");
        }

        System.out.println();
            // 2nd way
        int j=20;
        while (j>=1){
            if (j%2==0){
                System.out.print(j+" ");
            }j--;
        }
    }


}
