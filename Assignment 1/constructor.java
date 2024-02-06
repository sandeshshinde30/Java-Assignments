import java.util.*;

public class constructor {

    int res=10;
    
    public constructor() {
        System.out.println("\nDefault Constructor called");
    }


    public constructor(int a,int b) {
        System.out.println("\nParameterized Constructor called");
        res = a + b;
        System.out.println("Addition : "+a+"  +  " +b+ " = "+res); 
    }

    
    public constructor(constructor obj) {
        System.out.println("\nCopy Constructor called");
    }

    public static void main(String[] args) {
        
        constructor c1 = new constructor(); 
        constructor c2 = new constructor(10,20); 
        constructor c3 = new constructor(c1); 
        System.out.println("Accessing same value of result variable of c2 object : "+c3.res);
    }
}
