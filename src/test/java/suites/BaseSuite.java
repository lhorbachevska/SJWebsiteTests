package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.LoginTest;
import tests.RegistrationTest;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                LoginTest.class,
                RegistrationTest.class
        }
)
public class BaseSuite {
}
