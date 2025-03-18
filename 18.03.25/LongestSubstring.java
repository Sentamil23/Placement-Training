public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int arr[]=new int[300];
        int l=0;
        for(int i=0;i<s.length();i++){
            int lon=s.charAt(i);
            while(arr[lon]>0){
                arr[s.charAt(l)]--;
                l++;
            }
            arr[lon]++;
            max=Math.max(max,i-l+1);
        }
        return max;
    }
}