package algorithm.problem;

import java.util.ArrayList;

/**
 * @author TestLove
 * @version 1.0
 * @date 2021/8/12 20:15
 * @Description:
 * 6 z型变换
 */
public class ZigZagConversion {
    public static String convert(String s, int numRows) {
        if (s.length()==1){
            return s;
        }
        int distance = 2*numRows-2;
        ArrayList<Integer> integers = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int row = 0; row < numRows;row++) {
            int index = row;
            int column = 0;
            while (true) {
                if (column%2==1&&(row!=0&&row!=numRows-1)) {
                    if(index-row-row>=s.length()){
                        break;
                    }
                    stringBuilder.append(s.charAt(index-row-row));
                    integers.add(index-row-1);
                }else{
                    if(index>=s.length()){
                        break;
                    }
                    stringBuilder.append(s.charAt(index));
                    integers.add(index);
                    index = index+distance;
                }


                column++;
            }
        }
        return stringBuilder.toString();

    }

    public static void main(String[] args) {
        System.out.println(convert("P",1));
    }
}
