package week2_cj4_cipherschools;


interface shape{
    double pi =3.14;
    double getsquare(double r);
}
class circle implements shape{
    public double getsquare(double r){
        return r*r;
    }
    void fun(){
        System.out.println("hey, i implemented an interface named shape");

    }

    

}
public class interfacestudy {
    
    public static void main(String[] args ){
        circle c = new circle();
        System.out.println(c.getsquare(5));


    }
}
