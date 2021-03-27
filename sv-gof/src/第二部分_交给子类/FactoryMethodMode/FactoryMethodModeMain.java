package 第二部分_交给子类.FactoryMethodMode;

public class FactoryMethodModeMain {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小红");
        Product card3 = factory.create("小智");
        card1.use();
        card2.use();
        card3.use();
    }
}
