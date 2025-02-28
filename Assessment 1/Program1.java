import java.util.*;
public class Program1 {
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
        thirdmax(a, n, n1);
    }
    static void thirdmax(int a[][],int n,int n1){
        int max =0,smax=0,tmax=0;
        for(int i =0;i<n;i++){
            for(int j=0;j<n1;j++){
                if(a[i][j]>max){
                    tmax=smax;
                    smax=max;
                    max=a[i][j];
                }
                else if(a[i][j]>max && a[i][j]!=max){
                    smax=a[i][j];
                }
                else if(a[i][j]>tmax && tmax!=smax && a[i][j]!=max){
                    tmax=a[i][j];
                }
            }
        }
        if(tmax==0){
            System.out.println("No Thirdmax is there!!");
        }
        else{
        System.out.println("Firstmax: "+ max);
        System.out.println("Secondmax: "+ smax);
        System.out.println("Thirdmax: "+ tmax);
        }
    }
    
}
