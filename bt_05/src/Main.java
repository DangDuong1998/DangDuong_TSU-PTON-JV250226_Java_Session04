import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập liệu mảng 2 chiều:");
        System.out.print("Nhập số hàng: ");
        String xWithEnter = scanner.nextLine();
        int x = Integer.parseInt(xWithEnter);
        System.out.print("Nhập số cột: ");
        String yWithEnter = scanner.nextLine();
        int y = Integer.parseInt(yWithEnter);
        int[][] arr = new int[x][y];
        int sumOdd = 0;
        int sumEven = 0;
        System.out.println("Nhập các phần tử cho mảng (theo từng mảng): ");

        for(int i = 0; i < x;i++){
            System.out.printf("Hàng %d: ",i+1);
            String numbers = scanner.nextLine();
            String[] numbersToArray = numbers.split(" ");
            for(int j = 0; j < y; j++){
                arr[i][j]=Integer.parseInt(numbersToArray[j]);
            }

        }
        scanner.close();

        for(int i = 0; i < x; i++){
            for(int j = 0; j < y;j++){
                if(arr[i][j] % 2 == 0 && arr[i][j]!= 0){
                    sumEven += arr[i][j];
                }
                else if(arr[i][j] % 2 != 0&& arr[i][j]!= 0){
                    sumOdd += arr[i][j];
                }
            }
        }
        System.out.printf("Tổng các số chẵn là: %d\n",sumEven);
        System.out.printf("Tổng các số lẻ là: %d",sumOdd);

    }
}
