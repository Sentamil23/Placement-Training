import java.util.*;
public class Program3 {
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length:");
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        System.out.println("Enter the numbers:");
        int a[][]= new int[n][n1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        sc.close();
        changeNum(a, n, n1);
    }   
    static void changeNum(int a[][],int n, int n1){
        for(int i=0;i<n;i++){
            for(int j=0;j<n1;j++){
                
                if(i>=(n/2)-1+i && j<=(n1/2)-1+j)
                a[j][i]=a[i][j];
            }
        }
        System.out.println("Changed Array:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
