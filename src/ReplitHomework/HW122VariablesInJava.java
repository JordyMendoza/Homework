package ReplitHomework;
/*
Declare 3 instance variables to hold:

- name of the country
- capital
- population size

Create a method to display values of instance variables

Create 2 Object, assign values to instance variables, execute method display;

**Expected Output:**

```
The capital of USA is Washington DC and population is 330000000
The capital of Kazakhstan is Astana and population is 18500000
```
 */

public class HW122VariablesInJava {
    String country;
    String capital;
    int population;

    public static void main(String[] args) {
        HW122VariablesInJava c=new HW122VariablesInJava();
        c.country="USA";
        c.capital="Washington DC";
        c.population=330000000;
        System.out.println("The capital of "+c.country+" is "+c.capital+" and population is "+c.population);

        HW122VariablesInJava d=new HW122VariablesInJava();
        d.country="Kazakhstan";
        d.capital="Astana";
        d.population=18500000;
        System.out.println("The capital of "+d.country+" is "+d.capital+" and population is "+d.population);



    }

}
