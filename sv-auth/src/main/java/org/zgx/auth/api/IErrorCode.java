package org.zgx.auth.api;

/**
 * 封装API的错误码
 *
 * @author A80027
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
