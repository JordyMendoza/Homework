package Class10Homework;
/* Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
Develop a program which will identify/print the even numbers only. */

public class Class10hw5 {

    public static void main(String[] args) {

        int[][] num = {
                {14,15,16,77},
                {22,53,19,42},
                {52,156,65,99},
        };

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if(num[i][j]%2==0){
                    System.out.print(num[i][j]+" ");
                }
            }
        }
    }
}
