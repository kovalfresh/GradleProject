package other;

import java.util.ArrayList;

public class BitcoinTestComparator {

    private static double diff;

    public static boolean bitcoinTestComparator(ArrayList<Double> average, ArrayList<Double> y) {

        for (int i = 0; i < 30; i++) {

            diff = Math.abs(100 * (average.get(i) - y.get(i)) / y.get(i)) ;
            if (diff > 0.2) { return false; }

        }

        return true;
    }
}
