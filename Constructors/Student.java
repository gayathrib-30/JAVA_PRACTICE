class Student
{
    String sname;
    int age;
    int sid;

    Student(String sname, int age, int sid)
    {
        this.sname = sname;
        this.age = age;
        this.sid = sid;
    }

    static
    {
        System.out.println("welcome to student app");
    }

    void studentDetails()
    {
        System.out.println("student name is : " + this.sname);
        System.out.println("student id is : " + sid);
        System.out.println("student age is : " + age);
    }

    public static void main(String[] args)
    {
        Student s1 = new Student("virat", 18, 17);
        s1.studentDetails();

        Student s2 = new Student("dhoni", 7, 19);
        s2.studentDetails();
    }
}