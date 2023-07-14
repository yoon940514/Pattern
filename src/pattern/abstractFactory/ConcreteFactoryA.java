package pattern.abstractFactory;

//ConcreteAbstractFactory
public class ConcreteFactoryA implements AbstractFactory {
	 @Override
    public ConcreteProductA createProduct() {
	        return new ConcreteProductA();
    }
}