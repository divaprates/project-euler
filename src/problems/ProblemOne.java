package problems;

import java.util.ArrayList;
import java.util.List;

public class ProblemOne {
    /* Multiples of 3 or 5 */
    private int a;
    private int b;
    private int limit;
    private List<Integer> multiples = new ArrayList<>();
    private int sum;

    public ProblemOne(int a, int b, int limit) {
        this.sum = 0;
        this.a = a;
        this.b = b;
        this.limit = limit;
    }

    private void findMultiples(int x) {
        for(int i = x; i < limit; i++) {
            if(i % x == 0) {
                this.multiples.add(i);
            }
        }
    }

    public Integer calculate() {
        this.findMultiples(a);
        this.findMultiples(b);

        this.sum = this.multiples.stream().distinct().mapToInt(Integer::intValue).sum();

        return this.sum;
    }
    
}
