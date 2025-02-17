public class Item {
    private String name;
    private String effect;
    private boolean isConsumable;

    public Item(String name, String effect, boolean isConsumable) {
        this.name = name;
        this.effect = effect;
        this.isConsumable = isConsumable;
    }

    public String getName() {
        return name;
    }

    public String getEffect() {
        return effect;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", effect='" + effect + '\'' +
                ", isConsumable=" + isConsumable +
                '}';
    }
}
