import java.util.*;

public class search {
    
    Vector<Integer> vec = new Vector<Integer>(10);
    int n;

    Scanner sc = new Scanner(System.in);
    

    void getElements()
    {
        System.out.println("Enter length of array   : ");
        n = sc.nextInt();
        System.out.println("Enter "+ n +" Elements : ");
        
        for(int i=0;i<n;i++)
        {
            vec.add(sc.nextInt());
        }
    }

    void dispElements()
    {
        System.out.print("\nArray : "+vec);
    }

    void searchElements()
    {
        int flag = 0;
        for(int i=0;i<n;i++)
        {
            if(vec.get(i)==10)
            {
                System.out.println("\n10 found in array.");
                flag = 1;
                break;
            }
        }

        if(flag == 0) System.out.println("\n10 Not found in array.");
        
    }

    public static void main(String args[])
    {
        search s = new search();
        s.getElements();
        s.dispElements();
        s.searchElements();
    }

}
