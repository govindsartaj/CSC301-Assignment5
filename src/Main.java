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
     * Generate 10 random numbers to be used to create tree
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
     * @param seed
     * @param nums
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
