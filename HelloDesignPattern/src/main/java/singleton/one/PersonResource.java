package singleton.one;

import java.util.HashMap;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/8/17 14:59
 * @Description: null
 */
public class PersonResource {
    public static final PersonResource PERSON_RESOURCE_SINGLETON = new PersonResource();
    private PersonResource(){}
    public  static PersonResource getInstance() {

        return PERSON_RESOURCE_SINGLETON;
    }
}
