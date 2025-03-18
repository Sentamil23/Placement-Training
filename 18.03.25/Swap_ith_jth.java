import java.util.*;
public class Swap_ith_jth{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();
        sc.close();
        binary(n,i,j);
    }
    static void binary(int n,int i,int j){
        int rem=0;
        String str="";
        while(n>0){
            rem=n%2;
            n/=2;
            str = rem+str;
        }
        String str1=String.format("%32s",str).replace(" ","0");
        System.out.println("Binary: "+str1);
        char ch[]=str1.toCharArray();
        char temp = ch[i-1];
        ch[i-1]=ch[j-1];
        ch[j-1]=temp;
        String str3=new String(ch);
        System.out.println("Swaped Binary: "+str3);
        }
}  