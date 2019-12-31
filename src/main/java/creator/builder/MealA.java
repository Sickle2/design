package creator.builder;

/**
 * @program: design
 * @description:
 * @author: sickle
 * @create: 2019-12-31 15:50
 **/
public class MealA extends Builder {

    @Override
    void buildFood() {
        meal.setFood("鸡腿");
    }

    @Override
    void buildDrink() {
        meal.setDrink("可乐");
    }
}
