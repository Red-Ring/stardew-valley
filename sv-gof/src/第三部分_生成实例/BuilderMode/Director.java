package 第三部分_生成实例.BuilderMode;

import java.io.IOException;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() throws IOException {
        builder.makeTitle("Greeting");
        builder.makeString("Greeting");
        builder.makeItems(new String[]{
                "晚上好。",
                "晚安。",
                "再见。"
        });
        builder.close();
    }
}
