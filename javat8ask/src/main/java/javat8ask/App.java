package javat8ask;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
	public static double calculateAvg(List<Integer> list)
	{
		return list.stream().mapToInt(a->a).average().getAsDouble();
	}
	
	public static List<String> search(List<String> list) {
	return list.stream()
			  .filter(s -> s.startsWith("a"))
			  .filter(s -> s.length() == 3)
			  .collect(Collectors.toList());
	}
	public static List<String> checkPalindrome(List<String>  list)
	{
		List<String> palindromeList=new ArrayList<String>();
		for(String x:list)
		{
			StringBuilder str1=new StringBuilder(x);
			StringBuilder str2=new StringBuilder(x);
			str2.reverse();
			if(String.valueOf(str1).equals(String.valueOf(str2)))
			{
				palindromeList.add(String.valueOf(str1));
			}
			else
			{
				continue;
			}
		}
		return palindromeList;
	}
    public static void main( String[] args )
    {
    	List<Integer> list=new ArrayList<>();
    	list.add(10);
    	list.add(20);
    	list.add(45);
    	list.add(32);
    	list.add(27);
    	System.out.println("The average of list ::"+calculateAvg(list));
    	
    	List<String> searchList=new ArrayList<String>();
    	searchList.add("ahbs");
    	searchList.add("xyz");
    	searchList.add("akash");
    	searchList.add("abc");
    	searchList.add("axe");
    	System.out.println("The list of string that start with letter a of length 3 ::"+search(searchList));
    	
    	List<String> palinList=new ArrayList<String>();
    	palinList.add("axa");
    	palinList.add("xyz");
    	palinList.add("akash");
    	palinList.add("rotor");
    	palinList.add("reviver");
    	System.out.println("list of all the palindrome strings::"+checkPalindrome(palinList));
    }
}
