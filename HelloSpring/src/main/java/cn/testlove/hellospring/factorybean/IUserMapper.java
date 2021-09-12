package cn.testlove.hellospring.factorybean;


import org.springframework.stereotype.Component;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/8/24 12:13
 * @Description: null
 */
@Component
public interface IUserMapper {
    String selectName();
}
