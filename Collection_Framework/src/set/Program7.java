package set;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
		getUniqueCharacter(str);
	}
	public static void getUniqueCharacter(String str) {
		Set<Character> s1 = new TreeSet<>();
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(c!= ' ')
				s1.add(c);
		}
		String res = " ";
		for(char c : s1) {
			res = res + c;
		}
		System.out.println("Uniques String is : " + res);
		
	}

}
