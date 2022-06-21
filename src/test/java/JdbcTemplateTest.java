import org.junit.jupiter.api.Test;
import service.UsersServiceJdbc;

public class JdbcTemplateTest {

    UsersServiceJdbc usJdbc = new UsersServiceJdbc();

    @Test
    void test() {
        usJdbc.addPurchaseToUser("Dima", "TEA_JDBC", 100);

        // do test
    }
}
