import java.util.Scanner;

public class Program4 {
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
        int count =0;
        for(int i =0;i<n;i++){
            for(int j=0;j<n1;j++){
                if(abundant(a[i][j])){
                    System.out.println(a[i][j]);
                    count++;
                }
            }
        }
        if(count%2==0)
        System.out.println("Yes");
        else
        System.out.println("No");
        sc.close();
    }
     static boolean abundant(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
                
            }
        }
        if(sum>n)
        return true;
        else
        return false;
    }
}
