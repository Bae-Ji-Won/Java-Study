package Algorithm;

import java.util.ArrayList;
import java.util.List;

// 해시 충돌 했을경우 해결법
public class HashSolution {

    // 멤버변수
    private int size;
    private List<Node>[] table;     // 2차원 배열 리스트
    // ex) 2차원 배열 리스트에 Node형식으로 저장함
    //       1           2          3
    //   ["aa",1]    ["aaa",2]
    //   ["bb",2]
    
    // 내부 클래스 선언
    class Node {        // Node DTO [(String)key,(Integer)value] 형식
        private String key;
        private Integer value;

        public Node(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public Integer getValue() {
            return value;
        }
    }


    // 디폴트 생성자
    public HashSolution() {     // 생성자
        this.size = 10000;
        this.table = new ArrayList[size];
    }
    
    // 생성자 오버로딩
    public HashSolution(int size) {     // 생성자
        this.size = size;
        this.table = new ArrayList[size];   // 2차원 배열 사이즈 선언
    }

    public int hash(String str) {       // hash를 통해 임의의 숫자 구함
        int ascii = 0;
        for (int i = 0; i < str.length(); i++) {
            ascii += str.charAt(i);
        }
        return ascii % size; // 1000개   0~999까지의 값 출력
    }

    public Integer get(String key) {        // 해시 값 찾기
        List<Node> nodes = this.table[hash(key)];   // 2차원 배열 리스트중 hash(key)에 해당하는 배열 가져옴
        // ex) 2차원 배열 리스트의 해당 값을 가져옴 만약 1번일때
        //       1           2          3
        //   ["aa",1]    ["aaa",2]
        //   ["bb",2]
        
        // nodes => ["aa",1],["bb',2] 가져옴
        for (Node node : nodes) {       // 2번 반복
            if (key.equals(node.getKey())) {    // 입력한 키와 찾아온 키를 비교함
        // ex) 입력된 키가 "bb"일때
        // 1번째 순서일때는 못찾고 2번째 순서일떄 찾는것으로
        // 2번째 node = {"bb",2}  , node.getkey() = "bb"
        // bb.equals(bb) true
                return node.value;      // 2번쨰 노드의 객체의 값인 2를 가져옴
            }
        }

        return null;
    }

    public void insert(String key, Integer value) {
        int hashCode = hash(key);       // 입력한 문자를 가지고 해시를 통해 임의의 key값 출력
        if (this.table[hashCode] == null) {     // 만약 2차원 배열 리스트에 없는 값이라면
            this.table[hashCode] = new ArrayList<>();   // 2차원 배열 리스트 생성
        }
        this.table[hashCode].add(new Node(key,value));  // 해당 해쉬 자리에 key,value 객체 저장
    }

    public static void main(String[] args) {
        String[] names = new String[]{"DongyeonKang",
                "SubinKang", "KwanwunKo", "HyunseokKo", "KyoungdukKoo", "YeonjiGu", "SoyeonKown", "OhsukKwon", "GunwooKim", "KiheonKim", "NayeongKim", "DohyeonKim", "MinkyoungKim", "MinjiKim", "SanghoKim", "SolbaeKim", "YejinKim", "EungjunKim", "JaegeunKim", "JeonghyeonKim", "JunhoKim", "JisuKim", "kimjinah", "HaneulKim", "HeejungKim", "KimoonPark", "EunbinPark", "JeongHoonPark", "JeminPark", "TaegeunPark", "JiwonBae", "SeunggeunBaek", "JihwanByeon", "HeungseopByeon", "JeongHeeSeo", "TaegeonSeo", "SeeYunSeok", "SuyeonSeong", "SeyoelSon", "MinjiSong", "JinwooSong", "hyunboSim", "SominAhn", "JiyoungAhn", "ChangbumAn", "SoonminEom",
                "HyeongsangOh", "SuinWoo", "JuwanWoo", "InkyuYoon", "GahyunLee", "DaonLee", "DohyunLee", "SanghunLee", "SujinLee", "AjinLee", "YeonJae", "HyeonjuLee", "HakjunYim", "SeoyunJang", "SeohyeonJang", "JinseonJang", "SujinJeon", "SeunghwanJeon", "DaehwanJung", "JaeHyunJeung", "HeejunJeong", "GukhyeonCho", "MunjuJo", "YejiJo", "ChanminJu", "MinjunChoi", "SujeongChoi", "SeunghoChoi", "AyeongChoi", "GeonjooHan", "JinhyuckHeo", "MinwooHwang", "SieunHwang",
                "JunhaHwang"};


        HashSolution hashSolution = new HashSolution(200);
        hashSolution.insert("Yoonseo", 1);
        hashSolution.insert("Seoyoon", 2);

        int result = hashSolution.get("Yoonseo");
        if (result == 1) {
            System.out.println("테스트 성공");
        } else {
            System.out.printf("테스트 실패 value:%d", result);
        }

        result = hashSolution.get("Seoyoon");
        if (result == 2) {
            System.out.println("테스트 성공");
        } else {
            System.out.printf("테스트 실패 value:%d", result);
        }
    }
}