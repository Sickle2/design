package creator.singleton;

/**
 * @program: design
 * @description:
 * @author: sickle
 * @create: 2019-12-26 17:29
 **/
public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();

    /*
     * 还可以使用静态块进行实例的创建
     * */
    static {
        HungrySingleton ins = new HungrySingleton();
    }

    private HungrySingleton() {
    }

    /**
     * 因为已经创建了实体，所以每次不会发生同步问题，但是如果长时间没有访问会浪费空间
     *
     * @param
     * @return creator.singleton.HungrySingleton
     * @author: sickle
     * @Date: 2019/12/26 5:31 下午
     */
    public static HungrySingleton getInstance() {
        return instance;
    }
}
