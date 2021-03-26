package src.第三部分_生成实例.PrototypeMode;

/**
 * @author A80027
 */
public interface Product extends Cloneable {
    void use(String s);

    Product createClone();
}
