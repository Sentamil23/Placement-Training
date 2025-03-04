import java.util.*;
public class Automorphic
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number:");
	    int n = sc.nextInt();
	   //int x = sc.nextInt();
	   //int y = sc.nextInt();
	   sc.close();
	   // Autm(n);
	   //autm1(x,y);
	   octal(n);
	   binary(n);
	   hexadecimal(n);
	}
	static void Autm(int n){
	    int sq = n*n;
	    boolean digit=true;
	    while(n>0){
	        if (n%10!=sq%10)
	            digit=false;
	            n/=10;
	            sq/=10;
	        
	    }
	        if(digit){
	            System.out.println("Its a Automorphic");
	        }
	        else{
	            System.out.println("Not a Automorphic");
	        }
	}
	static void autm1(int x,int y){
	    for (int i=x;i<=y;i++){
	        int n=i;
	        int sq = n*n;
	    boolean digit=true;
	    while(n>0){
	        if (n%10!=sq%10)
	            digit=false;
	            n/=10;
	            sq/=10;
	        
	    }
	        if(digit){
	            System.out.println(i);
	        }
	    }
	}
	static void octal(int n){
	int rem=0;
	String str="";
	while(n>0){
	    rem=n%8;
	    n/=8;
	    str = rem+str;
	}
	System.out.println("Octal: "+str);
	}
	static void binary(int n){
	int rem=0;
	String str="";
	while(n>0){
	    rem=n%2;
	    n/=2;
	    str = rem+str;
	}
	System.out.println("Binary: "+str);
	}
	static void hexadecimal(int n){
	int rem=0;
	String str="";
	while(n>0){
	    rem=n%16;
	    n/=16;
	    if(rem<=9){
	    str = rem+str;
	}
	else{
	    char[] ch ={'A','B','C','D','E','F'};
	    str=ch[rem-10]+str;
	}
	}
	System.out.println("Hexadecimal: "+str);
	}
}