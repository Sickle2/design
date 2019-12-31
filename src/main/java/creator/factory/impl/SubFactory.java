package creator.factory.impl;

/**
 * @program: design
 * @description:
 * @author: sickle
 * @create: 2019-12-27 19:03
 **/
public class SubFactory implements Factory {
    @Override
    public Operation createOperation() {
        return new Sub();
    }
}
