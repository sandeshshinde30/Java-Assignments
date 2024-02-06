import java.util.*;

public class tranpose {
    
    static int origin[][] = {{1,2,3},{4,5,6},{7,8,9}};
    int tranpose[][] = new int[3][3];

    void dispMatrix(int arr[][])
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    void tranposeMatrix()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                tranpose[i][j] = origin[j][i];
            }

        }
    }

    public static void main(String args[])
    {
        tranpose t = new tranpose();
        System.out.println("Original Matrix  : ");
        t.dispMatrix(origin);
        t.tranposeMatrix();
        System.out.println("\nTranspose Matrix : ");
        t.dispMatrix(t.tranpose);

    }
}
