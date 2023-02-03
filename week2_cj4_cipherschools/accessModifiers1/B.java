package accessModifiers1;

public class B {
    
    public static void main(String [] args ){
       A obj = new A(); 
       System.out.println(obj.x);// deafult is accessible in same package
       //System.out.println(obj.y);// private is not accessible outside the classs
       System.out.println(obj.z);// public is acciessible everywhere the object is avaible
       System.out.println(obj.w);//
    
    }
}
