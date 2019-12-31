package creator.builder;

/**
 * @program: design
 * @description:
 * @author: sickle
 * @create: 2019-12-31 16:00
 **/
public class MealB extends Builder {
    @Override
    void buildFood() {
        meal.setFood("汉堡");
    }

    @Override
    void buildDrink() {
        meal.setDrink("果汁");
    }
}
