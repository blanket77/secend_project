package Arithmetic;

public class Substration_H extends Arith{
	@Override
	public void present() {
		random1 = (int)(Math.random()*17 + 10);
		random2 = (int)(Math.random()*23 + 10);
		a = random1 % 8;
		b = 10 - (random2%(8-a)+1);
		a = a + 10;
		result = a-b;	
	}

}
