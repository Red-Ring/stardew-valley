package 第一部分_适应设计模式.AdapterMode.使用委托的适配器;

public class AdapterModeMain {
    public static void main(String[] args) {
        Print print = new PrintBanner("Hello");
        print.printWeak();
        print.printStrong();
    }
}
