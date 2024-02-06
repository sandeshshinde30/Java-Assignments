import java.util.*;

public class factorial {
    int num;

    Scanner sc = new Scanner(System.in);

    int fac(int n)
    {
        if(n == 0 || n==1) return n;
        return n*fac(n-1);
    }

    void getNumber()
    {
        System.out.print("Enter number : ");
        num = sc.nextInt();
    }

    void dispFact()
    {
        System.out.println("Factorial : "+fac(num));
    }

    public static void main(String args[])
    {
        factorial f = new factorial();
        f.getNumber();
        f.dispFact();
    }
}
