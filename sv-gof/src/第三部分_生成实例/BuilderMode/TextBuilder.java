package 第三部分_生成实例.BuilderMode;

public class TextBuilder extends Builder {
    private StringBuffer sb = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        sb.append("======================================\n");
        sb.append("[" + title + "]\n");
        sb.append("\n");
    }

    @Override
    public void makeString(String str) {
        sb.append('■' + str + "\n");
        sb.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            sb.append("·" + items[i] + "\n");
        }
        sb.append("\n");
    }

    @Override
    public void close() {
        sb.append("======================================\n");
    }

    public String getResult() {
        return sb.toString();
    }
}
