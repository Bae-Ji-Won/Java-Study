package Date10_12.domain;

public class Hospital {
    private String id;      // [0]
    private String address; //주소  [1]
    private String district; //구  [1]수정
    private String category; //카테고리  [2]
    private String name; //병원명  [10]
    private String subDivision; //세부분과  [10] 수정
    private int emergencyRoom; //응급 운영 현황    [6]

    public Hospital(String id, String address, String category, String name, String subDivision, int emergencyRoom) {
        this.id = id;
        this.address = address;
        this.category = category;
        this.name = name;
        this.subDivision = subDivision;
        this.emergencyRoom = emergencyRoom;
    }

    public Hospital(String id, String address) {
        this.id = id;
        this.address = address;
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