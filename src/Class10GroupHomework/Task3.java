package Class10GroupHomework;
/*  Create a 2D array or integer type where you will store
odd and even numbers. Develop a program which will
identify/print the even numbers only. */

public class Task3 {

    public static void main(String[] args) {

        int[][] numbers={{2,4,6,8},
                {3,5,7,9}};
        //int even=0;
        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers[i].length; j++){
                if (numbers[i][j]%2==0){
                    System.out.print(numbers[i][j]+" ");
                }
            }
        }
    }
}
