package Class9Homework;
/*Create an array of animals and store 5 elements into it.
Using 2 different loops print all elements from the array.
*/
public class Class9hw5 {

    public static void main(String[] args) {

        String[] animals={"dog","cat","bird","fish","snake"};

        for (String ani: animals){
            System.out.println(ani);
        }

        System.out.println();

        int counter=0;

        while (counter< animals.length){
            System.out.println(animals[counter]);
            counter++;
        }


    }
}