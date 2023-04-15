package Class9Homework;
/*Create an array of cars and store 6 elements into it.
Using 2 different loops print all values from the array.
*/
public class Class9hw4 {

    public static void main(String[] args) {

        String[] cars={"Honda","Acura","Ford","Nissan","Toyota","Chevy"};


        for (String car: cars){
            System.out.println(car);
        }
        System.out.println();

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);

        }


    }
}