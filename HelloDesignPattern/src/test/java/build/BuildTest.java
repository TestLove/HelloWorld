package build;

import org.junit.jupiter.api.Test;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/8/14 21:10
 * @Description: null
 */
public class BuildTest {
    @Test
    public void buildTest() {
        Person build = new PersonBuilder().setName("wsqwq").setMotherAge(110).setAge(20).setSchool("qs").build();
        System.out.println(build);
    }
}
