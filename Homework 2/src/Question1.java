import java.util.*;
public class Question1 {
	public Question1() {}
	
	public int getSumWithoutDuplicates(int nums[]) {
		HashSet<Integer> dups = new HashSet<Integer>();
		int sum = 0;
		for(int n:nums) {
			if(!dups.contains(n)){
				sum = sum + n;
				dups.add(n);
			}
		}
		return sum;
	}
}
