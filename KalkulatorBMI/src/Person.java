// Person.java
public abstract class Person {
    protected double weight;
    protected double height;

    public Person(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public abstract void displayInfo();
}
