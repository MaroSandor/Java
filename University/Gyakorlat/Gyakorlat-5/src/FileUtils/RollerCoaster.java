package FileUtils;

public class RollerCoaster {
    String name;
    String world;
    int height;
    int time;

    public RollerCoaster(String name, String world, int height, int time) {
        this.name = name;
        this.world = world;
        this.height = height;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return this.name + "(" + this.world + ") " + this.time;
    }
}
