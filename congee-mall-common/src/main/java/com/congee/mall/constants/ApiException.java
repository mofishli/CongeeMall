package com.congee.mall.constants;

/**
 * Created by zhouli on 17/5/5.
 */
public class ApiException extends Exception {
    private SystemCode systemCode;

    public ApiException(SystemCode systemCode){
        setSystemCode(systemCode);
    }

    public SystemCode getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(SystemCode systemCode) {
        this.systemCode = systemCode;
    }
}
