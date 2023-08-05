import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Student {
    private List<Integer> marks;

    public Student(List<Integer> marks) {
        this.marks = marks;
    }

    public double calculateAvg() {
        return marks.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }

    public static void main(String[] args) {
        List<Integer> studentMarks = new ArrayList<>();
        studentMarks.add(99);
        studentMarks.add(98);
        studentMarks.add(97);
        studentMarks.add(100);
        studentMarks.add(92);
        studentMarks.add(84);
        studentMarks.add(80);
        studentMarks.add(89);
        studentMarks.add(90);

        Student student = new Student(studentMarks);
        Function<Student, Double> avgFunction = Student::calculateAvg;
        double average = avgFunction.apply(student);

        System.out.println("Average marks: " + average);
    }
}
