package ReplitHomework;
/*
Write a program that creates an array of integers of size 11.
Add the years 2010 to 2020 to your array one by one using a for loop and then print all those values.

**Example:**

```
2010
```

```
2011
```

```
2012
```

```
2013
```

```
2014
```

```
2015
```

```
2016
```

```
2017
```

```
2018
```

```
2019
```

```
2020
```
 */

public class HW74Arrays {

    public static void main(String[] args) {

        int [] year=new int[11];
        for (int i = 0; i < year.length; i++) {
            System.out.println(2010+i);

        }

    }
}