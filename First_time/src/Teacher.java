
public class Teacher{
	//check
	private int good;  private int bad;
	
	//time
	private long pastTime;  private long nowTime; 	private int dif;
	private int timer;
	
	//패스워드
	private String passward = "Korea";
	
	// 타이머를 설정한다.
	public void setTimer(int timer)
	{
		this.timer = timer*60;
	}
	
	// 시작한다.
	public void start()
	{
		this.pastTime = System.currentTimeMillis();   //1000 = 1초
	}
	
	// 해당 시간이 지났는지 확인한다.
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
	
	//패스워드를 입력하면 지금 시간과 차이를 초기화하고 결과를 출력한다. 그리고 참 또는 거짓을 반환한다.
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
	
	// 맞았다는 것을 출력한다.
	public void TrueTalk()
	{
		this.good++;
		System.out.println("맞았습니다.");
	}
	
	// 틀렸다는 것을 출력한다.
	public void FalseTalk(int a, int b, int result, char op)
	{
		this.bad++;
		System.out.printf("틀렸습니다. %d %c %d = %d입니다.\n", a, op, b ,result);
	}
	
	
	//지금 시간 몇시인지 그리고 그 차이를 초기화한다.
	void setdif()
	{
		this.nowTime = System.currentTimeMillis();
		dif = (int)((nowTime - pastTime) /1000);
	}
	
	// 결과를 출력한다.
	void lastTalk()
	{
		int min, sec;
		min = dif/60; sec = dif%60;
		System.out.printf("걸린 시간 : %d분 %d초\n", min, sec);
		System.out.printf("맞힌 갯수는 %d개, 틀린 갯수는 %d개\n", good, bad);
	}
}