package static_overide;

public class Cob extends Human {
	
	private String workingplace;
	public Cob(String name, String number,String work) {
		super(name, number); //���� Ŭ���� ������ �����ε�
		workingplace = work;
		// TODO Auto-generated constructor stub
	}
    @SuppressWarnings("static-access")
	public void arrestbitchingguy(citizen people)
    {
    	
    	if (0 < super.zingzing)
    	{
    		System.out.print("�� �� ¡¡��� �ֹε������ ���ô�.\n�������� ���ô�");
    		//people�� �ɹ������� �����ͼ� ������Ű�� �ʹ�.
    		//citizen arrested �Լ��� ȣ���ؼ� �ٲ۴�.
    		people.arrested();
    	}
    }
    
    
	
    
}
