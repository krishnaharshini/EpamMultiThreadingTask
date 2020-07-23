import  java.util.*;
import java.util.stream.Collectors;
public class LamdaandStream {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		List<Integer> integers = List.of(1, 2, 3, 4, 5);
		int sum1 = integers.stream()
		                .mapToInt(Integer::intValue)
		                .sum();
		int n=integers.size();
		System.out.println("Average of integers: "+sum1/n);
		List<String>s=List.of("abc","aabcd","aaa","","cdrfg","cda");
		System.out.println("List of strings that start with 'a' and have exactly 3characters are:");
		System.out.println(search(s));
		sc.close();
	}
	public static List<String> search(List<String> list) {
	return list.stream()
			  .filter(s -> s.startsWith("a"))
			  .filter(s -> s.length() == 3)
			  .collect(Collectors.toList());
	}

}