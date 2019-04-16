package easy;

/**
 * @author zhangchen
 * @Date 2019/4/16 16:43
 */
class isPalindrome {

    public static boolean isPalindrome(int x) {

        if ( x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        int revertNum = 0;
        while (x > revertNum) {
            revertNum = revertNum*10 + x % 10;
            x /= 10;
        }

        return x == revertNum || x == revertNum/10;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(2356532));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(0));
        System.out.println(isPalindrome(123));
    }
}
