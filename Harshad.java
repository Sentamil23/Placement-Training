import java.util.*;
public class Harshad {
    public static void main(String[] args) {
        System.out.println("Enter the range");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        sc.close();
        for(int i =n;i<=n1;i++)
        harsh(i);
    }
    static void harsh(int n){
        int rem=0,sum =0,a=n;
        while(n>0){
            rem = n%10;
            sum+=rem;
            n/=10;
        }
        if(a%sum==0)
        System.out.print(a +" ");
    }
}
