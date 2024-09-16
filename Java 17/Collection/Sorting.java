import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting{
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(24);
        nums.add(39);
        nums.add(61);
        nums.add(83);

        Comparator<Integer> comparator = (Comparator<Integer>) (Integer i, Integer j) -> {
            if (i%10 > j%10)
                return 1;
            else
                return -1;
        };

        Collections.sort(nums, comparator); //used TimSort algorithm
        System.out.println(nums);

        List<Student> students = new ArrayList<>();
        students.add(new Student("Pasan", 25));
        students.add(new Student("Thehassa", 22));
        students.add(new Student("Hansi", 21));

        Comparator<Student> comStud = (s1, s2) -> s1.age > s2.age?1:-1;

        Collections.sort(students, comStud);
        System.out.println(students);

        List<StudentWithComparable> students2 = new ArrayList<>();
        students2.add(new StudentWithComparable("Pasan", 25));
        students2.add(new StudentWithComparable("Thehassa", 22));
        students2.add(new StudentWithComparable("Hansi", 21));

        Collections.sort(students2);
        System.out.println(students2);
    }
}

class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("name=").append(name);
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

}

class StudentWithComparable implements Comparable<StudentWithComparable>{
    
    String name;
    int age;

    public StudentWithComparable(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(StudentWithComparable that) {
        if(this.age > that.age)
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StudentWithComparable{");
        sb.append("name=").append(name);
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

}