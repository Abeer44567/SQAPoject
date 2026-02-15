package comm;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LoginServiceTest {
    private LoginService loginService;

    @Before
    public void setUp() {
        loginService = new LoginService();
    }

    @Test
    public void testValidLogin() {
        assertTrue(loginService.login("admin", "12345"));
        assertTrue(loginService.login("user", "password"));
    }

    @Test
    public void testInvalidLogin() {
        assertFalse(loginService.login("admin", "wrongpass"));
        assertFalse(loginService.login("unknown", "12345"));
    }

    @Test
    public void testNullInputs() {
        assertFalse(loginService.login(null, "12345"));
        assertFalse(loginService.login("admin", null));
        assertFalse(loginService.login(null, null));
    }
}


