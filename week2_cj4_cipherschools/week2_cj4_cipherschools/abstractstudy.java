package week2_cj4_cipherschools;


abstract class car{
    int maxSpeed;
    abstract void accelerate();
    abstract void brake();
}
abstract class bmw extends car{
    void accelerate() {
        System.out.println("bmw is accelerating");
    }
}
class bmw2 extends bmw{
    void brake(){
        System.out.println("bmw is applying brakes");
    }
}

public class abstractstudy {
    public static void main(String[] args){
       //cbmw beemer = new bmw();
       //beemer.accelerate();
       bmw2  b = new bmw2();
       b.accelerate();
       b.brake();
    }
}
