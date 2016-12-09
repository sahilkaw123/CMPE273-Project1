package clockpkg;

import java.util.Stack;

public class StringEvalUsingStack 
{
	public static int calculate(String input)
	{
		char[] expression = input.toCharArray();
		 Stack<Integer> number = new Stack<Integer>();
		 Stack<Character> opp = new Stack<Character>();
		
		for (int i = 0; i <expression.length; i++)
		{
			if(expression[i] == ' ') 
				continue;
			if (expression[i] >= '0' && expression[i] <='9')
			{
				StringBuffer buf = new StringBuffer();
				 while (i < expression.length && expression[i] >= '0' && expression[i] <='9')
				 {
					 buf.append(expression[i++]);
				 }
					number.push(Integer.parseInt(buf.toString()));
				 }
			else if (expression[i] =='(')
			{
				opp.push(expression[i]);
				}
			
			
			else if(expression[i] ==')'){
				while (opp.peek() != '('){
					number.push(opperation(opp.pop(), number.pop(), number.pop()));
				}
					opp.pop();}
			
			else if(expression[i] =='+' || expression[i] =='*' || 
					expression[i] =='/' || expression[i] =='-')
			{
				while(!opp.empty()&& setPriority(expression[i], opp.peek()))
				{
					number.push(opperation(opp.pop(), number.pop(), number.pop()));
					}
					opp.push(expression[i]);
				}
					
			}
			
			while (!opp.empty()){
				number.push(opperation(opp.pop(), number.pop(), number.pop()));
			}
		return number.pop();	
	}
		
	public static boolean setPriority(char oppe1, char oppe2)
	{
		if (oppe2 == '(' || oppe2 == ')')
			return false;
		if ((oppe1 == '*' || oppe1 == '/') && (oppe2 == '+' || oppe2 == '-'))
			return false;
		else
			return true;
	}	

public static int opperation(char oppr, int x, int y){
	switch(oppr){
	case '+':
		return x+y;
	case '*':
		return x*y;
	case '-':
		return x-y;
	case '/':
		return x/y;
		}
	return 0;
}

public static void main(String [] args){
	System.out.println(StringEvalUsingStack.calculate("50 + 3 * 4"));
	System.out.println(StringEvalUsingStack.calculate("12 * 4 + 32"));
}
}

