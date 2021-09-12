package cn.testlove.hellospring.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/8/12 9:55
 * @Description: null
 */
@Component
public class B {
    @Value("41")
    int a = 0;

    @Override
    public String toString() {
        return "B{" +
                "a=" + a +
                '}';
    }
}
