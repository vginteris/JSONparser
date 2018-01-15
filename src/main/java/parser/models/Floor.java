package parser.models;

import java.util.List;

public class Floor {
    private String className;
    private String name;
    private String puid;
    private List<Room> items;


    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPuid() {
        return puid;
    }

    public void setPuid(String puid) {
        this.puid = puid;
    }

    public List<Room> getItems() {
        return items;
    }

    public void setItems(List<Room> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Floor{" +
                "className='" + className + '\'' +
                ", name='" + name + '\'' +
                ", puid='" + puid + '\'' +
                ", items=" + items +
                '}';
    }
}
