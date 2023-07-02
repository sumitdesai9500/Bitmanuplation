import java.util.*;

public class bitoperators {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 5; // 0101
        int pos = 3;
        int bitmask = 1 << pos;
        /*
         * get bit
         * Steps:
         * 1) bitmask: 1<<i 0001<<3=1000
         * 2) operation: &
         * 1000 ...(bitmask of 1<<i)
         * 0101 ...(n=5)
         * 0000 ..(value is 0)
         */
        System.out.println("Getting a bit:");
        if ((bitmask & n) == 0) {
            System.out.println("The value is 0");
        } else {
            System.out.println("The value is 1");
        }

        // set bit
        /*
         * Steps:
         * 1) bitmmask: 1<<i //1=0001<<3 = 1000
         * 2) operation: |
         * 1000 ...(1<<i)
         * 0101 ...(n=5)
         * 1101 ...(13)
         */
        int no = bitmask | n;
        System.out.println("Setting a bit: " + no);

        /*
         * Clear Bit
         * 1) bit mask: 1<<i for position=2; //0100 then NOT of bitmask=1011
         * 2) AND with NOT
         * 1011 ...(NOT of bitmask)
         * 0101 ...(n)
         * 0001
         * i.e takeout NOT of Bitmask
         */
        int posc = 2;
        int bm = 1 << posc;
        int notofbitmask = ~bm;

        int nos = notofbitmask & n;
        System.out.println("Clearing a bit: " + nos);

        // Update a bit to 0 or 1;
        /*
         * when it is update a bit to 1: its a set operation
         * When it is update a bit to 0: its a clear operation
         */
        System.out.println("Enter a demimal number:");
        int bit = sc.nextInt();
        System.out.println("Enter 0 to update the bit to 0 or 1 to update the bit to 1:");
        int op = sc.nextInt();
        System.out.println("Enter a postion to update the bit:");
        int poss = sc.nextInt();
        int BM = 1 << poss;
        int result;
        if (op == 1) {
            result = bit | BM;
            System.out.println("The reuslt is:" + result);
        } else if (op == 0) {
            result = ~BM & bit;
            System.out.println("The result is:" + result);
        } else {
            System.out.println("Enter a correct position");
        }
    }
}
