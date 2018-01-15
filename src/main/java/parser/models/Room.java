package parser.models;

import java.util.List;

public class Room {
    private String className;
    private String puid;
    private float x;
    private float y;
    private float sX;
    private float sY;
    private List<Wall> items;

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

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getsX() {
        return sX;
    }

    public void setsX(float sX) {
        this.sX = sX;
    }

    public float getsY() {
        return sY;
    }

    public void setsY(float sY) {
        this.sY = sY;
    }

    public List<Wall> getItems() {
        return items;
    }

    public void setItems(List<Wall> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Room{" +
                "className='" + className + '\'' +
                ", puid='" + puid + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", sX=" + sX +
                ", sY=" + sY +
                ", items=" + items +
                '}';
    }
}
