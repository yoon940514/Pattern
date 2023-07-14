import pattern.abstractFactory.*;

public class AbstractFactoryClient {

	public static void main(String[] args) {
		AbstractFactory factoryA = new ConcreteFactoryA();
        AbstractProduct productA = factoryA.createProduct();
        productA.performAction();

        AbstractFactory factoryB = new ConcreteFactoryB();
        AbstractProduct productB = factoryB.createProduct();
        productB.performAction();

	}

}
