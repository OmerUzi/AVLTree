public class AVLNode {

    private int key;
    private int size;
    private int height;
    private String value;
    
    private AVLNode parent;
    private AVLNode left;
    private AVLNode right;

    public AVLNode(int key, String value){
        this.key=key;
        this.size=1;
        this.value=value;
        this.height = 0;
        this.right=null;
        this.left=null;
        this.parent=null;
    }

    public AVLNode(){
        this.height = -1;
    }

    public int getKey()
    {
        return this.key;
    }

    public String getValue()
    {
        return this.value;
    }

    public void setLeft(AVLNode node)
    {
        this.left= node;
    }

    public AVLNode getLeft()
    {
        return this.left;
    }

    public void setRight(AVLNode node)
    {
        this.right=node;
    }

    public AVLNode getRight()
    {
        return this.right;
    }

    public void setParent(AVLNode node)
    {
        this.parent=node;
    }
    public AVLNode getParent()
    {
        return this.parent;
    }

    public void setHeight(int height)
    {
        this.height=height;
    }

    public int getHeight()
    {
        return this.height;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
