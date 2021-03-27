package 第二部分_交给子类.TemplateMethodMode;

public class TemplateMethodModeMain {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        d1.display();
    }
}
