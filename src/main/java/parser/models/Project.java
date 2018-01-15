package parser.models;

import java.util.List;

public class Project
{
    private String className;
    private int width;
    private int height;
    private List<Floor> items;


    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public List<Floor> getItems() {
        return items;
    }

    public void setItems(List<Floor> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Project{" +
                "className='" + className + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", items=" + items +
                '}';
    }
}
