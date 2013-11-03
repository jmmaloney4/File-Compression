package huffmantrees;
/**
 * object for representing nodes on the tree
 * @author jack
 *
 */
public class Node {
	
	/**
	 * constructor
	 */
	public Node() {
		
	}
	
	private Node rightChild;
	private Node leftChild;
	private Node parent;
	private int value;
	private Character ch;
	private int num;
	private boolean isRoot = false;
	
	/**
	 * sets the right side child node
	 */
	public void setRightChild(Node node) {
		this.rightChild = node;
	}
	
	/**
	 * sets the left side child node
	 * @param node
	 */
	public void setLeftChild(Node node) {
		this.leftChild = node;
	}
	
	/**
	 * sets the parent node
	 * @param node
	 */
	public void setParent(Node node) {
		this.parent = node;
	}
	
	/**
	 * returns the right child node
	 * @return
	 */
	public Node getRightChild() {
		return this.rightChild;
	}
	
	/**
	 * returns the left child node 
	 * @return
	 */
	public Node getLeftChild() {
		return this.leftChild;
	}
	
	/**
	 * returns the parent node
	 * @return
	 */
	public Node getParent() {
		return this.parent;
	}
	
	/**
	 * sets the node as root
	 */
	public void setRoot() {
		this.parent = null;
		this.isRoot = true;
	}
	
	/**
	 * returns the value for this node
	 * @return
	 */
	public int getValue() {
		return this.value;
	}
	
	/**
	 * 
	 * @return
	 */
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
	
	/**
	 * sets the value of the node
	 * @param val
	 * @return
	 */
	public int setValue(int val) {
		this.value = val;
		return val;
	}
	
	/**
	 * sets the character if its a leaf node
	 * @param cha
	 */
	public void setCharacter(Character cha) {
		this.ch = cha;
	}
	
	/**
	 * gets the character, returns c, a Character, not a char
	 * @return
	 */
	public Character getCharacter() {
		return this.ch;
	}
	
	/**
	 * @param n
	 * @return
	 */
	public int setNum(int n) {
		this.num = n;
		return n;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getNum() {
		return this.num;
	}
	
	/**
	 * returns a boolean telling if this is a root node or not
	 * @return
	 */
	public boolean isRoot() {
		return this.isRoot;
	}
	
	/**
	 * returns a boolean telling if this is a leaf node or not 
	 * @return
	 */
	public boolean isLeaf() {
		return !(this.hasLeft() && this.hasRight());
	}
	
	/**
	 * tells if this node has a left child node
	 * @return
	 */
	public boolean hasLeft() {
		return (this.getLeftChild() != null);
		
	}
	
	/**
	 * tells if this node has a right child node
	 * @return
	 */
	public boolean hasRight() {
		return (this.getRightChild() != null);
	
	}
}
