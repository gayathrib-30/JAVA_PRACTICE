//Upcasting 
class Upcast_Dholakpur
{
  public static void main (String args[])
  {
    IV i1= new Raju();
    i1.aboutIV();
    Raju r= new Raju();
    r.aboutRaju();
    System.out.println(" ");
    
    IV i2= new Chutki();
    i2.aboutIV();
    Chutki c= new Chutki();
    c.aboutChutki();
    System.out.println(" ");
    
    IV i3= new Dholu();
    i3.aboutIV();
    Dholu d= new Dholu();
    d.aboutDholu();
    System.out.println(" ");
    
    IV i4= new Bholu();
    i4.aboutIV();
    Bholu b= new Bholu();
    b.aboutBholu();
    System.out.println(" ");
  }
  
}

class IV 
{
  void aboutIV()
  {
  System.out.println("I am useless and fully dependent on Bheem");
  }
}

class Raju extends IV
{
  void aboutRaju()
  {
    System.out.println("I have 2 hairs");
  }
}

class Chutki extends IV
{
  void aboutChutki()
  {
    System.out.println("I give laddus to Bheem");
    
  }
}
class Dholu extends IV
{
  void aboutDholu()
  {
    System.out.println("Blah blah blah");
  }
}

class Bholu extends IV
{
  void aboutBholu()
  {
    System.out.println("Gulu gulu gulu");
  }
}