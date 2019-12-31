package creator.singleton;

/**
 * @program: design
 * @description: 懒汉式单例
 * @author: sickle
 * @create: 2019-12-26 17:22
 **/
public class LazySingleton {
    private static volatile LazySingleton instance = null;

    private LazySingleton() {
    }

    /**
     * 如果是并发环境下，加synchronized能解决并发问题，但是加锁比较耗费时间，不是最优解
     *
     * @param
     * @return creator.singleton.LazySingleton
     * @author: sickle
     * @Date: 2019/12/26 5:26 下午
     */
    public synchronized LazySingleton getInstance() {

        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
