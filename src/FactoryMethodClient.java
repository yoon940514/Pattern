import pattern.factoryMethod.CarFactory;
import pattern.factoryMethod.RegularCarFactory;
import pattern.factoryMethod.SportsCarFactory;

public class FactoryMethodClient {

	// 클라이언트 코드
	public static void main(String[] args) {
		CarFactory factory = new SportsCarFactory();
		factory.doDrive(); // 스포츠카 생성 및 주행

		factory = new RegularCarFactory();
		factory.doDrive(); // 일반 자동차 생성 및 주행
	}
}
