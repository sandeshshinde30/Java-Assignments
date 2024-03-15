/* Name : Sandesh Shivaji Shinde 
PRN : 23620006
Ques. : Implement all string functions in java.
*/

import java.io.*;
import java.util.*;

public class str_fun
{

    public char charat(String str,int index)
    {
       return str.charAt(index);
    }

    public int Length(String str)
    {
       return str.length();
    }

    public String substr(String str)
    {
       return str.substring(3,7);
    }

    public boolean contain(String str)
    {
       return str.contains("desh");
    }

     public boolean equal(String str1,String str2)
    {
       return str1.equals(str2);
    }

    public boolean empty(String str)
    {
       return str.isEmpty();
    }

     public String concate(String str1,String str2)
    {
       return str1.concat(str2);
    }


    public int index(String str,String substr)
    {
       return str.indexOf(substr);
    }

    public String trim(String str) {
        return str.trim();
    }

    public String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public static void main(String args[])
    {
        str_fun s = new str_fun();

        String s1 = "My name is";
        String s2 = "Sandesh";

        System.out.println("String 1 : "+s1);
        System.out.println("String 2 : "+s2);
  
      
        System.out.println();
        System.out.println("1. charAT()");
        System.out.println("Character at index 2 : "+s.charat(s2,2));
        System.out.println();

        System.out.println("2. length()");
        System.out.println("Length of "+s2+" : "+s.Length(s2));
        System.out.println();

        System.out.println("3. substr()");
        System.out.println("Substring  of "+s2+" : "+s.substr(s2));
        System.out.println();

        System.out.println("4. contains()");
        System.out.println("Is "+s2+"contains 'desh' : "+s.contain(s2));
        System.out.println();

        System.out.println("5. equals()");
        System.out.println("Is "+s1+" equal to"+ s2 +" : "+s.equal(s1,s2));
        System.out.println();

        System.out.println("6. isEmpty()");
        System.out.println("Is "+ s2 +" is empty string : "+s.empty(s2));
        System.out.println();

        System.out.println("7. isEmpty()");
        System.out.println("Concated String :  "+ s.concate(s1,s2));
        System.out.println();

        System.out.println("8. indexOf()");
        System.out.println("Concated String :  "+ s.index(s2,"a"));
        System.out.println();

        System.out.println("9. trim()");
        System.out.println("   Sandesh   trimed String : "+ s.trim("   Sandesh   "));
        System.out.println();

        System.out.println("10. toUpperCase()");
        System.out.println("Uppercase String : "+ s.toUpperCase("sandesh"));
        System.out.println();
    }
}