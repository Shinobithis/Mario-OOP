import java.util.Iterator;

public class Character {
    private String name;
    private int health;
    private boolean isPlayer;
    private boolean isCrouching;
    private int xPosition;
    private int yPosition;
    private int speed;

    public Character(String name, int health, boolean isPlayer, boolean isCrouching, int xPosition, int yPosition, int speed) {
        this.name = name;
        this.health = health;
        this.isPlayer = isPlayer;
        this.isCrouching = isCrouching;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.speed = speed;
    }

    public void jump() {
        if (isCrouching) {
            System.out.println(name + " can't jump while crouching...");
            return;
        }
        System.out.println(name + "is jumping...");
        yPosition += 5;
        System.out.println(name + "is " + yPosition + "height");

        while (yPosition > 0) {
            yPosition --;
        }
        System.out.println(name + "on the ground");
    }

    public void moveLeft() {
        System.out.println(name + "is moving left...");
        xPosition -= speed;
    }

    public void moveRight() {
        System.out.println(name + "is moving right...");
        xPosition += speed;
    }

    public void crouch() {
        System.out.println(name + "is crouching.");
        isCrouching = true;
    }

    public void standUp() {
        System.out.println(name + "no crouch...");
        isCrouching = false;
    }

    public void attack(Monster monster, int damage) {
        System.out.println(name + "attacked " + monster.getName() + "with " + damage + "of damage.");
        monster.takeDamage(damage);
        if (monster.getHealth() <= 0) {
            System.out.println(monster.getName() + "is dead...");
        }
    }

    public void pickUpItem(Item item) {
        System.out.println(name + "picked up " + item.getName());
        if (item.getEffect().equals("Health Boost")) {
            health += 3;
            System.out.println(name + "health: " + health);
        } else if (item.getEffect().equals("Speed Boost")) {
            speed += 5;
            System.out.println(name + "speed: " + speed);
        }
    }

    public void takeDamage(int damage) {
        health -= damage;

        if (health <= 0) {
            System.out.println(name + "is dead");
            health = 0;
        } else {
            System.out.println(name + "took damage of : " + damage + "health = " + health);
        }
    }

    public int getxPosition() {
        return xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public boolean isCrouching() {
        return isCrouching;
    }

    @Override
    public String toString() {
        return "Characters{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", isPlayer=" + isPlayer +
                ", isCrouching=" + isCrouching +
                ", xPosition=" + xPosition +
                ", yPosition=" + yPosition +
                ", speed=" + speed +
                '}';
    }
}