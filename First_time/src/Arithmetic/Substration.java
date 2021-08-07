package Arithmetic;

public class Substration extends Arith{
		@Override
		void present(int random) {
			a = random%6+4;
			b =random%(a-3)+2;
			result = a-b;
		}
}
