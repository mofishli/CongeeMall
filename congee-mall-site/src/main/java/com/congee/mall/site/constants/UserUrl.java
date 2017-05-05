package com.congee.mall.site.constants;

/**
 * Created by zhouli on 17/4/30.
 */
public class UserUrl {

    public static final String BUSINESS_CORE="User";
    public static final String OUT_PATH='/'+BUSINESS_CORE;

    public static final String LOGIN="/login";

    /**产品列表**/
    public static final String CATEGORY_PRODUCT_LIST_CORE="/productlist";
    /**新增产品加入产品列表**/
    public static final String INSERT_PRODUCT_LIST=CATEGORY_PRODUCT_LIST_CORE+"/insert";
    /**根据产品ID删除产品**/
    public static final String DELETE_PRODUCT_LIST=CATEGORY_PRODUCT_LIST_CORE+"/delete";
    /**根据产品ID更新产品**/
    public static final String UPDATE_PRODUCT_LIST=CATEGORY_PRODUCT_LIST_CORE+"/update";
    /**根据产品ID搜索产品**/
    public static final String SELECT_PRODUCT_LIST=CATEGORY_PRODUCT_LIST_CORE+"/select";

}
