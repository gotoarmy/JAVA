package static_overide;

public class citizen extends Human {

	protected int Jailcount = 0;
	protected int citizennum = 0;
	
	public citizen(String s_name,String s_num,int num) 
	{
		super(s_name,s_num); //����Ŭ���� ������ ������
		citizennum = num;
	}
	 public void arrested()
	    {
	    	this.Jailcount++;
	    }
	
	
}
