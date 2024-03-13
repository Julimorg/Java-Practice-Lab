package Buoi_1;

import java.util.Scanner;
import java.util.Random;

public class Practice22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] array = new int[500];
        int n = 0;

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1.Input num (n <=500): ");
            System.out.println("2.Randomly number from array [-199,199]: ");
            System.out.println("3. Xuất mảng ra màn hình");
            System.out.println("4. Liệt kê các giá trị âm có trong mảng");
            System.out.println("5. Liệt kê các số nguyên tố có trong mảng");
            System.out.println("6. Liệt kê các phần tử có giá trị nằm trong đoạn [a, b] cho trước");
            System.out.println("7. Tính tổng giá trị các phần tử là số nguyên tố");
            System.out.println("8. Tính trung bình cộng của các phần tử dương có trong mảng");
            System.out.println("9. Đếm số phần tử có giá trị lớn hơn x cho trước");
            System.out.println("10. Đếm số phần tử có giá trị là số nguyên tố trong mảng");
            System.out.println("11. Kiểm tra mảng có phải là mảng chứa toàn số nguyên tố");
            System.out.println("12. Kiểm tra mảng có phải là mảng tăng dần");
            System.out.println("13. Tìm giá trị lớn nhất trong mảng");
            System.out.println("14. Tìm giá trị nhỏ nhất trong mảng");
            System.out.println("15. Tìm số âm lớn nhất trong mảng");
            System.out.println("16. Đảo ngược mảng");
            System.out.println("0. Thoát chương trình");

            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    n = inputArray(array, scanner);
                    break;
                case 2:
                    n = generateRandomArray(array, random);
                    break;
                case 3:
                    printArray(array, n);
                    break;
                case 4:
                    listNegativeNumbers(array, n);
                    break;
                case 5:
                    listPrimeNumbers(array, n);
                    break;
                case 6:
                    listElementsInRange(array, n, scanner);
                    break;
                case 7:
                    sumOfPrimes(array, n);
                    break;
                case 8:
                    averageOfPositives(array, n);
                    break;
                case 9:
                    countGreaterThanX(array, n, scanner);
                    break;
                case 10:
                    countPrimeNumbers(array, n);
                    break;
                case 11:
                    isArrayOfPrimes(array, n);
                    break;
                case 12:
                    isArraySorted(array, n);
                    break;
                case 13:
                    findMaxValue(array, n);
                    break;
                case 14:
                    findMinValue(array, n);
                    break;
                case 15:
                    findMaxNegativeValue(array, n);
                    break;
                case 16:
                    reverseArray(array, n);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ.");
            }
        } while (choice != 0);

        scanner.close();
    }
    public static int inputArray(int[] array, Scanner scanner) {
        System.out.print("input Num (n <= 500): ");
        int n = scanner.nextInt();
        if (n > 500) {
            System.out.println("Error!.");
            return 0;
        }
        System.out.println("input " + n + " array:");
        for (int i = 0; i < n; i++) {
            System.out.print("array " + (i + 1) + ": ");
            int value = scanner.nextInt();
            if (value < -1000000 || value > 1000000) {
                return 0;
            }
            array[i] = value;
        }
        return n;
    }

    public static int generateRandomArray(int[] array, Random random) {
        System.out.print("Nhập số lượng phần tử (n <= 500): ");
        int n = random.nextInt();
        if (n > 500) {
            System.out.println("Số lượng phần tử không hợp lệ.");
            return 0;
        }
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(399) - 199; // Phát sinh giá trị từ -199 đến 199
        }
        return n;
    }

    public static void printArray(int[] array, int n) {
//        System.out.println("Mảng:");
//        for (int i = 0; i < n; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
    }

    public static void listNegativeNumbers(int[] array, int n) {
//        System.out.println("Các giá trị âm trong mảng:");
//        for (int i = 0; i < n; i++) {
//            if (array[i] < 0) {
//                System.out.print(array[i] + " ");
//            }
//        }
//        System.out.println();
    }

    public static void listPrimeNumbers(int[] array, int n) {
//        System.out.println("Các số nguyên tố trong mảng:");
//        for (int i = 0; i < n; i++) {
//            if (isPrime(array[i])) {
//                System.out.print(array[i] + " ");
//            }
//        }
//        System.out.println();
    }

    public static boolean isPrime(int num) {
//        if (num <= 1) {
//            return false;
//        }
//        for (int i = 2; i * i <= num; i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
    }

    public static void listElementsInRange(int[] array, int n, Scanner scanner) {
//        System.out.print("Nhập giá trị a: ");
//        int a = scanner.nextInt();
//        System.out.print("Nhập giá trị b: ");
//        int b = scanner.nextInt();
//        System.out.println("Các phần tử có giá trị nằm trong đoạn [" + a + ", " + b + "] là:");
//        for (int i = 0; i < n; i++) {
//            if (array[i] >= a && array[i] <= b) {
//                System.out.print(array[i] + " ");
//            }
//        }
//        System.out.println();
    }

    public static void sumOfPrimes(int[] array, int n) {
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            if (isPrime(array[i])) {
//                sum += array[i];
//            }
//        }
//        System.out.println("Tổng giá trị các phần tử là số nguyên tố: " + sum);
    }

    public static void averageOfPositives(int[] array, int n) {
//        int sum = 0;
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            if (array[i] > 0) {
//                sum += array[i];
//                count++;
//            }
//        }
//        if (count > 0) {
//            double average = (double) sum / count;
//            System.out.println("Trung bình cộng của các phần tử dương là: " + average);
//        } else {
//            System.out.println("Không có phần tử dương trong mảng.");
//        }
    }

    public static void countGreaterThanX(int[] array, int n, Scanner scanner) {
//        System.out.print("Nhập giá trị x: ");
//        int x = scanner.nextInt();
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            if (array[i] > x) {
//                count++;
//            }
//        }
//        System.out.println("Số phần tử có giá trị lớn hơn " + x + " là: " + count);
    }

    public static void countPrimeNumbers(int[] array, int n) {
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            if (isPrime(array[i])) {
//                count++;
//            }
//        }
//        System.out.println("Số phần tử là số nguyên tố trong mảng là: " + count);
    }

    public static void isArrayOfPrimes(int[] array, int n) {
//        boolean allPrimes = true;
//        for (int i = 0; i < n; i++) {
//            if (!isPrime(array[i])) {
//                allPrimes = false;
//                break;
//            }
//        }
//        if (allPrimes) {
//            System.out.println("Mảng chứa toàn số nguyên tố.");
//        } else {
//            System.out.println("Mảng không chứa toàn số nguyên tố.");
//        }
    }

    public static void isArraySorted(int[] array, int n) {
//        boolean sorted = true;
//        for (int i = 1; i < n; i++) {
//            if (array[i] < array[i - 1]) {
//                sorted = false;
//                break;
//            }
//        }
//        if (sorted) {
//            System.out.println("Mảng là mảng tăng dần.");
//        } else {
//            System.out.println("Mảng không là mảng tăng dần.");
//        }
    }

    public static void findMaxValue(int[] array, int n) {
//        int max = array[0];
//        for (int i = 1; i < n; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
//        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
    }

    public static void findMinValue(int[] array, int n) {
//        int min = array[0];
//        for (int i = 1; i < n; i++) {
//            if (array[i] < min) {
//                min = array[i];
//            }
//        }
//        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }

    public static void findMaxNegativeValue(int[] array, int n) {
//        int maxNegative = Integer.MIN_VALUE;
//        for (int i = 0; i < n; i++) {
//            if (array[i] < 0 && array[i] > maxNegative) {
//                maxNegative = array[i];
//            }
//        }
//        if (maxNegative == Integer.MIN_VALUE) {
//            System.out.println("Không có số âm trong mảng.");
//        } else {
//            System.out.println("Số âm lớn nhất trong mảng là: " + maxNegative);
//        }
    }

    public static void reverseArray(int[] array, int n) {
//        int[] reversedArray = new int[n];
//        for (int i = 0; i < n; i++) {
//            reversedArray[i] = array[n - i - 1];
//        }
//        System.arraycopy(reversedArray, 0, array, 0, n);
//        System.out.println("Mảng sau khi đảo ngược:");
//        printArray(array, n);
    }

}