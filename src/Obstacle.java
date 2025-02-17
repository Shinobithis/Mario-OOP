public class Obstacle {
    private String type;
    private boolean isBreakble;

    public Obstacle(String type, boolean isBreakble) {
        this.type = type;
        this.isBreakble = isBreakble;
    }

    public void destroy() {
        if (isBreakble) {
            System.out.println(type + "destroyed...");
        } else {
            System.out.println(type + "undestroyable...");
        }
    }

    @Override
    public String toString() {
        return "Obstacle{" +
                "type='" + type + '\'' +
                ", isBreakble=" + isBreakble +
                '}';
    }
}
