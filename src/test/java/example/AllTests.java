package example;

import com.palantir.docker.compose.DockerComposeRule;
import org.junit.ClassRule;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(SuiteTest.class)
public class AllTests {

    @ClassRule
    public static DockerComposeRule dockerComposeRule = DockerComposeRule.builder().file("docker-compose.yml").build();
}
