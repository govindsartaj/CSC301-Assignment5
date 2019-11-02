public class RBT {

    /**
     * Root node of the red-black tree
     */
    TreeNode root;

    /**
     * The T.NIL node as specified in the textbook
     */
    TreeNode NIL = null;

    /**
     * The number of nodes in the tree
     */
    int size;

    /**
     * The height of the tree
     */
    int height;

    public RBT() {
        this.size = 0;
        this.height = 0;
    }

    public RBT(TreeNode root) {
        this.root = root;
        this.root.parent = this.NIL;
        this.size = 0;
        this.height = 0;
    }

    public int getBlackHeight(TreeNode node) {
        //TODO
        return 0;
    }




}
