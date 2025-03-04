import java.util.*;
public class Longnum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Str1:");
        String str1 =sc.next();
        System.out.println("Enter Str2:");
        String str2 =sc.next();
        int i = str1.length()-1;
        int j=str2.length()-1;
        int carry=0,d1,d2;
        String sum="";
        while(i>=0 || j>=0){
            if(i<0){
                d1=0;
                d2=str2.charAt(j)-'0';
            }
            else if(j<0){
                d1=str1.charAt(i)-'0';
                d2=0;
            }
            else{
            d1=str1.charAt(i)-'0';
            d2=str2.charAt(j)-'0';
            }
            int d3=d1+d2+carry;
            int rem=d3%10;
            carry=d3/10;
            sum=rem+""+sum;
            i--;
            j--;
        }
        if(carry>0)
        sum=carry+""+sum;
        System.out.println(sum);
        sc.close();
    }
}
