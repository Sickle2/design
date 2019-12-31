package creator.builder;


/**
 * @program: design
 * @description:
 * @author: sickle
 * @create: 2019-12-31 15:43
 **/
public abstract class Builder {

    protected Meal meal = new Meal();

    abstract void buildFood();

    abstract void buildDrink();

    public Meal getResult() {
        return meal;
    }
}
