package com.baiteng.entity;

import java.util.List;

/**
 * Created by Admin on 2017/6/22.
 */
public class JSONData {
    private int page;
    private int total;
    private int records;
    private List<JSONItem> rows;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getRecords() {
        return records;
    }

    public void setRecords(int records) {
        this.records = records;
    }

    public List<JSONItem> getRows() {
        return rows;
    }

    public void setRows(List<JSONItem> rows) {
        this.rows = rows;
    }
}
