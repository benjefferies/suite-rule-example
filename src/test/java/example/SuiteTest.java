package example;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

import static org.junit.Assert.assertNotNull;

public class SuiteTest {

    @Test
    public void testDependingOnSuiteRule() throws IOException {
        URL url = new URL("http://localhost:80");

        String response = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream())).lines().collect(Collectors.joining());

        assertNotNull(response);
    }
}