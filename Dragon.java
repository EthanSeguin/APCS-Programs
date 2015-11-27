public class Dragon {
    private String color;
    private int health;
    private int age;

    public Dragon() {
        color = "green";
        health = 100;
        age = 100;
    }

    public Dragon(String c, int h) {
        color = c;
        health = h;
        age = 100;
    }

    public Dragon(String c, int h, int a) {
        color = c;
        health = h;
        age = 100;
    }

    public String getColor() {
        return color;
    }

    public int getHealth() {
        return health;
    }

    public int getAge() {
        return age;
    }

    public void setColor(String c) {
        color = c;
    }

    public void setHealth(int h) {
        health = h;
    }

    public void setAge(int a) {
        age = a;
    }

    public void increaseAge() {
        age += 10;
    }

    public void increaseHealth() {
        health += 10;
    }

    public void decreaseHealth() {
        health -= 10;
    }

}