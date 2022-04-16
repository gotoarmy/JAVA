package string;
import java.util.Scanner;
import java.io.*;


class Up{
	public String solution(String str)
	{
		int icount =0;
		String answer =null;
		for(char x : str.toCharArray())
		{
			if (x > 91) //대문자
			{
				x -=32;
				System.out.print(x);
				x +=32;
			}
			
			if (x < 91) //소문자
				{
				x +=32; 
				System.out.print(x);
				}
			
			
			
		}
		return answer;
	}
}

public class str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		String an = in.next();
		String bn = null;
	    Up ln = new Up();
	    bn = ln.solution(an);
	    
	    
	    
		
		
	}
}


