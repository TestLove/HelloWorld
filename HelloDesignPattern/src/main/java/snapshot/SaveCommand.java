package snapshot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/9/11 16:42
 * @Description:
 * 实现存储输入命令功能
 */
public class SaveCommand {
    List<String> file = new ArrayList<>();

    public void execute() {
        StringBuffer stringBuffer = new StringBuffer();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print(">");
            String s = scanner.nextLine();

            if(s.equals(":undo")){
                file.remove(file.size()-1);
            }else if(s.equals(":list")){
                file.forEach(System.out::println);
            }else{
                file.add(s);
            }
        }
    }

    public static void main(String[] args) {
        new SaveCommand().execute();
    }
}
