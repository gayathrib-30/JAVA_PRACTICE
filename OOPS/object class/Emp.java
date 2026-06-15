import java.util.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
      Emp e1 = new Emp("miller",101);
      Emp e2 = new Emp("Scott",102);
      Emp e3 = new Emp("miller",101);
      
      System.out.println(e1==e2);
      System.out.println(e1==e3);
      System.out.println(" ");
      System.out.println(e1.equals(e3));
      System.out.println(e1.equals(e2));
      System.out.println("-----HASCODE-----");
      System.out.println("e1 hascode:"+e1.hashCode());
      System.out.println("e2 hascode:"+e2.hashCode());
      System.out.println("e3 hascode:"+e3.hashCode());
      
    }
}
class Emp{
  String ename;
  int eid;
  Emp(String ename,int eid)
  {
    this.ename = ename;
    this.eid = eid;
  }
  @Override
  public boolean equals(Object obj)
  {
    Emp e = (Emp) obj;
    return this.ename==e.ename&&this.eid==e.eid;
  }
  @Override
  public int hashCode()
  {
    return Objects.hash(ename,eid);
  }
}