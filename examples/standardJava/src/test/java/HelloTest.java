import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import java.io.PrintStream;

public class HelloTest {

    private PrintStream stream;

    private PrintStream mockStream = mock(PrintStream.class);

    @Before
    public void setup() {
        stream = System.out;
        System.setOut(mockStream);
    }

    @After
    public void teardown() {
        System.setOut(stream);
    }

    @Test
    public void testMain() {
        // Execute
        Hello.main(new String[] {});

        // Assert
        verify(mockStream).println("Hello Build");
    }

}
