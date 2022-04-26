package string;

import java.util.Scanner;

public class Strmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int i_input =in.nextInt();
	    String s_input1 = in.next();
	    s_input1 +='/';
	    Sendingcode solve =new Sendingcode();
	    solve.solu(s_input1);
	    return ;
	}

}
