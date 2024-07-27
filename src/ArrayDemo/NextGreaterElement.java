package ArrayDemo;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 3, 2 };
		int[] arr1 = new int[3];
        
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] < arr[j]) {
					arr1[i++] = arr[j];
				} else {
					arr1[i++] = -1;
				}
			}

		}

		arr1[arr.length - 1] = -1;
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr1[i]);
		}
		System.out.print("]");

	}
}