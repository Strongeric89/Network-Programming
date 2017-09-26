
//4. Modify the above IP spam program and get the IP from command line instead of
//giving it manually
import java.net.*;
import java.util.Stack;

public class SpamChecker{
  public static void main(String [] args)throws Exception{

    String p1= args[0];
    String s2= args[1];
		String s1 = rev(p1);
    String query;

    try{
      query = s1 + s2;
      InetAddress.getByName(query);
      System.out.println(s1 + " is known Spammer");

    }
    catch(Exception ex){
      System.out.println(s1 + " is not a spammer");
    }

  }//end main

  public static String rev(String s){

	  Stack <String> stack = new Stack();
    String [] sub = s.split("\\.");

        String newS ="";

        	for(String s1: sub) {
        		stack.push(s1);

        	}

        	for(int i = sub.length -1 ; i>=0; i--) {
        		newS += stack.get(i) + ".";
        	}

          newS= newS.substring(0, newS.length()-1);

      return newS;
  }

}//end class
