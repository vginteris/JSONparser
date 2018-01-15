package parser.models;

public class Point {
    private String className;
    private float x;
    private float y;
    private String puid;


    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
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

    public String getPuid() {
        return puid;
    }

    public void setPuid(String puid) {
        this.puid = puid;
    }

    @Override
    public String toString() {
        return "Point{" +
                "className='" + className + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", puid='" + puid + '\'' +
                '}';
    }
}
