public class Player {
    private int id;
    private String name;
    private int strength;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public Player(int id, String name, int strength) {
        this.id = id;
        this.name = name;
        this.strength = strength;
    }
}
