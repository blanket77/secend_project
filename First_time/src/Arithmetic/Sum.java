package Arithmetic;

public class Sum extends Arith{

	public void present() {
		random1 = (int)(Math.random()*17 + 10);
		random2 = (int)(Math.random()*23 + 10);
		this.a = random1%8+1;
		this.b = random2%(9-this.a)+1;
		this.result = a+b;
	};
}