//Check if a string is a valid shuffle of two distinct strings
import java.util.*;
public class MyClass {
    static boolean checkLength(String first, String second, String result) {
    if (first.length() + second.length() != result.length()) {
      return false;
    }
    else {
      return true;
    }
  }

  static String sortString(String str) {
    char[] charArray = str.toCharArray();
    Arrays.sort(charArray);
    str = String.valueOf(charArray);
    return str;
  }
  
  static boolean shuffleCheck(String first, String second, String result) {
    
    first = sortString(first);
    second = sortString(second);
    result = sortString(result);

    int i = 0, j = 0, k = 0;

    while (k != result.length()) {
      if (i < first.length() && first.charAt(i) == result.charAt(k))
        i++;
      else if (j < second.length() && second.charAt(j) == result.charAt(k))
        j++;
      else {
        return false;
      }
      k++;
    }
    if(i < first.length() || j < second.length()) {
      return false;
    }

    return true;
  }

    public static void main(String args[]) {
     String s1="XY";
		String s2="12";
		String results[] = {"1XY2","Y1X2" ,"Y21XX" };
		for(String result : results) {
			if(checkLength(s1, s2, result)==true && shuffleCheck(s1, s2, result)==true) {
				System.out.println(result+"is a valid shuffle" + s1 + "and " +s2 );
			}
			else {
				System.out.println(result + "is not a valid shuffle of "+ s1+"and "+s2);
			}
		}
    }
}
