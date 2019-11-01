/**
 * @author Charun Upara
 * @author Govind Brahmunyapura
 * @version 1.0
 */
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


        LFSR(seed, nums);


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
}
