import java.util.*;
import java.lang.*;
class Main {
  public boolean toBe(StringBuilder r) 
  {
 r.toString().split(",");
		
		if(r.toString().contains("true")) {
			return true;
		}
		return false;
    
    
    
   
  }
  
  public static void main(String[] args)
  {
    Main m = new Main();
    
    StringBuilder  bool = new StringBuilder("true,false");
    
    boolean tst = m.toBe(bool);
    System.out.print(tst);

   
    
  }//end main
}