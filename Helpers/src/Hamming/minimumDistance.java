package Hamming;

import java.util.ArrayList;
import java.util.Arrays;

public class minimumDistance {
	public static void main(String[] args) {
		String[] otherList = new String[] { "00000000", "00001111", "00110011",
				"00111100", "01010101", "01011010", "01100110", "01101001",
				"10101010", "10100101", "10011001", "10010110", "11111111",
				"11110000", "11001100", "11000011" };
		ArrayList<String> first = new ArrayList<String>();
		first.addAll(Arrays.asList(otherList));
		ArrayList<String> second = first;
		ArrayList<Integer> temp1 = new ArrayList<Integer>();
		ArrayList<Integer> temp2 = new ArrayList<Integer>();
		for (String s : first) {
			for (String st : second) {
				if (!s.equals(st)) {
					char[] code1 = s.toCharArray();
					char[] code2 = st.toCharArray();
					int count = 0;
					for (int i = 0; i < code1.length; i++) {
						if (code1[i] != code2[i]) {
							count++;
						}
					}
					temp1.add(count);
				}
			}
			int min = Integer.MAX_VALUE;
			for (int i : temp1) {
				min = Math.min(i, min);
			}
			temp2.add(min);
		}
		int min = Integer.MAX_VALUE;
		for (int i : temp2) {
			min = Math.min(i, min);
		}
		System.out
				.println("The minimum Hamming distance between the codewords is: "
						+ min);
	}
}
