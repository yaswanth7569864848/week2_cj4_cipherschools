package arrays;

public class jaggedarray {
    public static void main(String[] args){
        int arr[][] = new int [3][];
        arr[0] =new int[3];
        arr[1] = new int[2];
        arr[2] = new int [4];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("********************");

        int arr2[][] ={{1,2,3},{4,5},{7,8,9}};
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }



    

        
    }
    
}
