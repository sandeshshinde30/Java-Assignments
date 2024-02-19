

public class strbuilder_fun
{

    StringBuilder append(StringBuilder sb,String s)
    {
       return sb.append(s);
    }

    StringBuilder insert(int index,StringBuilder sb,String s)
    {
       return sb.insert(index,s);
    }

    StringBuilder replace(int sindex,int eindex,StringBuilder sb,String s)
    {
       return sb.replace(sindex,eindex,s);
    }

    StringBuilder delete(int sindex,int eindex,StringBuilder sb)
    {
       return sb.delete(sindex,eindex);
    }

    StringBuilder reverse(StringBuilder sb)
    {
       return sb.reverse();
    }

    public static void main(String args[])
    {
        strbuilder_fun s = new strbuilder_fun();
        StringBuilder sb = new StringBuilder("Sandesh");

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