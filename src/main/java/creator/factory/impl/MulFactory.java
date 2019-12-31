package creator.factory.impl;

/**
 * @program: design
 * @description:
 * @author: sickle
 * @create: 2019-12-27 19:02
 **/
public class MulFactory implements Factory {
    @Override
    public Operation createOperation() {
        return new Mul();
    }
}
