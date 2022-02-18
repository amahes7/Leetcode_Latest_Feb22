package Feb22Practise.LeetcodeDS1;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {


    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> prev = new ArrayList<>();
        for (int i=1;i<numRows;i++){
            List<Integer> current = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) current.add(1);
                else current.add(prev.get(j-1)+prev.get(j-2));
            }
            result.add(current);
            prev=current;
        }
        return result;

    }

}
