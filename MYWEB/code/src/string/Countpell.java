package string;

class Countpell {

	int pellcount =0; // 유효한 팰린드롬의 갯수를 샘
	
	
	public String reversestr(String input)
	{
	 
		int i=0;
		int j=0;
		char[] save =input.toCharArray();
		j = (save.length);
		j -=1;
		int loopcount = save.length/2;		
	    for(int k =0; k<loopcount; k++)
	    {
		    	char temp= 0;
		    	temp = save[i];
			    save[i] =save[j];
			    save[j] =temp;
			    i++;
			    j--;
	    }   
		  String reverse = new String(save);// 스트링 생성하고 생성자에 문자열을 넣으면됨
		   return reverse;
	}
    public boolean isalpha(char c)
    {
    	if(c >64 && c <91)
    		return true;
    	else
    		return false;
    }
	public String toupper(String input) //대문자로 만듦
	   {
		char[]save =input.toCharArray();
		  int i = 0;
		  for(char x :save)
		  {
			  if(x >96 && x <123)
			  {
				  x -=32;
				  save[i] = x; 
			  }
			  i++;
		  }
		  String str =new String(save);
		   return (str);
	   }
	public void isalphasame(String _front, String _back)
	{
		char[] front = _front.toCharArray();
		char[] back = _back.toCharArray();
		  
		int iloopcount = front.length;
		int samecount =0;
		
		  for (int i =0; i < iloopcount; i++)
		  {
			//알파뱃인지 체크 - 문자이면 비교하고 아니면 넘어간다  
				if(this.isalpha(front[i]) && this.isalpha(back[i]))  //두개 다 문자일경우
				{
				   if(front[i]==back[i])
					   samecount++;				   
				}
				  
				
		  }
		 if (samecount == iloopcount)
		 {
			 this.pellcount++;
		 }
		  
		
	}
	public String alphaonly (String _front)
	{
	  StringBuilder strbuil = new StringBuilder();
	  String return_Str =null;
	  char[]save =_front.toCharArray();
	  int i = 0;
	  for(char x :save)
	  {
		  if(x >64 && x <91)
		  {
			 strbuil.append(x);
		  }
		  i++;
	  }
	  return_Str =strbuil.toString();
	  return return_Str;
	}
	public String solu(String input1) {
		// TODO Auto-generated method stub
		String answer=null;
		int i = 0;
		int j;
		String[] arr1 =input1.split(" ");
		j = (arr1.length);
		j -=1;
		int loopcount = arr1.length/2;		
	    for(int k =0; k<loopcount; k++)
	    {
		    	//단어별로 분리된 스트링 배열을 비교한다 처음과 끝 비교
	    	    String front = arr1[i];
	    	    String back =  arr1[j];		
	    	    //뒷문자 뒤집기 뒤집어서 back에 넣음
	    	    back = this.reversestr(back);
	    	    // 두 스트링을 대문자로
	    	front = this.toupper(front);
	    	back = this.toupper(back);
	    	//같은지 확인하기전에 알파뱃만 모은다
	    	front = this.alphaonly(front);
	    	back =this.alphaonly(back);
	    	this.isalphasame(front, back);	    		    	    	    	   
	    	i++;
	    	j--;
	    }
	    
       if(this.pellcount == loopcount )
       {
    	   answer = "YES";
       }
       else
       {
    	   answer = "NO";
       }
		
		return answer;
	}

}
