package algorithm.problem;

import java.util.HashMap;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/8/17 14:34
 * @Description:
 * 551. 学生出勤记录1
 * 说实话,难得这么畅快的做出一题
 */
public class StudentAttendanceRecordI {
    public boolean checkRecord(String s) {

        int aCount = 0;
        int lCount = 0;
        for (int i = 0; i < s.length(); i++) {
           if(s.charAt(i)=='A'){
               aCount++;
               lCount=0;
           }else if (s.charAt(i)=='L') {
               lCount++;
           }else {
               lCount=0;
           }
           if (aCount>=2||lCount >=3) {
               return false;
           }
        }
        return true;


    }
}
