import java.util.*;
import java.util.function.Predicate;
public class Palindromelist {
	public static void main( String[] args )
	  {
	     List<String> listOfStr = Arrays.asList("aba", "bcc", "cab", "mom", "mnoonm");
	     List<String> filterList =  Palindromelist.finalList(listOfStr, StrPredicates::isPalindrome);
	     System.out.println(filterList);
	  }

	  public static List<String> finalList(List<String> list, Predicate<String> predicate)
	  { 
	       List<String> resultList = new ArrayList<>();
	       for(String s: list)
	       {
	          if((predicate).test(s))
	          {
	             resultList.add(s);
	          }
	       }
	       return resultList;
	  } }

	 class StrPredicates {
	      public static boolean isPalindrome(String s)
	      {
	            int start, end;
	            start = 0;
	            end = s.length()-1;
	            while(start < end)
	            {
	                 if(s.charAt(start) != s.charAt(end))
	                       return false;
	                 else
	                 {
	                      start++;
	                      end--;
	                 }
	            
	            }
	            return true;
	    }

}
