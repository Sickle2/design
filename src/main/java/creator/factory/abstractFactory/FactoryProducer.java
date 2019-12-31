package creator.factory.abstractFactory;

/**
 * @program: design
 * @description:
 * @author: sickle
 * @create: 2019-12-30 13:22
 **/
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        }
        if (choice.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }
        return null;
    }
}
