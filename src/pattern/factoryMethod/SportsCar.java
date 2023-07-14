package pattern.factoryMethod;

public class SportsCar implements Car{
	// ConcreteProduct: 스포츠카 클래스
	@Override
	public void drive() {
		System.out.println("스포츠카가 주행합니다.");
	}

}
