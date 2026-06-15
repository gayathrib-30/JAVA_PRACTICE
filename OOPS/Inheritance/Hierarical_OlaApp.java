//Hierarchical Inheritance with super statment 
class Hierarical_OlaApp
{
  public static void main (String args[])
  {
   System.out.println(" ");
   Auto ob1= new Auto("omr","mmda",5);
   ob1.display();
   ob1.autoprice();
   
   System.out.println(" ");
   Bike ob2 = new Bike("anna nagar","kodambakkam",6);
   ob2.display();
   ob2.bikeprice();
   
   System.out.println(" ");
   Car ob3 = new Car("surapet","athipet",2);
   ob3.display();
   ob3.carprice();
  }
  
}

class OLA
{
  String pickup;
  String drop;
  int dist;
  
  
  OLA(String pickup, String drop, int dist)
  {
    this.pickup= pickup;
    this.drop=drop;
    this.dist=dist;
    
  
  }
  
  void display()
  {
    
    System.out.println("pickup location is: "+pickup);
    System.out.println("drop location is :"+drop);
    System.out.println("distance is :"+dist);
  
    
  }
}

class Auto extends OLA
{
  int price=30;
  Auto(String pickup, String drop,int dist)
  {
    super(pickup,drop,dist);
    
  }
  void autoprice()
  {
    System.out.println("total price is: "+price*dist);
  }
}

class Bike extends OLA
{
  int price=20;
  
  Bike(String pickup,String drop,int dist)
  {
    super(pickup, drop,dist);
  }
  
  void bikeprice()
  {
    System.out.println("total price is: "+price*dist);
  }
}

class Car extends OLA
{
  int price=50;
  Car(String pickup,String drop,int dist)
  {
    super(pickup, drop,dist);
  }
  
  void carprice()
  {
    System.out.println("total price is: "+price*dist);
  }
}