package nl.codegorilla.CodeGorilla.model;

public class Zoo {
    private String name;
    private Location location;

    public Zoo() {
        this("unnamed zoo", new Location());
    }

    public Zoo(String name) {
        this(name, new Location());
    }

    public Zoo(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Zoo " + name + " in " + location;
    }
}
