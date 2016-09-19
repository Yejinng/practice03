package prob4;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		// Scanner 와 String 클래스의 split 함수를 사용합니다.

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print(">>");
			String expression = scanner.nextLine();
			if ("quit".equals(expression) == true) {
				break;
			}
			
			String[] tokens = expression.split(" ");
			int lvalue = Integer.parseInt(tokens[0]);
			String operator = tokens[1];
			int rvalue = Integer.parseInt(tokens[2]);

			switch(operator) {
			case "+" :
			Add a = new Add();
			a.setValue(lvalue, rvalue);
			System.out.println(a.calculate);
			break;
			
			case "-" :
			Sub s = new Sub();
			s.setValue(lvalue, rvalue);
			System.out.println(s.calculate);
			break;
			
			case "*" :
			Mul m = new Mul();
			m.setValue(lvalue, rvalue);
			System.out.println(m.calculate);
			break;
			
			case "/" :
			Div d = new Div();
			d.setValue(lvalue, rvalue);
			System.out.println(d.calculate);
			break;
			}
		}
			scanner.close();
		
	}
}
