package Class9Homework;
/*Create an array of names and store all names of your group.
Then print your name from that array.
(use 2 different ways of creating an array).
*/


public class Class9hw2 {

    public static void main(String[] args) {

        String[] names={"Jordy","Shirley","Brenda","Javier"};
        System.out.println(names[0]);

        System.out.println("----------------");

        String[] name=new String[names.length];
        name[0]="Shirley";
        name[1]="Brenda";
        name[2]="Jordy";
        name[3]="Javier";
        System.out.println(name[2]);


    }
}
