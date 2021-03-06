import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import Arithmetic.Arith;
import Arithmetic.Substration;
import Arithmetic.Substration_H;
import Arithmetic.Sum;
import Arithmetic.Sum_H;

public class Main {
	static char op = 0 ;
	static String level = null;
	static boolean bol = true;
	static Teacher t1 = new Teacher();
	static String user_input;
	static int user_int;
	static int tmp;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		boolean b = true;
		while(b) {
			System.out.println("어떤 문제를 풀것인가요? (+,-,*,/) 중 하나만 입력하세요");
			op = br.readLine().charAt(0);
			if(op == '+' || op == '-' || op == '*' || op == '/')
				b = false;
		}
		
		b= true;
		while(b) {
			System.out.println("난이도는? (Hard, Easy) 중 하나만 입력하세요");	
			level = br.readLine();
			if(level.equals("Hard")|| level.equals("Easy"))
				b = false;		
		}
		
		System.out.println("타이버를 몇분으로 할 것인가요?");
		t1.setTimer(Integer.parseInt(br.readLine()));
		t1.start();
		
		

		switch (op) {
		case '+': {
			if(level.equals("Hard")){
				Sum_H hs = new Sum_H();
				while(bol) {
					hs.present();
					implement(hs);
				}
				break;			
			}
			else {
				Sum es = new Sum();
				while(bol) {
					es.present();
					implement(es);
				}
				break;
			}
		}
		
		case '-': {
			if(level.equals("Hard"))	{
				Substration_H sub_H = new Substration_H();
				while(bol) {
					sub_H.present();
					implement(sub_H);
				}
				break;			
				}
			else {
				Substration sub = new Substration();
				while(bol) {
					sub.present();
					implement(sub);
				}
				break;
			}
		}
		
		default:
			throw new Error("입력값이 잘못되었습니다.");
		}
		
		br.close();
		bw.close();
	}
	static void implement(Arith es) throws IOException {
		boolean b = true;
		while(b) {
			System.out.println(es.get_a() + " " + op +" " + es.get_b() + " = ?");
			user_input = br.readLine();
			if(t1.stop(user_input)) {
				bol = false;
				return;
			}
			for(int i =0; i< user_input.length();i++) {
				if(user_input.charAt(i)>='0' && user_input.charAt(i)<='9')
					b = false;
			}
		}
		
			user_int = Integer.parseInt(user_input);
			if(user_int == es.get_result())
				t1.TrueTalk();
			else
				t1.FalseTalk(es.get_a(), es.get_b(), es.get_result(), op);
			bol = t1.check();
	}
	
}



