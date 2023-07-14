package pattern.factoryMethod;

public class RegularCar implements Car {
	// ConcreteProduct: 일반 자동차 클래스
	@Override
	public void drive() {
		System.out.println("일반 자동차가 주행합니다.");
	}
}
