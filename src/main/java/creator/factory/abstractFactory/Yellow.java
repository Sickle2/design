package creator.factory.abstractFactory;

/**
 * @program: design
 * @description:
 * @author: sickle
 * @create: 2019-12-30 13:08
 **/
public class Yellow implements Color {
    @Override
    public void fill() {
        System.out.println("This is Yellow::fill");
    }
}
