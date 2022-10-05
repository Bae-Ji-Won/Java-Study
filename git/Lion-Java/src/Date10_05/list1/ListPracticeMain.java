package Date10_05.list1;

import java.util.List;

public class ListPracticeMain {
    public static void main(String[] args) {
        LikeLion2th li = new LikeLion2th();
        List<String> students = li.getStudentList();

        for(String student : students) {
            System.out.println(student);
        }
    }
}
