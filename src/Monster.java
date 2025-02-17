public class Monster {
    private String name;
    private int health;
    private String movementType;
    private int xPosition;
    private int yPosition;

    public Monster(String name, int health, String movementType, int xPosition, int yPosition) {
        this.name = name;
        this.health = health;
        this.movementType = movementType;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + "took" + damage + ", health: " + health);
    }

    public void follow(Character character) {
        int distanceX = Math.abs(character.getxPosition() - xPosition);
        int distanceY = Math.abs(character.getyPosition() - yPosition);

        if (distanceX <= 5 && distanceY <= 5) {
            System.out.println(name + "is following" + character.getName());
            if (character.getxPosition() > xPosition) {
                xPosition ++;
            } else {
                xPosition --;
            }
            if (character.getyPosition() > yPosition) {
                yPosition ++;
            } else {
                yPosition --;
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", movementType='" + movementType + '\'' +
                ", xPosition=" + xPosition +
                ", yPosition=" + yPosition +
                '}';
    }
}
