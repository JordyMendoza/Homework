package Class10GroupHomework;
/*  Create a 2D array of integers. Develop a program
which will calculate the sum of even and odd numbers
for that array. */

public class Task4 {

    public static void main(String[] args) {

        int[][] numbers = {{20, 32, 46, 58},
                {23, 35, 49, 53},
                {3,7,9,3}};

        int sum=0;
        int sum1=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j]%2==0) {
                    sum=sum+numbers[i][j];
                }else {sum1=sum1+numbers[i][j];

                }
            }

        }System.out.println("The sum of even numbers is "+sum);
        System.out.println("The sum of odd numbers is "+sum1);
    }
}