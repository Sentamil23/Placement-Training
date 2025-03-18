import java.util.*;
public class FrequencyWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String w[]=s.toLowerCase().split(" ");
        boolean flag=false;
        for(int i =0;i<w.length;i++){
            for(int j=0;j<i;j++){
                if(w[i].equals(w[j])){
                    flag =true;
                }
            }
            if(!flag){
                counter(w,w[i]);
            }
            flag=false;
        }
        sc.close();
    }
    static void counter(String w[],String s){
        int count=0;
        for(int i=0;i<w.length;i++){
            if(s.equals(w[i]))
            count++;
        }
        System.out.println(s+" : "+count);
    }
}
