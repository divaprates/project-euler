package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem2 {
    private List<Integer> listFibonacci = new ArrayList<>();
    private int limit;
    private long sum;

    public Problem2(int limit) {
        this.sum = 0;
        this.limit = limit;
    }

    public void findFibonacci() {
        // int previous = 1;
        // this.listFibonacci.add(1);
        // int i = 2;

        this.listFibonacci = Stream.iterate(new int[]{1, 2}, fib -> new int[]{fib[1], fib[0] + fib[1]})
            .takeWhile(fib -> fib[0] <= this.limit)
            .map(fib -> fib[0])
            .collect(Collectors.toList());
        
            
        // while ( previous <= this.limit) {
        //     this.listFibonacci.add(i);
        //     i += previous;
        //     previous = getLast(this.listFibonacci);
        // }
    }

    public int getLast(List<Integer> list) {
        return list.get(list.size()-1);
    }

    public void sumFibonacci() {
        this.sum = this.listFibonacci.stream()
            .filter(i -> i % 2 == 0)
            .mapToLong(i -> i)
            .sum();

        // for (Integer integer : listFibonacci) {
        //     if(integer % 2 == 0) {
        //         this.sum += integer;
        //     }
        // }
    }

    public Long calculate() {
        this.findFibonacci();
        this.sumFibonacci();

        return this.sum;
    }

    public void showList() {
        for (Integer integer : listFibonacci) {
            System.out.println(integer);
        }
    }
}
