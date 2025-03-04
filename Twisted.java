import java.util.*;
public class Twisted
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		for(int i =0;i<=n;i++){
		int reve = reverse(i);
		if(chkprime(i)&&chkprime(reve))
		    System.out.println("Both "+ i + " and "+ reve +" is prime number");
// 		else
// 		System.out.println("Thappu");
sc.close();
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
	static int reverse(int n){
	    int rev=0,digit=0;
	    while(n>0){
	    digit=n%10;
	    rev = rev*10+digit;
	    n/=10;
	    }
	    return rev;
	}
}