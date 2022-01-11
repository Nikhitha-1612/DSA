import java.util.*;
class Solution {
    
    public String capitalizeTitle(String title) {
    StringTokenizer token=new StringTokenizer(title," ");
        String str="";
        while(token.hasMoreTokens()){
           String k=token.nextToken();
            if(k.length()<=2){
                str+=k.toLowerCase()+" ";
            }
            else{
                k=k.toLowerCase();
                str=str+(char)(k.charAt(0)-32)+k.substring(1);
                str+=" ";
            }
        }
        return str.substring(0,str.length()-1);
    }
}
