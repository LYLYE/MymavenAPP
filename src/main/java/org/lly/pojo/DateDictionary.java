package org.lly.pojo;

import lombok.Data;

@Data
public class DateDictionary {
    private int id;//主键ID
    private String typeCode;//类型编码
    private String typeName;//类型名称
    private int valueId;//类型值ID
    private String valueName;//类型值Name
    private int createdBy;//创建者（来源于backend_user用户表的用户id）
    private String creationDate;//创建时间
    private int modifyBy;//更新者（来源于backend_user用户表的用户id）
    private String modifyDate;//最新更新时间

    public DateDictionary() {
    }

    public DateDictionary(int id, String typeCode, String typeName, int valueId, String valueName, int createdBy, String creationDate, int modifyBy, String modifyDate) {
        this.id = id;
        this.typeCode = typeCode;
        this.typeName = typeName;
        this.valueId = valueId;
        this.valueName = valueName;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.modifyBy = modifyBy;
        this.modifyDate = modifyDate;
    }
}
