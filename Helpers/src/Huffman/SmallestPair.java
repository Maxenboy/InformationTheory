package Huffman;

import java.util.ArrayList;

public class SmallestPair {
	public static void main(String[] args) {
		int min = Integer.MAX_VALUE;
		int int1 = 0;
		int int2 = 0;
		int index =0;
		ArrayList<Integer> values = new ArrayList<Integer>();
		int[] integers = {424,576};   //FYLL I VÄRDENA FÖR LÖVEN!! 
		for (int i : integers) {
			values.add(i);
		}
		for (int i = 0; i < values.size(); i++) {
			if (values.get(i) < min) {
				min = values.get(i);
				int1 = values.get(i);
				index=i;
			}
		}
		values.remove(index);
		min = Integer.MAX_VALUE;
		for (int i = 0; i < values.size(); i++) {
			if (values.get(i) < min) {
				min = values.get(i);
				int2 = values.get(i);
			}
		}
		System.out.println(int1+int2+"\n"+int1+"\n"+int2);
	}
}
