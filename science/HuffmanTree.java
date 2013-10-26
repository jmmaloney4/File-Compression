package science;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HuffmanTree {
	
	private long time;
	private long startT;
	private long endT;
	private File file = Science.InFile;
	private Scanner scan;
	
	public long Run() throws FileNotFoundException {
		scan = new Scanner(file);
		startT = System.currentTimeMillis();
		
		
		
		endT = System.currentTimeMillis();
		time = (endT - startT);
		return time;
	}
}
