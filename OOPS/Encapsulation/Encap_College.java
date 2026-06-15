class Student
{
    private String sname;
    private int sid;
    private char gender;

    Student(String sname, int sid, char gender)
    {
        this.sname = sname;
        this.sid = sid;
        this.gender = gender;
    }

    // getter method for sname
    public String getSname()
    {
        return sname;
    }

    // setter method for sname
    public void setSname(String sname)
    {
        this.sname = sname;
    }

    // getter method for sid
    public int getSid()
    {
        return sid;
    }

    // setter method for sid
    public void setSid(int sid)
    {
        this.sid = sid;
    }

    // getter method for gender
    public char getGender()
    {
        return gender;
    }

    // setter method for gender
    public void setGender(char gender)
    {
        this.gender = gender;
    }
}

class Encap_College
{
    public static void main(String[] args)
    {
        Student s1 = new Student("raju", 21, 'm');

        System.out.println(s1.getSname());

        s1.setSname("chutki");
        System.out.println(s1.getSname());

        System.out.println(s1.getSid());

        s1.setSid(100);
        System.out.println(s1.getSid());

        System.out.println(s1.getGender());

        s1.setGender('F');
        System.out.println(s1.getGender());
    }
}