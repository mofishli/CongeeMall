package com.congee.mall.pojo;

import java.util.List;

/**
 * Created by zhouli on 17/5/1.
 */
public class NavigatorBean {
    private int id;
    private String name;
    private boolean is_parent;
    private int parent_id;
    private boolean status;
    private String create_time;
    public boolean isIs_parent() {
        return is_parent;
    }

    public void setIs_parent(boolean is_parent) {
        this.is_parent = is_parent;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    private String update_time;
    public boolean isIsparent() {
        return is_parent;
    }

    public void setIsparent(boolean isparent) {
        this.is_parent = isparent;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setId(int id) {
        this.id = id;
    }
}
