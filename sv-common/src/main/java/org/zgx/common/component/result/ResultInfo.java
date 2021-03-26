package org.zgx.common.component.result;

import java.io.Serializable;

/**
 * 返回信息类
 *
 * @author zgx
 * @date 2021/03/26
 */
public class ResultInfo<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private int code;
    private String msg;
    private T data;

    public ResultInfo() {
    }

    public ResultInfo(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResultInfo{code=").append(this.code).append(",msg=").append(this.msg).append(",data=").append(this.data).append("}");
        return sb.toString();
    }

    public void setCode(ResultEnum resultEnum) {
        this.code = resultEnum.code;
    }
}
