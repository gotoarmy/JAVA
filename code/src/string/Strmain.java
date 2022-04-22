package string;

import java.util.Scanner;

public class Strmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
	    String input1 = in.nextLine();	    
	    str_pellendrom pell = new str_pellendrom();	    
	    System.out.println(pell.solu(input1));	    	    
	    return ;
	}

}
