package simple;

import java.util.Arrays;
import java.util.Random;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/8/22 18:33
 * @Description:
 *
 */
public class CrossPrint {
    private static  boolean flag = false;
    public static void main(String[] args) {
        new Thread(()->{
            int i = 0;
            while (i<=100) {
                System.out.println("ThreadA is runnable");
                if (!flag) {
                    System.out.println("Thread-A"+i);
                    i=i+2;
                    flag=true;


                }
            }
        }).start();

        new Thread(()->{
            int i = 1;
            while (i<=100) {
//                System.out.println("ThreadB is runnable");
                if (flag) {
                    System.out.println("Thread-B"+i);
                    i=i+2;
                    flag=false;
                }

            }
        }).start();
    }
}
