package ReplitHomework;
/*
Write a program that prints the total number of elements that are negative AND odd

**Output:**
for example -3 is both negative and odd

```
3
```
 */

public class HW84TwoDArray {

    public static void main(String[] args)
    {
        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };

        int count =0;  // initialize a counter for negative and odd elements

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j]<0 && a[i][j]%2!=0){
                    count++;  // increment the counter if the element is negative and odd
                }
            }
        }
        System.out.println(count);
    }
}