class Solution {
	static ArrayList<Integer> leaders(int arr[]) {
		ArrayList<Integer> a = new ArrayList<>();
		int n = Integer.MIN_VALUE;
		for (int i = arr.length - 1; i>=0; i--) {
			if (n<=arr[i]) {
				n = arr[i];
				a.add(arr[i]);
			}
		}
		Collections.reverse(a);
		return a;
		
	}
}	