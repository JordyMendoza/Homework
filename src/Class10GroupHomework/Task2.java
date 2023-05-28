package Class10GroupHomework;
/* hw2
    Create an array of integer values. After the array is
    created, calculate the sum of all stored elements in
    that array. */
public class Task2 {

    public static void main(String[] args) {
        int[] values = {10, 25, 30, 35, 40};
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + values[i];
        }
        System.out.println(sum);
    }
}