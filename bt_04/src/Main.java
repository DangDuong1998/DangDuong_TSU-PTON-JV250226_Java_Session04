import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Nhập số phần tử của mảng: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            System.out.printf("Nhập phần tử thứ %d: ",i);
            arr[i] = scanner.nextInt();
        }
        System.out.print("Mảng ban đầu là: ");
        if(n == 0){
            System.out.println("Mảng ban đầu là rỗng ");
            System.out.print("Mảng sau khi đảo là rỗng ");
            return;
        }
        else{
            for (int i=0;i<n;i++){
                if(i < n-1){
                    System.out.printf("%d, ",arr[i]);
                }
                else{
                    System.out.printf("%d.\n",arr[i]);
                }

            }
            for(int i = 1; i <n;i++){
                int pickUp = arr[i];
                int j = i -1;
                while (j>= 0){
                    arr[j+1] = arr[j];
                    arr[j]= pickUp;
                    j--;
                }

            }

            System.out.print("Mảng đã đảo là: ");
            for (int i=0;i<n;i++){
                if(i < n-1){
                    System.out.printf("%d, ",arr[i]);
                }
                else{
                    System.out.printf("%d.",arr[i]);
                }

            }
            scanner.close();
        }

    }
}
