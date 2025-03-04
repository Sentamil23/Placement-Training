import java.util.*;
public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        String num=sc.next();
        strobj(num);
        strbuilder(num);
        strbuffer(num);
        sc.close();
    }
    static void strobj(String num){
        String obj=num.substring(1,6);
        System.out.println("String SubString: "+obj);
    }
    static void strbuilder(String num){
        StringBuilder sb = new StringBuilder(num);
        String bsk =sb.substring(2,7);
        System.out.println("StringBuilder SubString: "+bsk);
    }
    static void strbuffer(String num){
        StringBuffer sb = new StringBuffer(num);
        String dsp = sb.substring(2,6);
        System.out.println("StringBuffer SubString: "+dsp);
    }
}
