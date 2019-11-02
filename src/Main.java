/**
 * @author Charun Upara
 * @author Govind Brahmunyapura
 * @version 1.0
 */

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        /**
         * Initial seed for LFSR(), parsed from user input in the form of a command line argument
         */
        int seed = Integer.parseInt(args[0]);

        /**
         * Array of nums initialized to 0 that will be used to create red-black tree (will be passed to LFSR() to fill value)
         */
        int[] nums = new int[10];


        //Generate 10 random numbers using LFRS which will be stored in the previously create array (nums)
        LFSR(seed, nums);

        /**
         * Steps from here
         *  * Create new root node
         *      * root.val = nums[0]
         *      * root.left = null
         *      * root.right = null
         *      * root.color = 'b'
         *  * Loop through the rest of nums and insert each node
         *  * Print the tree by using level-order traversal (queue)
         *
         */


        System.out.println("Test");
    }

    /**
     * Insert a new node where node.val = val into red-black tree
     * @param tree the tree that the new node will be inserted into
     * @param val value of the node to be inserted into the tree
     */
    public static void insertRBT(RBT tree, int val) {
        TreeNode newNode = new TreeNode(val);
        //This step almost resembles the insertion method for regular binary search trees
        TreeNode y = tree.NIL;
        TreeNode x = tree.root;
        while(x != tree.NIL) {
            y = x;
            if (newNode.val < x.val) {
                x = x.left;
            }
            else {
                x = x.right;
            }
        }
        newNode.parent = y;

        if(y == tree.NIL) {
            tree.root = newNode;
        }
        else if (newNode.val < y.val) {
            y.left = newNode;
        }
        else {
            y.right = newNode;
        }
        newNode.left = tree.NIL;
        newNode.right = tree.NIL;
        newNode.color = 'r';
        insertRBTFixUp(tree, newNode);
    }

    /**
     * Rotates the node to the left by reassigning pointers
     * Since we are always reassigning the same pointers regardless of tbe size of tree,
     * this method runs in O(1) time.
     * @param tree the red-black tree containing the node to be left-rotated
     * @param x the node to be left-rotated
     */
    public static void leftRotate(RBT tree, TreeNode x) {
        TreeNode y = x.right;
        x.right = y.left;
        if(y.left != tree.NIL) {
            y.left.parent = x;
        }
        y.parent = x.parent;
        if(x.parent == tree.NIL) {
            tree.root = y;
        }
        else if (x == x.parent.left) {
            x.parent.left = y;
        }
        else {
            x.parent.right = y;
        }
        y.left = x;
        x.parent = y;
    }

    /**
     * Rotate the node to the right by reassigning pointers
     * Since we are always reassigning the same pointers regardless of tbe size of tree,
     * this method runs in O(1) time.
     * @param tree the red-black tree containing the node to be right-rotated
     * @param node the node to be right-rotated
     */
    public static void rightRotate(RBT tree, TreeNode node) {
        //TODO


    }
    public static void insertRBTFixUp(RBT tree, TreeNode node) {
        //TODO
    }
    public static void transplantRBT(RBT tree) {
        //TODO
    }
    public static void deleteRBT(RBT tree, TreeNode node) {
        //TODO
    }
    public static void deleteRBTFixUp(RBT tree, TreeNode node) {
        //TODO
    }



    /**
     * Generate 10 random numbers to be used to create tree
     * TODO Analyze complexity
     * @param seed the initial seed that is parsed from args
     * @param nums empty array of 10 integers that will be filled by this method and used to create the tree
     *
     */
    public static void LFSR(int seed, int[] nums) {
        /*
         * TODO
         * What we need to do for this method
         *  * Convert seed (decimal) to binary
         *  * Get 0th, 2nd, 3rd, and 5th bits (store in array?)
         *  * Find the following: (5th XOR (3rd XOR (2nd XOR 0th)))
         *  * Create new binary string
         *      * Shift bit of seed (binary) to the right by one position
         *      * Change first (most significant) bit to the result of (5th XOR (3rd XOR (2nd XOR 0th)))
         *  * Covert new binary to decimal, and that is the randomly generated number
         */

        /**
         * Binary version of seed
         */
        String binaryInput = Integer.toBinaryString(seed);
        int[] binaryDigits = new int[4];
        binaryDigits[0] = (int)(binaryInput.charAt(2) - '0');
        binaryDigits[1] = (int)(binaryInput.charAt(4) - '0');
        binaryDigits[2] = (int)(binaryInput.charAt(5) - '0');
        binaryDigits[3] = (int)(binaryInput.charAt(7) - '0');

        int newBit = (binaryDigits[0] ^ ((binaryDigits[1] ^ (binaryDigits[5] ^ binaryDigits[7]))));



    }

    /**
     *
     * @param seed binary version of the seed
     * @param nums array to store the randomly generated number
     * @return
     */
    public static int LFSRHelper(String seed, int nums) {
        /*
         * TODO
         *
         *
         */

        return 0;
    }

    /**
     * Print a red-black tree level-by-level
     * Since we are visit each node exactly once, the runtime complexity of this method would be O(n).
     * In this method, we also create a queue that we use to keep track of the traversal, so the space complexity would
     * also be O(n), since we need to add every element to the queue.
     * @param root root node of a red-black tree
     */
    public static void levelOrderPrint(TreeNode root) {

        /**
         * Queue used for tree traversal
         */
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();

        queue.add(root);

        /**
         * Print tree by level
         */
        while(!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.println(temp.val);

            if(temp.left != null) {
                queue.add(temp.left);
            }
            if(temp.right != null) {
                queue.add(temp.right);
            }
        }

    }
}
