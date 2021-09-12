package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/9/11 12:15
 * @Description: null
 */
public class Visitor {
    public static void main(String[] args) {
        Speak speak = new Speak();
        Person student = new Student();
        List<String> s = new ArrayList<>();
//        get(s);
//        speak.say(student);
    }
    public static void get(ArrayList args){}
}
