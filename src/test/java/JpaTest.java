import com.dtuchs.libs.orm.base.JpaExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import service.UsersService;

@ExtendWith(JpaExtension.class)
public class JpaTest {

    UsersService us = new UsersService();

    @Test
    void test() {
        us.addPurchaseToUser("Dima", "TEA", 100);
        // do test
    }
}
