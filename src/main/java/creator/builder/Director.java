package creator.builder;

/**
 * @program: design
 * @description:
 * @author: sickle
 * @create: 2019-12-31 15:51
 **/
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Meal construct() {
        builder.buildDrink();
        builder.buildFood();
        return builder.getResult();
    }
}
