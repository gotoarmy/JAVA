package static_overide;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Human bruce = new Human("������","010-4764-5564");
          bruce.Greeting();
          citizen lonelyguy =new citizen("��xx��ÿ���","010-2591-3401",10);
          lonelyguy.Greeting();
          lonelyguy.weeping();
          lonelyguy.weeping();
          lonelyguy.weeping();
          Cob cob= new Cob("�庸��","010","������");
          cob.arrestbitchingguy(lonelyguy);
          // -����� ��ӹ��� �ù��� ����
          // -�λ�
          // -�ùε��� ¡¡�Ÿ�(weeping)�� �޾��������� weepping �Ҷ����� class static int zingzing�� ����
          // -������ ���� ¡¡�Ÿ��� ����� ��ư�,�� ��� �ùε��� jail����.
	}

}
