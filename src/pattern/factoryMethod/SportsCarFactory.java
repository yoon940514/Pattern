package pattern.factoryMethod;

//ConcreteCreator: 스포츠카를 생성하는 구체적인 팩토리 클래스
public class SportsCarFactory extends CarFactory {
 @Override
 protected Car createCar() {
     return new SportsCar(); // 스포츠카 객체 생성 후 반환
 }
}