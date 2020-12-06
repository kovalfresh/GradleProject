package other;

import javafx.util.Pair;
import java.util.ArrayList;

public class BitcoinTestComparator {

    public static boolean isDiffWithinQuota(ArrayList<Pair<Double,String>> bitcoinAveragesList, ArrayList<Double> blockchainAveragesList) {
        double diff;
        for (int i = 0; i < 30; i++) {
            diff = Math.abs(100 * (bitcoinAveragesList.get(i).getKey() - blockchainAveragesList.get(i)) / blockchainAveragesList.get(i));
            if (diff > 0.2) {
                System.out.println(bitcoinAveragesList.get(i).getValue() + diff);
                return false;
            }
        }
        return true;
    }
}
