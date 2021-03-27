package 第三部分_生成实例.PrototypeMode;

public class PrototypeModeMain {
    public static void main(String[] args) {
        //准备
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("Strong message", upen);
        manager.register("Warning box", mbox);
        manager.register("Slash box", sbox);
        //生成
        Product p1 = manager.create("Strong message");
        p1.use("Hello,World.");
        Product p2 = manager.create("Warning box");
        p2.use("Hello,World.");
        Product p3 = manager.create("Slash box");
        p3.use("Hello,World.");
    }
}
