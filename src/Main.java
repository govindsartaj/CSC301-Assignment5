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
     * From book:
     * TREE-INSERT(T, z)
     * 1 y = NIL
     * 2 x = T.root
     * 3 while neq NIL
     * 4    y = x
     * 5    if  z.key < x.key
     * 6        x = x.left
     * 7    else x = x.right
     * 8 z.p = y
     * 9 if y == NIL
     * 10   T.root = z // tree T was empty
     * 11 elseif z.key < y.key
     * 12   y.left = z
     * 13 else y.right = z
     * @param tree the tree that the new node will be inserted into
     * @param val value of the node to be inserted into the tree
     */
    public static void InsertRBT(RBT tree, int val) {
        TreeNode cur = new TreeNode(val);
        //Case I: Tree is empty
        if(tree.size == 0) {
            // TODO create new tree, where root of tree is the new node
        }

        //Case II: z.color == 'r' && z.p.color == 'r'
        // TODO solve collision accordingly
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

        //Traverse tree and print by level
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
