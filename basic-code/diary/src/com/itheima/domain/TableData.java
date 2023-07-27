package com.itheima.domain;

import java.io.Serial;
import java.io.Serializable;

public class TableData implements Serializable {
    @Serial
    private static final long serialVersionUID = -7675731493945834840L;
    private Object[][] tabledatas;

    public TableData() {
    }

    public TableData(Object[][] tabledatas) {
        this.tabledatas = tabledatas;
    }

    /**
     * 获取
     * @return tabledatas
     */
    public Object[][] getTabledatas() {
        return tabledatas;
    }

    /**
     * 设置
     * @param tabledatas
     */
    public void setTabledatas(Object[][] tabledatas) {
        this.tabledatas = tabledatas;
    }

    public String toString() {
        return "TableData{tabledatas = " + tabledatas + "}";
    }
}
