package static_overide;

public class Annoyingman extends citizen implements bitching {
	int bitchingcount = 0;
	public Annoyingman(String name,String num,int number)
	{
		super(name,num,number);
		super.citizennum =number;
	}
	
	@SuppressWarnings("static-access")
	public void doingzingzing()
	{
		super.zingzing++;
	}
	
	@SuppressWarnings("static-access")
	public void doingnosense()
	{
		super.zingzing++;
	}

	@Override
	@SuppressWarnings("static-access")
	public void doingsenseno() {
		// TODO Auto-generated method stub
		super.zingzing++;
	}

}
