import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class UserProxyTest {

    @BeforeEach
    void setUp() {
        BD.addUser(new User("4562", "123"));
    }

    @Test
    void deveRetornarDadosUsuario() {
        UserProxy user = new UserProxy("123456");

        assertEquals(Arrays.asList("123456, 1234"), user.getInfo());
    }

    @Test
    void deveRetornarDinheiroBanco() {
        Bank bank = new Bank("1234", 500);
        UserProxy user = new UserProxy("123");

        assertEquals(500.0, user.withdrawMoney(bank));
    }

    @Test
    void mustThrowIllegalArgumentExceptionNoAvailable() {
        try {
            Bank bank = new Bank("site.com", 500);
            UserProxy user = new UserProxy("123");

            user.withdrawMoney(bank);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Acesso negado.",
                    e.getMessage() );
        }
    }


}
