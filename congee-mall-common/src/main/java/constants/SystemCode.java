package constants;


/**
 * Created by zhouli on 17/5/5.
 */
public enum  SystemCode  implements BaseCode {

    /**
     * 请求成功
     */
    ok(START_CODE,"success"),
    /**
     * 入参错误
     */
    params(START_CODE+1,"params error"),
    /**
     * 用户没有权限
     */
    noPermission(START_CODE+2,"no permission"),
    /**
     * 接口不存在
     */
    interNotExist(START_CODE+3,"inter not exist"),
    /**
     * 签名异常
     */
    signError(START_CODE+4,"sign error"),
    /**
     * 未知异常
     */
    unknownError(START_CODE+5,"unknown error");


    private int code;
    private String msg;
    private boolean success;


    private SystemCode(int code, String msg){
        setCode(code);
        setMsg(msg);
        if(code==START_CODE){
           setSuccess(true);
        }else {
           setSuccess(false);
        }
    }

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public boolean getSuccess() {
        return this.success;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
