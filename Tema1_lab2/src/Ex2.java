import java.util.Scanner;

public class Ex2{
    public static void sortArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    // Schimbam elementele
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] mergedArray = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        while (i < n1) {
            mergedArray[k++] = arr1[i++];
        }

        while (j < n2) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Citim lungimea si elementele primului tablou
        System.out.print("Introduceti numarul de elemente pentru primul tablou: ");
        int n = sc.nextInt();
        int[] array1 = new int[n];
        System.out.println("Introduceti elementele primului tablou:");
        for (int i = 0; i < n; i++) {
            array1[i] = sc.nextInt();
        }

        // Citim lungimea si elementele celui de-al doilea tablou
        System.out.print("Introduceti numarul de elemente pentru al doilea tablou: ");
        int m = sc.nextInt();
        int[] array2 = new int[m];
        System.out.println("Introduceti elementele celui de-al doilea tablou:");
        for (int i = 0; i < m; i++) {
            array2[i] = sc.nextInt();
        }

        // Sortam ambele tablouri
        sortArray(array1);
        sortArray(array2);

        // Afisam tablourile sortate
        System.out.println("Primul tablou sortat: ");
        for (int num : array1) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Al doilea tablou sortat: ");
        for (int num : array2) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Fuzionam cele doua tablouri
        int[] mergedArray = mergeSortedArrays(array1, array2);

        // Afisam rezultatul
        System.out.println("Tabloul fuzionat (sortat crescator): ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
}