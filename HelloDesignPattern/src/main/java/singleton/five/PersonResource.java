package singleton.five;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/9/8 21:10
 * @Description: null
 */
public class PersonResource {
    private PersonResource(){    }
    private volatile static PersonResource personResource;
    public  static PersonResource getInstance(){
        if(personResource==null){
            synchronized (PersonResource.class){
                if(personResource==null){
                    personResource = new PersonResource();
                }
            }
        }
        return personResource;
    }
}
