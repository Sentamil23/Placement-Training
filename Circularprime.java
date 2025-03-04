import java.util.*;
public class Circularprime
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		sc.close();
		int n1=rotate(n);
		boolean isprime=chkprime(n);
		while(n!=n1 && isprime){
		    isprime=chkprime(n1);
		    n1=rotate(n1);
		}
		if(isprime){
		    System.out.println(n +" is a circular prime");
		}
		else{
		System.out.println(n +" is not a circular prime");
	}
	}
	static boolean chkprime(int n){
	    if(n<2) return false;
	    for(int j=2;j*j<=n;j++){
	        if(n%j==0){
	            return false;
	        }
	    }
	    return true;
	}
	static int rotate(int n){
	    int rem=0,count=0,m=n;
	    while(n>0){
	        rem=n%10;
	        n/=10;
	        count++;
	    }
	    int a = rem;
	    while(count>1){
	        a*=10;
	        count--;
	    }
	    m=(m-a)*10+rem;
	    return m;
	}
}