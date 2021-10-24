package Behavior.Interpreter;

public class ExpressionApp {
    public static void main(String[] args) {
        Expression n1 =new NumberExpression(5);
        Expression n2 =new NumberExpression(6);
        Expression n3 =new NumberExpression(3);
        Expression n4 =new NumberExpression(9);

        Expression plus =new PlusExpression(n1, n2);
        Expression minus =new MinusExpression(plus, n3);
        Expression expression =new PlusExpression(minus, n4);
        System.out.println(expression.interpret());
    }
}
