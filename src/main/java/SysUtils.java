import com.fasterxml.jackson.core.type.TypeReference;

public class SysUtils {

    public static void sleep(long mS) {
        try {
            Thread.sleep(mS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return;
    }
}