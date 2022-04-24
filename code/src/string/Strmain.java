package string;

import java.util.Scanner;

public class Strmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
	    String input1 = in.nextLine();
	    String[] input2 =input1.split(" ");
	    char c_input = input2[1].charAt(0);
	    Shortestdistance Onlynum = new Shortestdistance();	    
	    Onlynum.solu(input2[0], c_input);	    	    
	    return ;
	}

}
