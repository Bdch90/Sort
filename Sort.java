import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào từng phần tử trong mảng :");
        int x = 0;
        int[] array;
        array = new int[10];
        do {
            System.out.println((x+1) + ":");
            array[x] = scanner.nextInt();
            x++;
            if (x==10)
            {
                int k;
                for (int i = 0; i < array.length / 2; i++)
                {
                    k = array[i];
                    array[i] = array[x - 1 - i];
                    array[x - 1 - i] = k;
                }


                for (int j = 0; j <array.length; j++)
                {
                    System.out.print(array[j]);
                }
            }
        }while (x<10);
    }
}
