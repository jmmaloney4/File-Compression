package huffmantrees;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

public class HuffmanTree {

	int a = 0;

	/**
	 * takes the root node, a temporary string, and a table to put the codes and
	 * the character in
	 * 
	 * @param n
	 * @param code
	 * @param tbl
	 */
	public static void buildCodes(Node n, String code,
			Map<Character, String> tbl) {
		if (n.isLeaf()) {
			tbl.put(n.getCharacter(), code);
		} else {
			if (n.hasLeft()) {
				HuffmanTree.buildCodes(n.getLeftChild(), code + "0", tbl);
			}

			if (n.hasRight()) {
				HuffmanTree.buildCodes(n.getRightChild(), code + "1", tbl);
			}
		}
	}

	/**
	 * the main function of the program
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int r = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Num times to run: ");
		int a = s.nextInt();

		long[] times = new long[a];

		for (int s1 = 0; s1 < a; s1++) {
			// time #1 for timing the program
			long time1 = System.currentTimeMillis();

			Comparator NodeComparator = new NodeComparator();
			Comparator NodeComparator2 = new NodeComparator2();
			PriorityQueue<Node> priQue = new PriorityQueue(50, NodeComparator2);
			PriorityQueue<Node> NodeQue = new PriorityQueue(50, NodeComparator);
			// input file
			File file = new File(args[0]);
			Reader reader = new BufferedReader(new FileReader(file));
			Reader reader2 = new BufferedReader(new FileReader(file));
			Map<Character, Integer> table = new HashMap<Character, Integer>(40);
			Map<Character, String> StrTable = new HashMap<Character, String>(40);
			// output file, dosn't actually do anything right now, everything
			// gets put to stdout
			File writeFile = new File(args[1]);
			Writer writer = new BufferedWriter(new FileWriter(writeFile, true));
			Reader reader3 = new BufferedReader(new FileReader(writeFile));

			// reads the length of the file and records the frequency of each
			// character
			int c = reader.read();
			int length = 0;
			while (c != -1) {
				Integer freq = table.get((char) c);
				length++;
				if (freq == null) {
					table.put((char) c, 1);
				} else {
					table.put((char) c, (freq + 1));
				}
				c = reader.read();
			}

			System.out.println(table);

			Iterator<Map.Entry<Character, Integer>> iter = table.entrySet()
					.iterator();

			Node EOFNode = new Node();
			EOFNode.setValue(-1);
			priQue.add(EOFNode);

			while (iter.hasNext()) {
				Entry<Character, Integer> set = iter.next();
				Character ch = set.getKey();
				Node node = new Node();
				node.setCharacter(ch);
				node.setValue(set.getValue());
				priQue.add(node);
			}

			while (priQue.size() > 1) {
				Node node1 = priQue.poll();
				Node node2 = priQue.poll();
				Node node = new Node();
				node.setLeftChild(node1);
				node.setRightChild(node2);
				node1.setParent(node);
				node2.setParent(node);
				node.addLeftToRight();
				node.setCharacter(null);
				priQue.add(node);
				NodeQue.add(node);
				NodeQue.add(node1);
				NodeQue.add(node2);

			}

			Node node = priQue.peek();
			node.setRoot();
			System.out.println(priQue.poll().getValue());
			HuffmanTree.buildCodes(node, "", StrTable);
			System.out.println(StrTable);
			int writeLength = 0;
			System.out.println("\nFile Below: ");
			int ch = reader2.read();
			while (ch != -1) {
				String i = StrTable.get((char) ch);
				System.out.print(i);
				writeLength = i.length() + writeLength;
				ch = reader2.read();
			}
			writer.append((StrTable.get(null)));
			writer.close();

			// second time for timeing the computation
			long time2 = System.currentTimeMillis();

			length = length * 8;
			System.out.println("\n\n---------> " + length);
			System.out.println("---------> " + writeLength);
			System.out.println("\nTime --> " + (time2 - time1));
			times[r] = (time2 - time1);
			r++;
			System.out.println("Your Efficency Precentage Is: "
					+ (((1 - (float) writeLength / (float) length)) * 100)
					+ "%\n\n Next Run: \n");
		}
		long z = 0;
		System.out.print("\n\n\n");
		for (int q = 2; q < a; q++) {
			z = z + times[q];
			System.out.println(times[q]);
		}
		if ((a - 2) != 0) {
			System.out.println("\n\n\n\nAverage Time ====> " + (z / (a - 2)));
		} else {
			System.out.println("Unable to Caluclate Average");
		}
	}

}