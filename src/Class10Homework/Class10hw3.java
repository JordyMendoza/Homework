package Class10Homework;
/* Using 2D array create a grocery list.
Inside you should have an array of veggies, fruits, dairy and sweets.
Retrieve all values from that array using 2 different loops */

public class Class10hw3 {

    public static void main(String[] args) {

        String[][] product= {
                {"lettuce","butter","ice cream","chocolate"},
                {"orange juice", "banana","peppers","milk"}
        };

        for (int i = 0; i < product.length; i++) {
            for (int j = 0; j < product[i].length; j++) {
                System.out.print(product[i][j]+" ");
            }
        }
        System.out.println();

        for (String[] strings : product) {
            for (String string : strings) {
                System.out.print(string+" ");

            }

        }
    }
}
