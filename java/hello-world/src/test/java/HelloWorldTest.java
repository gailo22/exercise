import org.junit.Ignore;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

public class HelloWorldTest {

    @Test
    public void testHelloWorld() {
        String expected = "Hello, World!";
        String actual = new HelloWorld().helloWorld();

        assertThat(actual).isEqualTo(expected);
    }
}
