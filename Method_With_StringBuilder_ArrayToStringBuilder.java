import java.util.*;
import java.lang.*;
class Main {
  public static StringBuilder  arrayToSb(String[] r) 
  {
    
  StringBuilder str = new StringBuilder();
  
  for(String str1 : r){
    str.append(str1);
  }
  return str;
  }
 
  
  public static void main(String[] args)
  {
    
    String[]  arr = new String[]{"a","1","2"};
    

    StringBuilder recipt = arrayToSb(arr);
    System.out.print(recipt.toString());

   
    
  }//end main
}