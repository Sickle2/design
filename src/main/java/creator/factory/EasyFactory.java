package creator.factory;

import creator.factory.impl.*;

import java.lang.reflect.InvocationTargetException;

/**
 * @program: design
 * @description:
 * @author: sickle
 * @create: 2019-12-27 18:05
 **/
public class EasyFactory {
    public static Operation createOperation(String name) {
        Operation obj = null;
        switch (name) {
            case "+":
                obj = new Add();
                break;
            case "-":
                obj = new Sub();
                break;
            case "*":
                obj = new Mul();
                break;
            case "/":
                obj = new Div();
                break;
        }
        return obj;
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Operation add = EasyFactory.createOperation("+");
        Operation sub = EasyFactory.createOperation("-");
        Operation mul = EasyFactory.createOperation("*");
        Operation div = EasyFactory.createOperation("/");

        System.out.println(add.getResult(1, 1));
        System.out.println(sub.getResult(1, 1));
        System.out.println(mul.getResult(1, 1));
        System.out.println(div.getResult(1, 1));

        // 使用反射机制实例化工厂对象，因为字符串是可以通过变量改变的
        Factory addFactory = (Factory) Class.forName("creator.factory.impl.AddFactory").getDeclaredConstructor().newInstance(new Object());
        Factory subFactory = (Factory) Class.forName("creator.factory.impl.SubFactory").newInstance();

        // 通过工厂对象创建相应的实例对象
        Operation add1 = addFactory.createOperation();
        Operation sub1 = subFactory.createOperation();

        System.out.println(add1.getResult(1, 1));
        System.out.println(sub1.getResult(1, 1));
    }
}
