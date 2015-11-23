import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {
	public static void main(String[] args) {
		int arr[] = { 1, 4, 2, 6, 3, 8, 1,4, 9 };
		Map<Integer, Integer> hash = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (hash.containsKey(arr[i]))
				hash.replace(arr[i], hash.get(arr[i])+1 );
			else
				hash.put(arr[i],1);
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(hash.get(arr[i]) == 1)
			{
				System.out.println(arr[i]);
				break;
			}
		}
	}
}
