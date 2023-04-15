package ReplitHomework;

/*Write a program to print the perimeter and area of a rectangle with width = 5 and height = 8.

**Output:**

```
The perimeter of a rectangle with width __ and height __ is equals to __ and the area equals to __
```*/

public class HW11ArithmeticOperations {

    public static void main(String[] args) {

        int width=5;
        int height=8;

        int perimeter=(height+width)*2;
        int area=width*height;

        System.out.println("The perimeter of a rectangle " + "with " + "width "+width+" " +
                "and " + "height "+height+" is equals to "+perimeter+" and the area equals to "+area+"");
    }
}
