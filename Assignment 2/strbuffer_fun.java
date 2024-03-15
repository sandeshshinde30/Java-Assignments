/* Name : Sandesh Shivaji Shinde 
PRN : 23620006
Ques. : Implement all stringBuffer functions in java.
*/

public class strbuffer_fun
{

    StringBuffer append(StringBuffer sb,String s)
    {
       return sb.append(s);
    }

    StringBuffer insert(int index,StringBuffer sb,String s)
    {
       return sb.insert(index,s);
    }

    StringBuffer replace(int sindex,int eindex,StringBuffer sb,String s)
    {
       return sb.replace(sindex,eindex,s);
    }

    StringBuffer delete(int sindex,int eindex,StringBuffer sb)
    {
       return sb.delete(sindex,eindex);
    }

    StringBuffer reverse(StringBuffer sb)
    {
       return sb.reverse();
    }

    public static void main(String args[])
    {
        strbuffer_fun s = new strbuffer_fun();
        StringBuffer sb = new StringBuffer("Sandesh");

        System.out.println();
        System.out.println("1. append()");
        System.out.println(s.append(sb," Shinde"));
        System.out.println();

        System.out.println("2. insert()");
        s.insert(0,sb,"I am ");
        System.out.println(sb);
        System.out.println();

        System.out.println("3. replace()");
        s.replace(15,17,sb,"Shinde");
        System.out.println(sb);
        System.out.println();

        System.out.println("4. delete()");
        s.delete(12,23,sb);
        System.out.println(sb);
        System.out.println();

        System.out.println("5. reverse()");
        s.reverse(sb);
        System.out.println(sb);
        System.out.println();

    }
}