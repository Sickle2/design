package creator.factory.abstractFactory;

/**
 * @program: design
 * @description:
 * @author: sickle
 * @create: 2019-12-30 13:15
 **/
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equals("circle")) {
            return new Circle();
        } else if (shape.equals("rectangle")) {
            return new Rectangle();
        } else if (shape.equals("square")) {
            return new Square();
        }
        return null;
    }
}
