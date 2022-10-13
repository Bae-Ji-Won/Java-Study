package Date10_12.domain;

public class Hospital {
    private String id;
    private String address; //주소
    private String district; //구
    private String category; //카테고리
    private String name; //병원명
    private String subDivision; //세부분과
    private int emergencyRoom; //응급 운영 현황

    public Hospital(String id, String address) {
        this.id = id;
        this.address = address;
    }

    public Hospital(String id){
        this.id = id;
      // this.id = id.replaceAll("\"","");       파일에서 가져온 데이터는 "정보"가 되어 있으므로 ""를 제거해 준다.
    }

    public Hospital(String id, String address, String category, int emergencyRoom,
                    String name, String subDivision){
        this.id = id;
        this.address = address;
        this.category = category;
        this.name = name;
        this.emergencyRoom = emergencyRoom;
        this.subDivision = subDivision;
        this.setDistrict();
    }

    public String getId() {
        return id.replace("\"", "");
    }

    public String getAddress() {
        return address;
    }

    public String getDistrict() {
        return district;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public String getSubDivision() {
        return subDivision;
    }

    public int getEmergencyRoom() {
        return emergencyRoom;
    }


    public void setDistrict() {
        String[] address = this.address.split(" ");
        this.district = address[0] + " " + address[1];
    }

    @Override
    public String toString() {
        return "\"" + this.id + "\"" + "," + "\"" + this.address + "\"" + "," + "\""
                + this.district + "\"" + "," + "\"" + this.category + "\"" + "," + this.emergencyRoom + "," + "\"" +
                this.name + "\"" + "," + this.subDivision;
    }

}