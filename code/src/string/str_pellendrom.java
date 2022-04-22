package string;

 class str_pellendrom {

	 public String onlyalpha(String input)
	 {
		 StringBuilder strbuil = new StringBuilder();
		 char[] save = input.toCharArray();
		 
		 for (char c : save)
		 {
			 if(c > 64 && c <91) //대문자인경우;
			 {
				 strbuil.append(c);
			 }
			 if(c > 96 && c <123)
			 {
				 c -=32;
				 strbuil.append(c);
			 }
		 }
		 String re_str =strbuil.toString();
		 return re_str;
	 }
	   public boolean isalphasame(String a)  
	   {
		   char[] save =a.toCharArray();
		   int loopcount = save.length;	
			int count =0;
		    int i =0;
			int j=0;
			j = (save.length);
			j -=1;
			
		    for(int k =0; k<loopcount; k++)
		    {	        
			    if(save[i]==save[j]) 
			      {count++;}		    
			    i++;
			    j--;		    	
		    }   
		    
		    if (count == loopcount) 
		       { return true; }	
		    else 
		     { return false; }     
	   }
	 public String solu(String input)
	 {
		 String answer = null;
		 
		 // 1. 문자열에 알파뱃을 제거 하고 다없애기 ,대문자화 ok;
		 String alpha =this.onlyalpha(input);		 
		 // 2.front back 에서 하나하나씩확인
	     boolean same =this.isalphasame(alpha);	  
		 if (same)
		 {
			 answer ="YES";					
		 }
		 else
		 {
			 answer ="NO";
		 }
		 
		 return answer;
	 }
}
