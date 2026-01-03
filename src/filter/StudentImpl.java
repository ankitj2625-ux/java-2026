package filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentImpl {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("ankit", 90));
        studentList.add(new Student("ram", 100));
        studentList.add(new Student("madan", 50));
        studentList.add(new Student("gopal", 60));

        List<Student> getSortedList = studentList.stream()
                .filter(findMarks -> findMarks.getMarks() >= 60)
                .collect(Collectors.toList());

        for (Student getMarkList : getSortedList) {
            System.out.println(getMarkList);
        }
    }
}
