package com.congee.mall.constants;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by zhouli on 17/5/5.
 */

public interface BaseCode {
    final int START_CODE=200;

    int getCode();
    String getMsg();
    boolean getSuccess();
}
