package arrays;

public class multidimarray {
    public static void main(String [] args){
        int rows=5;
        int col=3;
        int arr[][] = new int [rows][col];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


        int arr2[][] ={{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
