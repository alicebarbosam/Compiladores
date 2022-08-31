package posfix;
import java.io.FileReader;
import java.util.*;
import java.io.IOException;


public class RPNStacker {
	public static void main(String[] args) {
		Scanner scan;
		Stack<Integer> RPNStacker = new Stack<Integer>();
		Integer x;
		Integer y;
		String digito = new String();
		
		
		
		
		try {
			scan = new Scanner(new FileReader("/D:/Downloads/Calc1.stk")).useDelimiter("\\n");
			while(scan.hasNext()) {
				digito = scan.next();
				if(digito.contentEquals("*")) {
					x = RPNStacker.pop();
					y = RPNStacker.pop();
					RPNStacker.push(y*x);
				}else if(digito.contentEquals("/")) {
					x = RPNStacker.pop();
					y = RPNStacker.pop();
					RPNStacker.push(y/x);
				}else if(digito.contentEquals("+")) {
					x = RPNStacker.pop();
					y = RPNStacker.pop();
					RPNStacker.push(y+x);
				}else if(digito.contentEquals("-")) {
					x = RPNStacker.pop();
					y = RPNStacker.pop();
					RPNStacker.push(y-x);
				}else {
					RPNStacker.push(Integer.parseInt(digito));
				}
			}
			System.out.println(RPNStacker.pop());
			
		}catch(IOException ex){
	        System.out.println (ex.toString());
	    }
		
		
		

	}
}
