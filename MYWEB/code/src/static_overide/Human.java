package static_overide;

public class Human {
	protected String s_name;
    protected String s_number;

    static int zingzing = 0;
    public Human(String name,String number)
    {
    	this.s_name = name;
    	this.s_number = number;
    }
    public void Greeting()
    {
    	System.out.print("�ݰ����ϴ�.\n"+this.s_name+"�Դϴ�."+"\n" );
    	System.out.print("�� ��ȣ��:"+this.s_number+"�Դϴ�.");
    }
    public void weeping()
    {
    	System.out.print("\n¡¡¡¡ ����������� ¡¡¡¡");
    	zingzing++;
    }
  
}

