package src.第三部分_生成实例.PrototypeMode;

import java.util.HashMap;

/**
 * @author A80027
 */
public class Manager {
    private HashMap showCase = new HashMap();

    public void register(String name, Product proto) {
        showCase.put(name, proto);
    }

    public Product create(String protoName) {
        Product p = (Product) showCase.get(protoName);
        return p.createClone();
    }
}
