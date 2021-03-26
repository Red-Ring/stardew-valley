package src.第一部分_适应设计模式.AdapterMode.使用委托的适配器;

/**
 * @author A80027
 */
public class Banner {
    private String str;

    public Banner(String str) {
        this.str = str;
    }

    public void showWithParen() {
        System.out.println("(" + str + ")");
    }

    public void showWithAster() {
        System.out.println("*" + str + "*");
    }

}
