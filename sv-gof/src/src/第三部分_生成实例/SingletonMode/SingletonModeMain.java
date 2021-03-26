package src.第三部分_生成实例.SingletonMode;

public class SingletonModeMain {
    public static void main(String[] args) {
        System.out.println("Start.");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if (obj1 == obj2) {
            System.out.println("obj1与obj2是相同的实例");
        } else {
            System.out.println("obj1与obj2是不同的实例");
        }
    }
}
