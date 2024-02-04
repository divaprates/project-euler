import problems.Problem1;
import problems.Problem2;
import problems.Problem3;

public class App {

    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        Problem1 one = new Problem1(3, 5, 1000);
        System.out.println("Problem one: " + one.calculate());

        Problem2 two = new Problem2(4000000);
        System.out.println("Problem two: " + two.calculate());
        // two.showList();

        Problem3 three = new Problem3(600851475143L);
        System.out.println("Problem three: " + three.calculate());
    }
}
