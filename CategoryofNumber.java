import java.util.*;
public class CategoryofNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(n + pronic(n)+","+ abundant(n)+","+niven(n));
    }
    static String pronic(int n){
        for(int i =1;i<n;i++){
            if(i*(i+1)==n)
            return " is pronic";     
    }
    return " non pronic";
    }
    static String abundant(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
                
            }
        }
        if(sum>n)
        return " is abundant";
        else
        return " not abundant";
    }
    static String niven(int n){
        int rem=0,sum =0,a=n;
        while(n>0){
            rem = n%10;
            sum+=rem;
            n/=10;
        }
        if(a%sum==0)
        return " is niven";
        else
        return " not niven";
    }
}    
