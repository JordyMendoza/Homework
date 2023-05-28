package Class10GroupHomework;
/* Create a program that uses an array to store a list of
    temperatures for a week, and then uses a loop to find
    the highest and lowest temperature for the week. */


public class Task1 {
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


}

