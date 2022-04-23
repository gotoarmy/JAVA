package string;

import java.util.Scanner;

public class Strmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
	    String input1 = in.nextLine();	    
	    OnlyNumber Onlynum = new OnlyNumber();	    
	    System.out.println(Onlynum.solu(input1));	    	    
	    return ;
	}

}
