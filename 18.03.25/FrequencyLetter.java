import java.util.*;
public class FrequencyLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n =s.length()-1;
        boolean flag=false;
        for(int i =0;i<=n;i++){
            for(int j=0;j<i;j++){
                if(s.charAt(i) == s.charAt(j)){
                    flag =true;
                }
            }
            if(!flag){
                counter(s,n,s.charAt(i));
            }
            flag=false;
        }
        sc.close();
    }
    static void counter(String s,int n,char ch){
        int count=0;
        for(int i=0;i<=n;i++){
            if(ch==s.charAt(i))
            count++;
        }
        System.out.println(ch+" : "+count);
    }
}
