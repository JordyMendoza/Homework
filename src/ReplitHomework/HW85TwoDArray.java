package ReplitHomework;
/*
Write a program that sums all numbers that are on even index and on even row.

**Expected Output:**

```
-4
```
 */

public class HW85TwoDArray {

    public static void main(String[] args) {
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        int sum=0;  // initialize a running total for even indexed and even-row elements

        for (int i = 0; i < a.length; i++) {
            if (i%2==0){  // check if the row index is even
                for (int j = 0; j < a[i].length; j++) {
                    if (j%2==0){   // check if the column index is even
                        sum+=a[i][j];  // add the element to the running total
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
