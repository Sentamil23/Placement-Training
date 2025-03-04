import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        String num=sc.next();
        int i = num.length()-1;
        sbuiltin(num, i);
        sbuilder(num);
        sbuffer(num);
        nobuilt(num, i);
        sc.close();
    }
    static void sbuiltin(String num,int i){
        String num2="";
        for(int j=i;j>=0;j--){
            num2= num2 +num.charAt(j);
        }
        if(num2.equals(num))
        System.out.println("sbuiltin: "+ num +" It's a palindrome");
        else
        System.out.println("sbuiltin: "+ num +" It's not a palindrome");
    }
    static void sbuilder(String num){
        StringBuilder sb = new StringBuilder(num);
        StringBuilder d = new StringBuilder(sb.reverse());
        String rev = d.toString();
        if(num.equals(rev))
        System.out.println("sbuilder: "+ num +" It's a palindrome");
        else
        System.out.println("sbuilder: "+ num +" It's not a palindrome");
    }
    static void sbuffer(String num){
        StringBuffer sb = new StringBuffer(num);
        StringBuffer d = new StringBuffer(sb.reverse());
        String rev = d.toString();
        if(num.equals(rev))
        System.out.println("sbuffer: "+ num +" It's a palindrome");
        else
        System.out.println("sbuffer: "+ num +" It's not a palindrome");
    }
    static void nobuilt(String num,int i){
        boolean istrue=true;
        for(int j=0;j<(i/2);j++){
            if(num.charAt(j)!=num.charAt(i-j)){
            System.out.println("Nobuilt: "+ num +" It's not a palindrome");
            istrue=false;
            break;
            }  
        }
        if(istrue)
        System.out.println("Nobuilt: "+ num +" It's a palindrome");
    }
}
