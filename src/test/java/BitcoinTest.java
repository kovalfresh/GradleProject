import org.testng.Assert;
import org.testng.annotations.*;
import other.BitcoinService;
import other.BlockchainService;

import static other.BitcoinTestComparator.bitcoinTestComparator;

public class BitcoinTest {

    @Test
    public void BitcoinTest() {

        BitcoinService bitcoinService = new BitcoinService();
        bitcoinService.getListOfAverages();
        BlockchainService blockchainService = new BlockchainService();
        blockchainService.getListOfY();
        Assert.assertEquals(bitcoinTestComparator(bitcoinService.getListOfAverages(), blockchainService.getListOfY()), true, "Test failed!");

    }
}
