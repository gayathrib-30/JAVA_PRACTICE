class Car
{
    Engine e1 = new Engine();

    Car()
    {
        e1.start();
        System.out.println("car has manufactured");
    }
}

class Engine
{

    void start()
    {
        System.out.println("engine has started");
    }
}

class Composition
{
    public static void main(String[] args)
    {
        Car c1 = new Car();

        System.out.println("-------------------");

        Car c2 = new Car();

    }
}