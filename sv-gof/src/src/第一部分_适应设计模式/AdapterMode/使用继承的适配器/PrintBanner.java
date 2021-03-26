package src.第一部分_适应设计模式.AdapterMode.使用继承的适配器;

/**
 * @author A80027
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String str) {
        super(str);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
