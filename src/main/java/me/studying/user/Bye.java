package me.studying.user;

public class Bye {
    private String prefix;

    private String name;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bye{" +
                "prefix='" + prefix + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
