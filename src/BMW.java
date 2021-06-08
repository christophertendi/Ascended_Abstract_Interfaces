public class BMW extends Car implements Type{
    public String color;

    BMW(String model, String color)
    {
        this.model = model;
        this.color = color;

    }

    @Override
    public void rev()
    {
        System.out.println("ngenggg...");

    }

    @Override
    public void engine()
    {
        System.out.println("Vrooom...");

    }
}