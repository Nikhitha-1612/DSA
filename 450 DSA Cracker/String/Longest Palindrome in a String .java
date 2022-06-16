//https://practice.geeksforgeeks.org/problems/longest-palindrome-in-a-string3411/1
class Solution{
    static String longestPalin(String S){
        // code here
        int n=S.length();
        if(n<2){
            return S;
        }
        int maxlength=1,start=0;
        int low,high;
        for(int i=0;i<n;i++){
            low=i-1;
            high=i+1;
            while(high<n && S.charAt(high)==S.charAt(i))
            high++;
            while(low>=0 && S.charAt(low)==S.charAt(i))
            low--;
            while(low>=0 && high<n && S.charAt(low)==S.charAt(high)){
                low--;
                high++;
            }
           
           int length=high-low-1;
           if(maxlength<length){
               maxlength=length;
               start=low+1;
           }
        }
       
        return (S.substring(start,start+maxlength));
        
    }
}
