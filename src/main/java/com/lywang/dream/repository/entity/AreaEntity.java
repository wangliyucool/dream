package com.lywang.dream.repository.entity;

import java.util.Date;

public class AreaEntity {
    // 主键标识
    private  Integer id ;
    // 名称
    private String name;
    // 优先级
    private Integer priority;
    // 创建时间
    private Date createTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


}
