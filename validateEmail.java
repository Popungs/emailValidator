package sectionEndProject;

import java.util.ArrayList;
import java.util.List;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validateEmail {
	// A- Z permitted
	// a-z permitted
	// 0-9 permitted
	// _, -. permitted
	// no  special char is permitted 
	public static final String My_Regex = "^(.+)@(.+)$";
	public static final String Better_Regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

	public static void main(String[] args) {
		
		
		Pattern pattern = Pattern.compile(Better_Regex );
		List<String> lst = new ArrayList<String> ();
		
		
		String empEmails[] = {"asdf@hcl.com", "qwerqwer@hcl.com", "email@gmail.com", 
				"hclEmployee@hcl.com", "abcd@abcd.com", "leedn@gmail.com", "leelee@gmail.com", "lee@hcl.org", "lee@hcl.com",
				"aSDFA###@ASDF.COM", "asdfa.asdf.gmail.com", "@@@abcd##!@#@gmail.com"};

		
		for (String s : empEmails) {
			lst.add(s);
		}
		for (String s : lst) {
			Matcher matcher = pattern.matcher(s);
			System.out.println("the email address : " + s + " is " + (matcher.matches() ? "valid" : "invalid"));
		}
		
		
		
	}
}
