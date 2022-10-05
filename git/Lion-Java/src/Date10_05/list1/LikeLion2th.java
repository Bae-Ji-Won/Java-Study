package Date10_05.list1;

import java.util.ArrayList;
import java.util.List;

public class LikeLion2th {

    private List<String> students = new ArrayList<>();

    public LikeLion2th(){
        this.students.add("배지원");
        this.students.add("홍길동");
    }

    // 이름이 들어있는 list 반환
    public List<String> getStudentList(){
            return this.students;
    }
}
