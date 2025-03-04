import java.util.*;
public class MultiTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        String num=sc.next();
        int i =num.length()-1;
        multi(num, i);
        sc.close();
    }
    static void multi(String num,int i){
        String ch="",num2="";
        int sum=0;
        for(int j=0;j<=i;j++){
            if(Character.isDigit(num.charAt(j))){
            sum=sum*10+(num.charAt(j)-'0');
             if((j<i && !Character.isDigit(num.charAt(j+1)))||(j==i)){
                while(sum>0){
                    num2=num2+ch;
                    sum--;
                }
                ch="";
            }
        }
            else
            ch=ch+num.charAt(j);
        }
        if(ch!=""){
            num2=num2+ch;

        }
        System.out.println(num2);
        
    }
}
