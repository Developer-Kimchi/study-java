package lambdaTask1;

//함수형 인터페이스 제작
@FunctionalInterface
public interface Calc {
//	두 정수를 전달받은 후 int로 리턴하는 calc 추상메소드 선언
   public int calc(int number1, int number2);
}