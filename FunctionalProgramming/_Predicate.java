package FunctionalProgramming;
import java.util.function.*;
public class _Predicate {
	public static void main(String[] args) {
		String vaild_gmail = "aykalam@gmail.com";
		System.out.println(vaild_gmail+": "+gmail_Predicate.test(vaild_gmail));
		
		String not_vaild_gmail = "aykalam@gmaill.com";
		System.out.println(not_vaild_gmail+": "+gmail_Predicate.test(not_vaild_gmail));
		
		System.out.println(vaild_gmail+" ,"+not_vaild_gmail+": "+_2gmail_Predicate.test(vaild_gmail, not_vaild_gmail));
	}
	//Predicate, takes Object and return boolean
	static Predicate<String>gmail_Predicate = gmail -> gmail.contains("@gmail.com");
	//BiPredicate, takes 2 Objects and return boolean
	static BiPredicate<String,String>_2gmail_Predicate = (gmail1,gmail2) -> gmail1.contains("@gmail.com") && gmail2.contains("@gmail.com");
	
	
}
