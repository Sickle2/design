package creator.factory.abstractFactory;

/**
 * @program: design
 * @description:
 * @author: sickle
 * @create: 2019-12-30 13:21
 **/
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equals("red")) {
            return new Red();
        } else if (color.equals("yellow")) {
            return new Yellow();
        } else if (color.equals("green")) {
            return new Green();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
