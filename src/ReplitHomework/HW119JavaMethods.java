package ReplitHomework;
/*
Write a method header with the following specs:


Returns:

```
a String
```

Name:

```
censorLetter
```

Parameters:

```
a String
```

```
a char
```

Then complete the method by programming the following behavior

```
Replace all instances of given character with a "*" within the given String.
See below examples.
```

Examples:

```
censorLetter("computer science",'e') ==> "comput*r sci*nc*"
censorLetter("trick or treat",'t') ==> "*rick or *rea*"
```
 */

public class HW119JavaMethods {
    public static String censorLetter(String s, char c) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                sb.append("*");
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(censorLetter("computer science", 'e'));
    }
}
