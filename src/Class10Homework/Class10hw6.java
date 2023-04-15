package Class10Homework;
/* Create 2D array of countries:
north america countries, south america countries, europe countries, asian countries, african countries.
Then print all values from that array using 2 different loops and calculate how many total countries been stored. */

public class Class10hw6 {

    public static void main(String[] args) {

        String[][] countries ={
                {"Mexico", "USA", "Canada"},
                {"Ecuador", "Argentina", "Bolivia", "Chile"},
                {"Germany", "Poland", "Hungary", "Italy"},
                {"Japan", "China", "Mongolia", "South Korea"},
                {"Morocco", "Libya", "Sudan", "Mali"}
        };

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+" ");
            }
        }
        System.out.println();


        for (String[] country : countries) {
            for (String s : country) {
                System.out.print(s+" ");
            }
        }
        System.out.println();

        int sum = 0;
        for (int a = 0; a < countries.length; a++) {
            for (int b = 0; b < countries[a].length; b++) {
                sum++;
            }
        }
        System.out.println(sum);


    }

}
