package Date10_12.domain;

import java.util.HashMap;
import java.util.Map;

public class Hospital {
    private String id;      // [0]
    private String address; //주소  [1]
    private String district; //구  [1]수정
    private String category; //카테고리  [2]
    private String name; //병원명  [10]
    private String subDivision; //세부분과  [10] 수정
    private int emergencyRoom; //응급 운영 현황    [6]

    public Hospital(String id, String address, String category, int emergencyRoom,
                    String name){
        this.id = id;
        this.address = address;
        this.category = category;
        this.name = name;
        this.emergencyRoom = emergencyRoom;
        this.subDivision = subDivision;
        this.setDistrict();
        this.setCategory();
    }

    public String getId() {
        return id.replace("\"", "");
    }

    public String getAddress() {
        return address;
    }


    public void setDistrict() {
        String[] address = this.address.split(" ");
        this.district = address[0] + " " + address[1];
    }

    public String getDistrict() {
        return district;
    }

    public void setCategory() {      // 맵핑
        Map<String,String> categorytmap = new HashMap<>();
        categorytmap.put("A","종합병원");
        categorytmap.put("B","병원");
        categorytmap.put("C","의원");
        categorytmap.put("D","요양병원");
        categorytmap.put("E","한방병원");
        categorytmap.put("G","한의원");
        categorytmap.put("I","기타");
        categorytmap.put("M","치과병원");
        categorytmap.put("N","치과의원");
        categorytmap.put("R","보건소");
        categorytmap.put("W","기타(구급차)");

        category = categorytmap.get(category);
    }

    public String getCategory() {
        return category;
    }

    public String setEmergencyRoom() {
        if(emergencyRoom == 1){
            return "운영중";
        }else
            return "운영안함";
    }

    public String getEmergencyRoom() {
        return setEmergencyRoom();
    }

    public String getName() {
        return name;
    }

    public String getSubDivision() {
        return subDivision;
    }





    @Override
    public String toString() {
        return "\"" + this.id + "\"" + "," + "\"" + this.address + "\"" + "," + "\""
                + this.district + "\"" + "," + "\"" + this.category + "\"" + "," + this.emergencyRoom + "," + "\"" +
                this.name + "\"" + "," + this.subDivision;
    }

}