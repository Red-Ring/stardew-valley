package src.第一部分_适应设计模式.AdapterMode.使用委托的适配器;

public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(String str) {
        this.banner = new Banner(str);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }

}
