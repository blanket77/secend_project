package Arithmetic;

public abstract class Arith {
	protected int a;
	protected int b;
	protected int result;
	protected int random1;
	protected int random2;

	
	public int get_a()
	{
		return this.a;
	}
	public int get_b()
	{
		return this.b;
	}
	
	public int get_result()
	{
		return this.result;
	}
	

	
	abstract public void present();
}
