import java.util.*;
public class Strong
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		sc.close();
		for(int j=0;j<=n;j++)
		factorial(j);
	}
	static void factorial(int n){		
	    int rem=0,sum=0,a=n;
	    while(n>0){
	        rem=n%10;
	        int res=1;
	        for(int i=rem;i>0;i--){
	            res*=i;
	        }
	        n/=10;
	        sum+=res;
	    }
	
	   if(a==sum){
	       System.out.println(a +" is a Strong number");
	   }	
}
}

