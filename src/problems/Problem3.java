package problems;

import java.util.ArrayList;
import java.util.List;

public class Problem3 {
    private long number;
    private List<Integer> resultList;

    public Problem3(long number) {
        this.number = number;
        this.resultList = new ArrayList<>();
    }

    public int calculate() {
        findFactor();

        return resultList.get(resultList.size() - 1);
    }

    private void findFactor() {
        long aux = number;

        for (int i = 2; aux != 1; i++) {
            while(aux%i == 0){
                resultList.add(i);
                aux = aux/i;
            }
        }
    }
}
