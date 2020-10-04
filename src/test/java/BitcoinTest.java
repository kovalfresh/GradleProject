import org.testng.annotations.*;
import other.BitcoinService;

public class BitcoinTest {

    @Test
    public void BitcoinTest() {

        BitcoinService bitcoinService = new BitcoinService();
        bitcoinService.getListOfAverages();

    }
}
