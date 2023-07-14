package pattern.abstractFactory;

//ConcreteAbstractFactory
public class ConcreteFactoryB implements AbstractFactory {
 @Override
 public ConcreteProductB createProduct() {
     return new ConcreteProductB();
 }
}