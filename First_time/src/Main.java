import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import Arithmetic.Arith;
import Arithmetic.Sum;

public class Main {
		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char op = 0 ;
		String level = null;
		boolean bol = true;
		Teacher t1 = new Teacher();
		String user_input;
		int user_int;
		
		boolean b = true;
		while(b) {
			System.out.println("� ������ Ǯ���ΰ���? (+,-,*,/) �� �ϳ��� �Է��ϼ���");
			op = br.readLine().charAt(0);
			if(op == '+' || op == '-' || op == '*' || op == '/')
				b = false;
		}
		
		b= true;
		while(b) {
			System.out.println("���̵���? (Hard, Easy) �� �ϳ��� �Է��ϼ���");	
			level = br.readLine();
			if(level.equals("Hard")|| level.equals("Easy"))
				b = false;		
		}
		
		System.out.println("Ÿ�̹��� ������� �� ���ΰ���?");
		t1.setTimer(Integer.parseInt(br.readLine()));
		t1.start();
		
		
		int tmp;
		switch (op) {
		case '+': {
			if(level == "Hard")	{
				System.out.println("hello");
				break;
			}
			else {
				Sum es = new Sum();
				while(bol) {
					tmp = (int)(Math.random()*17 + 10);
					es.present(tmp);
					System.out.println(es.get_a() + " " + op +" " + es.get_b() + " = ?");
					user_input = br.readLine();
					if(t1.stop(user_input)) 
						break;
					
					user_int = Integer.parseInt(user_input);
					if(user_int == es.get_r())
						t1.TrueTalk();
					else
						t1.FalseTalk(es.get_a(), es.get_b(), es.get_r(), op);
					bol = t1.check(); 
				}
				break;
			}
		}
		default:
			throw new Error("�Է°��� �߸��Ǿ����ϴ�.");
		}
		
		br.close();
		bw.close();
	}
// �ȳ�
}


