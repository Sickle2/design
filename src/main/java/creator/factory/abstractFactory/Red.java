package creator.factory.abstractFactory;

/**
 * @program: design
 * @description:
 * @author: sickle
 * @create: 2019-12-30 11:38
 **/
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("This is Red::fill()");
    }
}
