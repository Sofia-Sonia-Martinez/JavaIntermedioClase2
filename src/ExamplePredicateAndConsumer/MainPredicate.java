package ExamplePredicateAndConsumer;
import java.util.function.Predicate;
public class MainPredicate {
    public static void main(String[] args) {
        Student student = new Student("Sofia Martinez", 9);
        Predicate<Student> predicate = x->x.score >= 6;
        System.out.println("Student aproved: " + predicate.test(student));

    }
}
