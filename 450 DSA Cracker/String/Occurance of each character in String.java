//occurance of a each character in string using HashMap 
import java.util.*;
public class Main
{
    public static void characterCount(String str){
        HashMap<Character,Integer>  countMap = new HashMap<Character,Integer>();
        //converting given string into  char Array
        char[] strArray = str.toCharArray();
        for(char c:strArray){
            if(countMap.containsKey(c)){
                countMap.put(c,countMap.get(c)+1);
            }
            else{
                countMap.put(c,1);
            }
        }
        for(Map.Entry entry:countMap.entrySet()){
            System.out.println(entry.getKey() +" , count="+entry.getValue());
        }
    }
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    characterCount(s);
	}
}
