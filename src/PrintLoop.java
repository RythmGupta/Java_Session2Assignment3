
public class PrintLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String j="";
       int i=1;
       while(i<=5)
       {	  
    	   j+=""+i;
           System.out.println(j);
           i++;
       }
       while(i>=1)
       {  
    	   System.out.println(j.substring(0,i-1));
    	   i--;
       }
	}
}