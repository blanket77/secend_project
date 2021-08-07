package Arithmetic;

public class Sum_H extends Arith{

	@Override
	public void present() {
		random1 = (int)(Math.random()*17 + 10);
		random2 = (int)(Math.random()*23 + 10);
		this.a = random1%6+4;
		this.b = random2%(this.a-2) + 12 - this.a;
		this.result = a+b;
	}

}
