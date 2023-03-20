package shop.mtcoding.jwtstudy.example;

import org.junit.jupiter.api.Test;

public class EnvTest {

    @Test
    public void env_test() {
        String myEnv = System.getenv("JAVA_HOME");
        System.out.println(myEnv);
    }
}
