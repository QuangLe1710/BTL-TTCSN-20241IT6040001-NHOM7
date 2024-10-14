package com.example.ProjectLaptopStore.Entity.Enum;

import java.util.HashMap;
import java.util.Map;

public enum ProDescription_FindByUserDemand_Enum {
    GAMING_DOHOA("Gaming-Đồ họa"), //card nvidia
    SINHVIEN_VANPHONG("Sinh viên-Văn Phòng"), //giá <30tr
    MONGNHE("Mỏng nhẹ"), //dưới 1.5kg
    DOANHNHAN("Doanh nhân"); //dưới 2cm hoặc 20mm

    private String typeDemand;

    ProDescription_FindByUserDemand_Enum(String typeDemand) {
        this.typeDemand = typeDemand;
    }

    public String getTypeDemand() {
        return typeDemand;
    }

    public static Map<String,String> typeUserDemand(){
        Map<String,String> typeDemandMap = new HashMap<>();
        for(ProDescription_FindByUserDemand_Enum item : ProDescription_FindByUserDemand_Enum.values()){
            typeDemandMap.put(item.toString(),item.getTypeDemand());
        }
        return typeDemandMap;
    }

}
