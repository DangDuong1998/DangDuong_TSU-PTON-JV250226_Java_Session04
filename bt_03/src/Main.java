import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Nhập kích thước mảng: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng: ");
        for(int i = 0; i<n;i++){
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n-1; i++){
               for(int j = 0; j < n-1; j++){
                   if (arr[j] < arr[j+1]){
                       int temp = arr[j];
                       arr[j] = arr[j+1];
                       arr[j+1]=temp;
                   }
               }
        }

        System.out.print("Mảng sau khi sắp xếp theo thứ tự giảm dần: [");
        for(int i =0; i < n; i++){
            if(i == n-1){
                System.out.printf("%d ",arr[i]);
            }
            else{
                System.out.printf("%d, ",arr[i]);
            }
        }
        System.out.print("]");
    }
}
