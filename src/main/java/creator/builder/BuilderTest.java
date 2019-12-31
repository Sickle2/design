package creator.builder;

/**
 * @program: design
 * @description:
 * @author: sickle
 * @create: 2019-12-31 15:53
 **/
public class BuilderTest {
    public static void main(String[] args) {
        Builder builder = new MealA();
        Director director = new Director(builder);
        Meal a = director.construct();
        System.out.println(a.getDrink() + "     " + a.getFood());
    }
}
