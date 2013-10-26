package huffmantrees;

import java.util.Comparator;

public class NodeComparator2 implements Comparator<Node> {

	@Override
	public int compare(Node o1, Node o2) {	
		return (o1.getValue() - o2.getValue());
	}

}
