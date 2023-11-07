package ExamplePredicateAndConsumer;

import java.util.function.Consumer;
public class MainConsumer {

    public static void main(String[] args) {

        Student student = new Student("Pepe Honguito", 9);
        Student student1 = new Student("Sofia Martinez", 10);
        Consumer<Student> StudentConsumer = oneStudent -> System.out.println(oneStudent.toString());
        StudentConsumer.accept(student);
        StudentConsumer.accept(student1);
    }
}
