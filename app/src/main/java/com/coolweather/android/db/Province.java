package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by ilpan on 2017/2/4.
 */

public class Province extends DataSupport {

    private int id;                 // 每个实体类都该有的代号

    private String provinceName;    // 记录省的名字

    private String provinceCode;    // 记录省的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}
