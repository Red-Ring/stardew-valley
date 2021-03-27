package 第一部分_适应设计模式.IteratorMode;

/**
 * Iterator模式
 * 一个一个遍历
 *
 * @author A80027
 */
public class IteratorModeMain {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("深入理解JVM虚拟机"));
        bookShelf.appendBook(new Book("Java编程思想"));
        bookShelf.appendBook(new Book("Effective Java"));
        bookShelf.appendBook(new Book("图解设计模式"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
