package singleton.two;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/8/17 15:04
 * @Description: null
 */
public class PersonResource {
    private static PersonResource personResourceSingleton;
    private PersonResource() {

    }
    public static PersonResource getPersonResourceSingleton(){
        if(null==personResourceSingleton){
            personResourceSingleton = new PersonResource();
        }
        return personResourceSingleton;
    }
}
