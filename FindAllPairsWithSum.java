import java.util.HashMap;
import java.util.Map;

public class FindAllPairsWithSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> hash = new HashMap<>();
		int arr[] = {1,4,2,6,3,8,2,9};
		int sum = 5;
		for (int i = 0; i < arr.length; i++) {
			hash.put(arr[i],i);
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(hash.containsKey(sum-arr[i])){
				System.out.println(i+ " " +  hash.get(sum-arr[i]));
			}
				
		}
	}

}
