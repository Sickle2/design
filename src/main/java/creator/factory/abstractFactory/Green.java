package creator.factory.abstractFactory;

/**
 * @program: design
 * @description:
 * @author: sickle
 * @create: 2019-12-30 11:40
 **/
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("This is Green::fill");
    }
}
