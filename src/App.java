import problems.ProblemOne;

public class App {

    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        ProblemOne one = new ProblemOne(3, 5, 1000);
        System.out.println("Problem one: " + one.calculate());
    }
}
