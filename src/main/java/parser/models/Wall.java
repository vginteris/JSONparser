package parser.models;

import java.util.List;

public class Wall {
    private String className;
    private String puid;
    private List<Point> items;


    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getPuid() {
        return puid;
    }

    public void setPuid(String puid) {
        this.puid = puid;
    }

    public List<Point> getItems() {
        return items;
    }

    public void setItems(List<Point> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "className='" + className + '\'' +
                ", puid='" + puid + '\'' +
                ", items=" + items +
                '}';
    }
}
