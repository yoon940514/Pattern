package pattern.factoryMethod;

//ConcreteCreator: 일반 자동차를 생성하는 구체적인 팩토리 클래스
public class RegularCarFactory extends CarFactory {
 @Override
 protected Car createCar() {
     return new RegularCar(); // 일반 자동차 객체 생성 후 반환
 }
}