package day9_10_11_12_Method;

class DisplayOverloading {
	
    public void disp(char c) {
    	
         System.out.println(c);
    }
    public void disp(char c, int num) {
    	
         System.out.println(c + " "+num);
    }
}
public class MethodOverloading4
{
   public static void main(String args[])
   {
       DisplayOverloading obj = new DisplayOverloading();
       obj.disp('a');
       obj.disp('a',10);
   }
}
