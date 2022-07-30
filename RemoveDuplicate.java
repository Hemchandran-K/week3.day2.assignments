package week3.day2.assignmnets;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";

		int count = 0;

		String[] split = text.split(" ");

		Set<String> duplicate = new LinkedHashSet<String>(Arrays.asList(split));

		for (String output : split) {

			duplicate.add(output);
		}

		System.out.println(duplicate);

		for (int i = 0; i < split.length; i++) {
			count = 1;

			for (int j = i + 1; j < split.length; j++) {
				if (split[i].equals(split[j])) {
					count++;

				}

			}

		}
	}

}
