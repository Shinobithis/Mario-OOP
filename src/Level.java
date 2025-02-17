import java.util.ArrayList;
import java.util.List;

public class Level {
    private String name;
    private List<Monster> monsters;
    private List<Item> items;
    private List<Obstacle> obstacles;
    private int score;
    private int timeLimit;

    public Level(String name, List<Monster> monsters, List<Item> items, List<Obstacle> obstacles) {
        this.name = name;
        this.monsters = new ArrayList<>();
        this.items = new ArrayList<>();
        this.obstacles = new ArrayList<>();
    }

    public void addMonster(Monster monster) {
        monsters.add(monster);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void addObstacle(Obstacle obstacle) {
        obstacles.add(obstacle);
    }

    @Override
    public String toString() {
        return "Level{" +
                "name='" + name + '\'' +
                ", monsters=" + monsters +
                ", items=" + items +
                ", obstacles=" + obstacles +
                '}';
    }
}
