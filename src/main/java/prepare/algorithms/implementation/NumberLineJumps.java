package prepare.algorithms.implementation;

public class NumberLineJumps {

    public static void main(String[] args) {
        String kangaroo = kangaroo(5, 6, 7, 3);
        System.out.println(kangaroo);
    }

    /**
     *
     * <p>0 =< x1 < x2 =< 10000 </p>
     * <p>1 =< v1 =< 10000</p>
     * <p>1 =< v2 =< 10000</p>
     * <p>
     * To catch the second Kangaroo first Kangaroo run fast than second Kangaroo. Also starting distance difference between two
     * Kangaroo should divisible from speed difference.
     * </p>
     */
    public static String kangaroo(int x1, int v1, int x2, int v2) {

        if (v1 > v2 && (x2 - x1) % (v2 - v1) == 0) {
//            int d1 = 0, d2 = 0, i = 1;
//            do {
//                d1 = x1 + (v1 * i);
//                d2 = x2 + (v2 * i);
//                System.out.println(d1 + " === " + d2);
//                if (d1 == d2) {
                    return "YES";
//                }
//                i++;
//            } while (true);
        }
        return "NO";
    }
}
