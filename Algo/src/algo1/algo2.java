package algo1;

public class algo2 {
	public static void main(String[] args) {
		int[] index = { 0, 5, 2, 3, 1 };
		// 인 배열과 길이가 10이며 각 원소가 1부터 10까지의 배열 arr을 만들고
		// index 배열을 순회하면서 index 배열의 원소에 해당하는 arr배열의 원소의 합을 구해보세요
		// (arr[index[i]])
		int[] arr = new int[10];
		int sum = 0;

		for (int i = 0; i < 10; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < index.length; i++) {
			sum += arr[index[i]];
		}
		System.out.println(sum);
	}
}
