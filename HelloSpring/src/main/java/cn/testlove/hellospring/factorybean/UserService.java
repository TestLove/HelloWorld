package cn.testlove.hellospring.factorybean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/8/24 12:13
 * @Description: null
 */
@Component
public class UserService {
    @Autowired
    private IUserMapper userMapper;
    public String selectName(){
        return userMapper.selectName();
    }
}
