package string;
import java.util.Scanner;
import java.io.*;
public class str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//입력을 넣는다
		//1.string 배열을 입력받음
		
		char[] alphain =new char[100];
		Scanner in =new Scanner(System.in);
		String input1 = in.nextLine();
	    char input2 = in.next().charAt(0);
	    int count = input1.length();
	    int iinput2 = input2;
	    int alphacount =0;
	    
	    for (int i =0; i < count; i++)
	    {
	    	 alphain[i]= input1.charAt(i); // 소문자 아스키 값이들어감
	    	 int j = alphain[i];
	    	 if (j < 93) //대문자
	    	 {
	    		 if(j == iinput2 || j+32 == iinput2)
	    		 {
	    			 alphacount++;
	    		 }
	    	 }
	    	 else if(j > 93) //소문자
	    	 {
	    		 if(j == iinput2 || j-32 == iinput2)
	    		 {
	    			 alphacount++;
	    		 }
	    	 }
	    	 
	   	 }
	    	System.out.print(alphacount);
	   }
	    //아스키 값이 들어감
	    
		
		
	}


