package creator.factory.impl;

/**
 * @program: design
 * @description:
 * @author: sickle
 * @create: 2019-12-27 18:53
 **/
public class Div implements Operation {
    @Override
    public double getResult(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }
}
