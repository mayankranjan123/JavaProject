package GFGInterviewSeries;

import java.util.*;

public class ComparatorImpl {
    static class Student {
        int marks;
        String name;
        static int id;

        static {
            id = 2;
        }
        public Student(int marks, String name) {
            this.marks = marks;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "marks=" + marks +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(6);
        set.add(4);

        Map<Integer, Integer> map = new HashMap<>();
        map.put(null, 8);
        System.out.println(map.get(null));
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(90, "Mayank"));
        studentList.add(new Student(92, "Yash"));
        studentList.add(new Student(92, "Ranjan"));
        System.out.println("Before sorting: " + studentList);
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int cmp = 0;
                if (o1.marks < o2.marks)
                    cmp = 1;
                else if (o1.marks > o2.marks)
                    cmp = -1;
                else {
                    if (o1.name.compareTo(o2.name) > 1)
                        cmp = 1;
                    else if (o1.name.compareTo(o2.name) < 1)
                        cmp = -1;
                }
                return cmp;
            }
        });

        System.out.println("After sorting: " + studentList);
    }
}
