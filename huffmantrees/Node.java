package huffmantrees;

public class Node {

	public Node() {
		
	}
	
	private Node rightChild;
	private Node leftChild;
	private Node parent;
	private int value;
	private Character ch;
	private int num;
	private boolean isRoot = false;
	
	public void setRightChild(Node node) {
		this.rightChild = node;
	}

	public void setLeftChild(Node node) {
		this.leftChild = node;
	}

	public void setParent(Node node) {
		this.parent = node;
	}

	public Node getRightChild() {
		return this.rightChild;
	}

	public Node getLeftChild() {
		return this.leftChild;
	}

	public Node getParent() {
		return this.parent;
	}

	public void setRoot() {
		this.parent = null;
		this.isRoot = true;
	}

	public int getValue() {
		return this.value;
	}

	public Node addLeftToRight() {
		if (this.getLeftChild() == null) {
			return null;
		}
		else if (this.getRightChild() == null) {
			return null;
		}
		else {
			this.value = (this.getLeftChild().getValue() + this.getRightChild().getValue());
			return this;
		}
	}
	
	public int setValue(int val) {
		this.value = val;
		return val;
	}
	
	public void setCharacter(Character cha) {
		this.ch = cha;
	}
	
	public Character getCharacter() {
		return this.ch;
	}
	
	public int setNum(int n) {
		this.num = n;
		return n;
	}
	
	public int getNum() {
		return this.num;
	}
	
	public boolean isRoot() {
		return this.isRoot;
	}
	
	public boolean isLeaf() {
		return !(this.hasLeft() && this.hasRight());
	}
	
	public boolean hasLeft() {
		return (this.getLeftChild() != null);
		
	}
	
	public boolean hasRight() {
		return (this.getRightChild() != null);
	
	}
}
