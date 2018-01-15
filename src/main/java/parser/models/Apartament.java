package parser.models;

public class Apartament {
    private String hash;
    private String name;
    private Project data;


    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Project getData() {
        return data;
    }

    public void setData(Project data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Apartament{" +
                "hash='" + hash + '\'' +
                ", name='" + name + '\'' +
                ", data=" + data +
                '}';
    }
}
