import org.testng.annotations.BeforeClass;
import other.RunConfig;

public class BasicTestExecutor {
    protected String login;
    protected String password;

    @BeforeClass
    public void defaultBeforeClass() {
        login = RunConfig.readFromConfig( "login" );
        password = RunConfig.readFromConfig( "password" );
    }
}
