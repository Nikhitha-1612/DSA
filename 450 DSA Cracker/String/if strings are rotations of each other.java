//program to check if Strings are rotations of each other or not
import java.util.*;
public class Main
{
    public static boolean areRotations(String str1,String str2){
        return (str1.length() == str2.length())&&((str1+str1).indexOf(str2)!=-1);
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s1=sc.next();
	    String s2=sc.next();
	    if(areRotations(s1,s2)){
	        System.out.println("Strings are rotations of each other");
	    }
	    else
	    System.out.println("Strings are not rotations of each other");
	}
}
