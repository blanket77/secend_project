package Arithmetic;

public class Substration_H extends Arith{
	@Override
	void present(int random) {
		a = random % 8;
		b = 10 - (random%(8-a)+1);
		a += 10;
		result = a-b;	
	}

}
