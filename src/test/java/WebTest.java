import com.dtuchs.libs.selenium.base.Core;
import com.dtuchs.libs.selenium.base.SmartElementList;
import com.dtuchs.libs.selenium.base.matcher.SmartElementListMatcher;
import org.junit.jupiter.api.Test;

public class WebTest {

    @Test
    void webTest() {
        Core.open("https://github.com/dtuchs");
        SmartElementList webElements = Core.locateAll(".flex-content-stretch");
        SmartElementListMatcher.assertThat(webElements).containsTextInAnyElement("heisenbug");
    }
}
