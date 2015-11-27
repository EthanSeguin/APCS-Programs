public class DragonDriver {
    public void main(String args[]) {

        Dragon dragon = new Dragon();

        dragon.setColor("Red");
        dragon.setHealth(80);
        dragon.setAge(150);
        dragon.increaseAge();
        dragon.decreaseHealth();
        dragon.increaseHealth();

        System.out.println("Color: " + dragon.getColor());
        System.out.println("Health: " + dragon.getHealth());
        System.out.println("Age: " + dragon.getAge());
    }
}