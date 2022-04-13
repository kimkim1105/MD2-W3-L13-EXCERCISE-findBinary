import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap do dai mang: ");
        int sizeArr = scanner.nextInt();
        int[] arr = new int[sizeArr];
        for (int i = 0; i < sizeArr; i++) {
            System.out.println("Nhao vao phan tu "+(i+1));
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i:
             arr) {
            System.out.print(i+" ");
        }
        System.out.println("\nNhap gia tri tim kiem");
        int value = scanner.nextInt();
        System.out.println(binarySearch(arr,0,sizeArr,value));
    }
    public static int binarySearch(int[] array,int left,int right,int value){

        while (!(left>right)){
            int middle = (left+right)/2;
            if (array[middle]==value){
                return middle;
            }else if (value>array[middle]){
                return binarySearch(array,left,middle-1,value);
            }else {
               return binarySearch(array,middle+1,right,value);
            }
        }
        return -1;
    }
}
