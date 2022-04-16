package string;

class Up{
	public String solusgstion(String str)
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