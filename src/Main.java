import java.util.Arrays;
public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }



    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total +=arr[i];


        }
        System.out.println("Сумма трат за месяц составила " + total +  " рублей");
        System.out.println();
        // Задача 2
        int max = 99999;
        int min = 200001;
        for (int i = 0; i < arr.length; i++) {
            max = arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }






        }
        System.out.println("Минимальная сумма трат за день составила " + min +   "рублей. Максимальная сумма трат за день составила "+ max + " рублей");
        System.out.println();
        // Задача 3

        int pay = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            pay++;


        }
        double average =(double) total/arr.length;
        System.out.println(average);
        // Задача 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }






    }



}













