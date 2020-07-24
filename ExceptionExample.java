
class ArthimeticTest{
	public void division(int num1,int num2) {
		int result=num1/num2;
		System.out.println("result"+result);
	}
}
public class ExceptionExample {
  public static void main(String[] args) {
	ArthimeticTest test=new ArthimeticTest();
	test.division(100, 0);
}
}
