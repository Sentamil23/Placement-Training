import java.util.*;
public class Program2 {
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
        sort(a, n, n1);
    }
    static void sort(int a[][],int n,int n1){
        for(int i=0;i<n;i++){
            for(int j=0;j<n1;j++){
                for(int k=0;k<n;k++){
                    for(int l=0;l<n1;l++){
                        if(a[i][j]<a[k][l]){
                            int temp=a[i][j];
                            a[i][j]=a[k][l];
                            a[k][l]=temp;
                        }
                    }
                }
            }
        }
        System.out.println("Sorted Array:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n1;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }   
}
