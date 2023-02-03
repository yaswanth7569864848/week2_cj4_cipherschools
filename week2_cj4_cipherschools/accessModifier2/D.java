package accessModifier2;
import accessModifiers1.A;

public class D {
    public static void main(String [] args ){
        A obj = new A(); 
     
         // System.out.println(obj.x); defalut in not accessible outsider the package
         //System.out.println(obj.y); private is not accessible outside the classs
         System.out.println(obj.z);//public is acciessible everywhere the object is avaible
        
    }
    
}
