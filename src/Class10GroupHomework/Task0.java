package Class10GroupHomework;
/*  hw 5
Write a program to swap 2 numbers without a
temporary variable?
 */

public class Task0 {

}






    /*  hw 4

    Create a 2D array of integers. Develop a program
which will calculate the sum of even and odd numbers
for that array. */

  /*  public static void main(String[] args) {

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
}   */


/* hw3
    Create a 2D array or integer type where you will store
odd and even numbers. Develop a program which will
identify/print the even numbers only.



    public static void main(String[] args) {

        int[][] numbers={{2,4,6,8},
                         {3,5,7,9}};
        int even=0;
        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers[i].length; j++){
                if (numbers[i][j]%2==0){
                    System.out.print(numbers[i][j]+" ");
                }

            }

        }


    }




}

    /* hw2
    Create an array of integer values. After the array is
    created, calculate the sum of all stored elements in
    that array.

    public static void main(String[] args) {
        int[] values = {10, 25, 30, 35, 40};
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + values[i];
        }
        System.out.println(sum);
    }
}   */


/* HW1     Create a program that uses an array to store a list of
    temperatures for a week, and then uses a loop to find
    the highest and lowest temperature for the week. *

    public static void main(String[] args) {

        int[] temp= {70,80,90,10};
        int high=0;
        for (int i = 0; i < 4; i++){
            if (temp[i]>high){
                high=temp[i];
            }
        }
        System.out.println("The highest temperature is "+high+"");

        int low=0;
        for (int i = 0; i < 4; i++) {
            low=temp[i];
        }
        System.out.println("The lowest temperature is "+low+"");
    }


} */