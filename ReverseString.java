import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence:");
        String num=sc.nextLine();
        int i = num.length()-1;
        revestr(num,i);
        sc.close();
    }
    static void  revestr(String num,int i){
        String num2="",result="";
        for(int j =i;j>=0;j--){
            if (j==i && num.charAt(j)==' ')
            continue;
            else if(num.charAt(j)==' ' && (num.charAt(j+1)!=' ' || j==i)){
                result+=num2+' ';
                num2="";
            }
            else if(num.charAt(j)!=' ')
            num2 = num.charAt(j)+num2;  
        }
        result+=num2;
        System.out.println(result);
    }
}
