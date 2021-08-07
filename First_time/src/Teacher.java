
public class Teacher{
	//check
	private int good;  private int bad;
	
	//time
	private long pastTime;  private long nowTime; 	private int dif;
	private int timer;
	
	//�н�����
	private String passward = "Korea";
	
	// Ÿ�̸Ӹ� �����Ѵ�.
	public void setTimer(int timer)
	{
		this.timer = timer*60;
	}
	
	// �����Ѵ�.
	public void start()
	{
		this.pastTime = System.currentTimeMillis();   //1000 = 1��
	}
	
	// �ش� �ð��� �������� Ȯ���Ѵ�.
	public boolean check()
	{
		this.setdif();
		if(dif >= timer)
		{
			this.lastTalk();
			return false;
		}
		return true;
	}
	
	//�н����带 �Է��ϸ� ���� �ð��� ���̸� �ʱ�ȭ�ϰ� ����� ����Ѵ�. �׸��� �� �Ǵ� ������ ��ȯ�Ѵ�.
	public boolean stop(String passward)
	{
		if (this.passward.equals(passward))
		{
			this.setdif();
			this.lastTalk();
			return true;
		}
		return false;
	}
	
	// �¾Ҵٴ� ���� ����Ѵ�.
	public void TrueTalk()
	{
		this.good++;
		System.out.println("�¾ҽ��ϴ�.");
	}
	
	// Ʋ�ȴٴ� ���� ����Ѵ�.
	public void FalseTalk(int a, int b, int result, char op)
	{
		this.bad++;
		System.out.printf("Ʋ�Ƚ��ϴ�. %d %c %d = %d�Դϴ�.\n", a, op, b ,result);
	}
	
	
	//���� �ð� ������� �׸��� �� ���̸� �ʱ�ȭ�Ѵ�.
	void setdif()
	{
		this.nowTime = System.currentTimeMillis();
		dif = (int)((nowTime - pastTime) /1000);
	}
	
	// ����� ����Ѵ�.
	void lastTalk()
	{
		int min, sec;
		min = dif/60; sec = dif%60;
		System.out.printf("�ɸ� �ð� : %d�� %d��\n", min, sec);
		System.out.printf("���� ������ %d��, Ʋ�� ������ %d��\n", good, bad);
	}
}