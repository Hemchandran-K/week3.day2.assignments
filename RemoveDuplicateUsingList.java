package week3.day2.assignmnets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateUsingList {
	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";

		String[] split = text.split(" ");

		Set<String> duplicate = new LinkedHashSet<String>(Arrays.asList(split));

		for (String output : split) {

			duplicate.add(output);
		}
		List<String> list = new ArrayList<String>(duplicate);
		System.out.println(list);
		for (int i = 0; i < list.size() - 1; i++) {
			System.out.println(list.get(i));
		}

	}

}
