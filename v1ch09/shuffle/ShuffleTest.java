package shuffle;

import java.util.*;

public class ShuffleTest
{
	public static void main(String[] args)
	{
		List<Integer> nums = new ArrayList<Integer>();
		for (int i = 0; i < 50; i++)
		{
			nums.add(i);
		}
		Collections.shuffle(nums);
		List<Integer> nums2 = nums.subList(0, 6);
		Collections.sort(nums2);
		System.out.println(nums2);
		
	}
}