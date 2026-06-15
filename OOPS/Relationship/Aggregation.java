class MusicPlayer{
    void song(){
        System.out.println("dheema song playing");
    }
}

class Car{
    Car(){
        System.out.println("car manufactured");
    }

    Car(MusicPlayer mp){
        mp.song();
        System.out.println("car manufactured");
    }
}

class Aggregation 
{
    public static void main (String[] args){
        Car bmw = new Car();
        System.out.println("-----------");
        MusicPlayer mp = new MusicPlayer();
        Car RR = new Car(mp);
    }
}