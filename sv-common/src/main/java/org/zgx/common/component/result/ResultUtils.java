package org.zgx.common.component.result;

/**
 * 返回信息工具类
 *
 * @author zgx
 * @date 2021/03/26
 */
public final class ResultUtils {
    private ResultUtils() {
    }

    public static <T> ResultInfo<T> success(final T data) {
        ResultInfo<T> resultInfo = new ResultInfo();
        resultInfo.setCode(ResultEnum.SUCCESS);
        resultInfo.setData(data);
        return resultInfo;
    }

    public static <T> ResultInfo<T> fail(final String msg) {
        ResultInfo<T> resultInfo = new ResultInfo();
        resultInfo.setCode(ResultEnum.FAIL);
        resultInfo.setMsg(msg);
        return resultInfo;
    }

    public static <T> ResultInfo<T> notFound(final String msg) {
        ResultInfo<T> resultInfo = new ResultInfo();
        resultInfo.setCode(ResultEnum.NOT_FOUND);
        resultInfo.setMsg(msg);
        return resultInfo;
    }

    public static <T> ResultInfo<T> define(final int code, final String msg, final T data) {
        ResultInfo<T> resultInfo = new ResultInfo();
        resultInfo.setCode(code);
        resultInfo.setMsg(msg);
        resultInfo.setData(data);
        return resultInfo;
    }
}

