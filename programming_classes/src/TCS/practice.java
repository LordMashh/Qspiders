package TCS;

import java.nio.charset.Charset;
import java.util.ArrayList;

public class practice {
public static void main(String[] args) {
//	byte[] b_arr = {71, 101, 101, 107, 115};
//	String s_byte =new String(b_arr); 
	
//	byte[] b_arr = {71, 101, 101, 107, 115};
//	Charset cs = Charset.defaultCharset();
//	System.out.println(cs);
//	String s_byte_char = new String(b_arr, cs);
//	System.out.println(s_byte_char);
	
//	String str = new String("hello javatpoint how r u");  
//    char[] ch = new char[10];  
//    try{  
//       str.getChars(6, 16, ch, 0);  
//       System.out.println(ch);  
//    }catch(Exception ex){System.out.println(ex);}  
//    
    
    ArrayList<Integer> arrlist = new ArrayList<Integer>(5); 
    
    // use add() method to add elements in the list 
    arrlist.add(15); 
    arrlist.add(20); 
    arrlist.add(25); 

    // prints all the elements available in list 
    for (Integer number : arrlist) { 
        System.out.println("Number = " + number); 
    } 
    
}
}
