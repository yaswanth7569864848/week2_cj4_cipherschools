package encapsulation;


class demo{
    private int a=5;
    private int b=10;
    private int c=15;
    private int d=20;
    
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public void setA(int a) {
        if(a>100){
            this.a=a;
        
            System.out.println("value of a chenged" );
        }
        else {
            System.out.println("cannot set value");
           }
        }
       
        
    
    public void setB(int b) {
        this.b = b;
    }
    public void setC(int c) {
        this.c = c;
    }
    public void setD(int d) {
        this.d = d;
    }
    public int getC() {
        return c;
    }
    public int getD() {
        return d;
    }

  

}
public class encapstudy {
    public static void main(String[] args){

        demo d = new demo();
        d.setA(50);
        System.out.println(d.getA());

    }
    
}

