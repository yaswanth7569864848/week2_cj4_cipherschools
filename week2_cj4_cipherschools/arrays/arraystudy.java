package arrays;

public class arraystudy {
    static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println(" ");

    }
    public static void main(String [] args){
        int size =5;
        int arr[] = new int[size];

        print(arr);

        for(int i=0;i<size;i++){
            arr[i] = i+1;   
        }
        print(arr);

        int arr2[] = {1,2,3};
        print(arr2);

        int copyarray[] = new int[2*size];
        for(int i=0;i<size;i++){
            copyarray[i] = arr[i];
        }
        copyarray[5] =6;
        copyarray[6] = 7;
        print(copyarray);






     


        


        
     

        

    }
    
}
