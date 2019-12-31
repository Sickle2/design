package creator.factory.impl;

/**
 * @program: design
 * @description:
 * @author: sickle
 * @create: 2019-12-27 18:51
 **/
public class Add implements Operation {
    @Override
    public double getResult(double num1, double num2) {
        return num1 + num2;
    }
}
