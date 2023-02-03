package scanner;

import java.util.Scanner;



public class scannerstudy {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter a name :");
        
        String firstname = sc.next();
        String lastname = sc.next();

        System.out.print("please enter a profession :");
        sc.nextLine();
        String profession = sc.nextLine();


        System.out.print("enter your address :");
        sc.nextLine();
        String address = sc.nextLine();

        System.out.print("please enter a number :");
        int number = sc.nextInt();


        System.out.println(firstname +" "+ lastname);
        System.out.println(profession);
        System.out.println(address);
        System.out.println(number);
    }
    
}
