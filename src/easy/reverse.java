package easy;

/**
 * @author zhangchen
 * @Date 2019/4/16 16:04
 */
class reverse {


    public static int reverse(int x) {
        int result = 0;
        while ( x != 0) {
            int pop = x % 10;
            x /= 10;
            if (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && pop > 7 )) return 0;
            if (result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE/10 && pop < -8 )) return 0;
            result = result * 10 + pop;
        }

        return result;
    }

    public static void main(String[] args) {

        int index = 123456789;
        index = reverse(index);
        System.out.println(index);

    }
}
