class Camera
{
    void takePhoto()
    {
        System.out.println("photo taken");
    }
}

class Battery
{
    void work()
    {
        System.out.println("Battery starts working");
    }
}

class Phone
{
    Battery b = new Battery();
    Phone()
    {
        b.work();
        System.out.println("phone has manufactured");
    }

    Phone(Camera c)
    {
        b.work();
        c.takePhoto();
        System.out.println("phone has manufactured");
    }
}

class CompAggre
{
    public static void main(String[] args)
    {
        Phone samsung = new Phone();

        System.out.println("==============================");

        Camera c = new Camera();

        Phone nokia = new Phone(c);

        System.out.println("==============================");

        Phone iphone = new Phone(c);
    }
}