package QuickPackage;

	import java.util.Arrays;
	import java.util.Scanner;

public class QuickSort {
		private static Scanner sc;

		public static void main(String args[]) {
			sc = new Scanner(System.in);

			System.out.println("Digite a quantidade de n�meros");
			int n = sc.nextInt();

			System.out.println("Digite os N�meros");
			int arr[] = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();

			System.out.println("A matriz n�o ordenada �:");
			System.out.println(Arrays.toString(arr));

			sort(arr, 0, arr.length - 1);

			System.out.println("A matriz ordenada �:");
			System.out.println(Arrays.toString(arr));
		}

		static void sort(int arr[], int start, int end) {
			if (start < end) {
				int pIndex = partition(arr, start, end);
				sort(arr, start, pIndex - 1);
				sort(arr, pIndex + 1, end);
			}
		}
		
		static int partition(int arr[], int start, int end) {
			int pivot = arr[end];
			int pIndex = start;
			for (int i = start; i < end; i++) {
				if (arr[i] <= pivot) {
					swap(arr, i, pIndex);
					pIndex++;
				}
			}
			swap(arr, pIndex, end);
			return pIndex;
		}

		static void swap(int arr[], int x, int y) {
			int temp = arr[x];
			arr[x] = arr[y];
			arr[y] = temp;
		}
	}

