public class ReverseInteger {
    public int reverse(int x) {
        long rev=0;
        int digit=0;
	    while(x!=0){
	    digit=x%10;
	    rev = rev*10+digit;
	    x/=10;
	    }
	    if(rev<Integer.MAX_VALUE && rev>-Integer.MIN_VALUE)
          return (int)rev;
        else
          return 0;
    }
}
