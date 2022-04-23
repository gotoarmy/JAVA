package string;

class OnlyNumber {

	public String deletefrontzero(StringBuilder str)
	{ 
		String str2 =str.toString();
		char[] save = str2.toCharArray();
		int index=0;
		int i =0;
		while('0' == save[i])
		{			
			if('0' != save[i])
			{
				index =i;
				
			}
			else
			{
				i++;
				index++;
			}
		}
		str2 = str2.substring(index);
		return str2;
		
	}
    public String OnlyNum(String input)
    {
    	String re_str=null;
    	StringBuilder strbuild =new StringBuilder();
    	// 문자배열로 전환
    	char[] save =input.toCharArray();
    	//순회해서 숫자면 스트링빌데에append함
    	for(char c : save)
    	{
    	    if(c > 47 && c < 58)
    	    {
    	    	strbuild.append(c);
    	    }
    	}
    	//영지우기
    	//0이아닌인덱스반환
    	re_str = this.deletefrontzero(strbuild);             	 
    	return re_str;
    			
    }
	public String solu(String input)
	{
		String answer =null;
		//1.숫자로만 남긴다.
		answer =this.OnlyNum(input);	
		
		return answer;
	}
}
