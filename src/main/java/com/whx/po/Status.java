package com.whx.po;

/**
 * @author o浩Y旭o
 * @create 2019-11-21-14:23
 */
public class Status {
    private  int   status_id;
    private  String   status_name;

    public Status() {
    }
    @Override
    public String toString() {
        return "Status{" +
                "status_id=" + status_id +
                ", status_name='" + status_name + '\'' +
                '}';
    }

    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }

    public String getStatus_name() {
        return status_name;
    }

    public void setStatus_name(String status_name) {
        this.status_name = status_name;
    }

    public Status(int status_id, String status_name) {
        this.status_id = status_id;
        this.status_name = status_name;
    }
}
