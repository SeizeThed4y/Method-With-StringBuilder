import java.util.*;
import java.lang.*;
class Main {
  public StringBuilder replaceWith(String[] r,String replace,String replaceWith) 
  {
   
				  StringBuilder str = new StringBuilder();
				  
				  for(int i = 0; i < r.length; i++) {
					
					  if(r[i].contains(replace)) {
						  r[i] = replaceWith;
					  }
						  
					 
					
				  }
				  
				for(String str1 : r) {
					str.append(str1);
					
				}
				
				return str;
   
  }
  
  public static void main(String[] args)
  {
    Main m = new Main();
    
    String[] r= new String[]{"a","b","a","b"};
    
    StringBuilder tst = m.replaceWith(r,"b","a");
    System.out.print(tst);

   
    
  }//end main
}