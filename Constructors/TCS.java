class Emp
{
    String ename;
    int eid;
    double sal;

    Emp()
    {
        // load the instruction
        System.out.println("employee added");
    }

    void work()
    {
        System.out.println("Developing software");
    }

    void empDetails()
    {
        System.out.println("employee name is : " + ename);
        System.out.println("employee id is : " + eid);
        System.out.println("employee salary is : " + sal);
    }
}

class TCS
{
    public static void main(String[] args)
    {
        Emp e1 = new Emp();
        e1.ename = "miller";
        e1.eid = 101;
        e1.sal = 10000;
        e1.empDetails();

        System.out.println("-----------------------------");

        Emp e2 = new Emp();
        e2.ename = "scott";
        e2.eid = 102;
        e2.sal = 8000;
        e2.empDetails();

        System.out.println("-----------------------------");

        Emp e3 = new Emp();
        e3.ename = "blake";
        e3.eid = 103;
        e3.sal = 9000;
        e3.empDetails();
    }
}