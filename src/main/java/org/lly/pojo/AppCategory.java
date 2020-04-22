package org.lly.pojo;

import lombok.Data;

//应用程序类别类
@Data
public class AppCategory {
    private int id;//主键ID
    private String categoryCode;//分类编码
    private String categoryName;//分类名称
    private int parentId;//父级节点id
    private int createdBy;//创建者（来源于backend_user用户表的用户id）
    private String creationTime;//创建时间
    private int modifyBy;//更新者（来源于backend_user用户表的用户id）
    private String modifyDate;//最新更新时间

    public AppCategory() {
    }

    public AppCategory(int id, String categoryCode, String categoryName, int parentId, int createdBy, String creationTime, int modifyBy, String modifyDate) {
        this.id = id;
        this.categoryCode = categoryCode;
        this.categoryName = categoryName;
        this.parentId = parentId;
        this.createdBy = createdBy;
        this.creationTime = creationTime;
        this.modifyBy = modifyBy;
        this.modifyDate = modifyDate;
    }
}
