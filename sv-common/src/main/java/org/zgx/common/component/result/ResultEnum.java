package org.zgx.common.component.result;

/**
 * 返回状态码枚举类
 *
 * @author zgx
 * @date 2021/03/26
 */
public enum ResultEnum {
    SUCCESS(200),
    FAIL(500),
    NOT_FOUND(404);

    public int code;

    private ResultEnum(int code) {
        this.code = code;
    }

    public int getResultEnum() {
        return this.code;
    }
}
