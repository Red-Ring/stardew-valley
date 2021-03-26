package src.第三部分_生成实例.SingletonMode;

/**
 * @author A80027
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    /**
     * 禁止类外部带哦用构造函数
     */
    private Singleton() {
        System.out.println("生成了一个实例！");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
