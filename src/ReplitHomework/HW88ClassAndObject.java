package ReplitHomework;
/*
Create a Class Main

In this class, you should specify the following attributes:
breed, name, color
and following behaviors:
bark(), run(), play().

Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.

The output of the program should be as following:



```
Husky can bark
```

```
Husky can run
```

```
Husky can play
```

```
Bulldog can bark
```

```
Bulldog can run
```

```
Bulldog can play
```

```
Labrador can bark
```

```
Labrador can run
```

```
Labrador can play
```
 */

public class HW88ClassAndObject {

    public static void main(String[] args) {
        HW88Main husky = new HW88Main();
        husky.breed = "Husky";
        husky.name = "Max";
        husky.color = "White and black";

        HW88Main bulldog = new HW88Main();
        bulldog.breed = "Bulldog";
        bulldog.name = "Rocky";
        bulldog.color = "Brown";

        HW88Main labrador = new HW88Main();
        labrador.breed = "Labrador";
        labrador.name = "Buddy";
        labrador.color = "Golden";

        husky.bark();
        husky.run();
        husky.play();

        bulldog.bark();
        bulldog.run();
        bulldog.play();

        labrador.bark();
        labrador.run();
        labrador.play();
    }
}
