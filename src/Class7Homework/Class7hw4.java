package Class7Homework;
/* Print odd numbers between 20 and 50 (2 ways) */

public class Class7hw4 {


    public static void main(String[] args) {
        for (int i = 20; i <=50; i++) {
            if (i%2==1){ // (i%2==0) makes it even
                System.out.print(i+" ");
            }
        }
        System.out.println();

        int num1=20;
        while (num1<=50){
            if (num1%2==1){
            System.out.print(num1+" ");
            }num1++;
        }
    }
}
