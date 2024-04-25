package TCS;

public class JumbledWord {
public static void main(String[] args) {
	String s1 = "ABCDEF";
	String s = "abc";
	
	String jb = ""; 
	int i;
	for(i = 0; i < s.length() && i<s1.length(); i++) {
		jb += s.charAt(i);
		jb += s1.charAt(i);
		
	}
	if(i==s.length())
		jb += s1.substring(i);
	else
		jb += s.substring(i);
	System.out.println(jb);
}
}
