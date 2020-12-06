import org.testng.annotations.*;
import other.BitcoinService;
import other.BlockchainService;
import java.util.ArrayList;
import static org.testng.Assert.assertTrue;
import static other.BitcoinTestComparator.isDiffWithinQuota;

public class BitcoinTest {

    @Test
    public void BitcoinTest() {
        BitcoinService bitcoinService = new BitcoinService();
        BlockchainService blockchainService = new BlockchainService();
        ArrayList bitcoinAverages = bitcoinService.getListOfBitcoinAverages();
        ArrayList blockchainAverages = blockchainService.getListOfBlockchainAverages();

        assertTrue(isDiffWithinQuota(bitcoinAverages, blockchainAverages), "Diff exceeds the quota");
    }
}
