package string;
import java.util.Scanner;
import java.io.*;
public class str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�Է��� �ִ´�
		//1.string �迭�� �Է¹���
		
		char[] alphain =new char[100];
		Scanner in =new Scanner(System.in);
		String input1 = in.nextLine();
	    char input2 = in.next().charAt(0);
	    int count = input1.length();
	    int iinput2 = input2;
	    int alphacount =0;
	    
	    for (int i =0; i < count; i++)
	    {
	    	 alphain[i]= input1.charAt(i); // �ҹ��� �ƽ�Ű ���̵�
	    	 int j = alphain[i];
	    	 if (j < 93) //�빮��
	    	 {
	    		 if(j == iinput2 || j+32 == iinput2)
	    		 {
	    			 alphacount++;
	    		 }
	    	 }
	    	 else if(j > 93) //�ҹ���
	    	 {
	    		 if(j == iinput2 || j-32 == iinput2)
	    		 {
	    			 alphacount++;
	    		 }
	    	 }
	    	 
	   	 }
	    	System.out.print(alphacount);
	   }
	    //�ƽ�Ű ���� ��
	    
		
		
	}


