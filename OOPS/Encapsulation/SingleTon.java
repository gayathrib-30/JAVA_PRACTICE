class Principaal
{
    public static Principaal p ;
    private Principaal()
    {

    }

    public static Principaal getPrincipaal()
    {
        if(p == null)
            p = new Principaal();

        return p;

    }
}

class SingleTon
{
    public static void main(String[] args)
    {
        //Principaal p1 = new Principaal();
        //Principaal p2 = new Principaal();

        Principaal p1 = Principaal.getPrincipaal();
        Principaal p2 = Principaal.getPrincipaal();
        Principaal p3 = Principaal.getPrincipaal();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}