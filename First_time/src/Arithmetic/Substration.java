package Arithmetic;

public class Substration extends Arith{
	@Override
	public void present() {
		random1 = (int)(Math.random()*17 + 10);
		random2 = (int)(Math.random()*23 + 10);
		a = random1%6+4;
		b = random2%(a-3)+2;
		result = a-b;
	}
}
