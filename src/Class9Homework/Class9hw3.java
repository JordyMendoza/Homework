package Class9Homework;
/*Create an array of words: Java, Saturday, day, coding, is.
Print the following sentence using elements of array:
 “Saturday is Java coding day”.
*/

public class Class9hw3 {

    public static void main(String[] args) {

        String[] words={"Java ","Saturday ","Day ","Coding ","is "};
        System.out.println(words[1]+words[4]+words[0]+words[3]+words[2]);

        System.out.println("-----------------------");

        String[] wrd= new String[5];
        wrd[0]="Java ";
        wrd[1]="Saturday ";
        wrd[2]="Day ";
        wrd[3]="Coding ";
        wrd[4]="is ";
        System.out.println(wrd[1]+wrd[4]+wrd[0]+wrd[3]+wrd[2]);

    }
}