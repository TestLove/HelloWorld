package singleton.three;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/8/17 15:10
 * @Description: 通过一个静态内部类持有该外部类实例
 */
public class PersonResource {
    private PersonResource(){}
    private static class PersonResourceHolder{
        public static PersonResource personResourceSingleton = new PersonResource();
    }
    public static PersonResource getInstance(){
        return PersonResourceHolder.personResourceSingleton;
    }
}
