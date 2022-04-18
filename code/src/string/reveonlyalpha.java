package string;

class reveonlyalpha {
    
	public void changing( char[] save, int front,int back)
	{
		char temp = save[front];
		save[front] =save[back];
		save[back] = temp;
		
	}
	public boolean isthatalpha(char alpha)
	{
		if (alpha>64 && alpha <91)
		{
			return true;
		}
		else if(alpha>96 && alpha<123)
		{
		    return true;
		}
		else
		{
			return false;
		}
	}
	public void reverse(String input)
	{
		
		int front=0;
		int back=0;
		char[] save =input.toCharArray();
		back = (save.length);
		back -=1;
		boolean alpha = false;
		int diff =0;
		while( 1 != (back -front)) //인접하지 않으면 계속반복
		{
			if(front == back)
			{
				break;
			}
			char frontc = save[front];
			char backc = save [back];
			alpha =this.isthatalpha(save[front]); // 앞 요소는 영어일까
			if(alpha) //앞이 영어
			{
				//뒤가 특수문자 인지 영어인지확인
				alpha =this.isthatalpha(save[back]);
				if(alpha) //뒤가 영어
				{
				     this.changing(save, front, back);
				     back--;
				     front++;
				}
				else //뒤가 영어가 아니야
				{
					back--; //영어가 나올때까지 뒷요소 1단계하강 
					//front는 그대로
				}
			}
			else  //영어가 아님
			{
				
				alpha =this.isthatalpha(save[back]);
				if (alpha) //뒷문자는 영어인경우  
				{
				   //넘어감
				}
				else //뒷문자가 특수문자인경우
				{
					back--;
				}
				
				
				front++; //영어가 나올때까지 1단계상승
			}
		}
		// 반복문이 끝났으니 인접항 비교만 남음
		alpha = this.isthatalpha(save[front]);
		if (alpha)
		{
			alpha =this.isthatalpha(save[back]);
			if  (alpha)
			{
				this.changing(save, front, back);
			}
		}
		else //앞이 특수문자
		{
		  //아무것도 하지 않음    	
		}				 
	    System.out.println(save);
		
	}
}
