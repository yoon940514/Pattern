package pattern.factoryMethod;

//Creator: 자동차를 생성하는 추상 클래스
public abstract class CarFactory {
 public void doDrive() {
     Car car = createCar(); // 팩토리 메서드를 호출하여 자동차를 생성
     car.drive(); // 생성된 자동차의 주행 메서드 호출
 }

 protected abstract Car createCar(); // 팩토리 메서드 정의
}
