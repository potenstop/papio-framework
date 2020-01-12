package top.potens.core.exception;

/**
 * 功能描述: 分布式锁异常
 *
 * @author yanshaowen
 * @className LockException
 * @projectName web-api
 * @date 2019/8/24 11:02
 */

public class LockException extends RuntimeException {

    public LockException() {
    }

    public LockException(String message) {
        super(message);
    }

    public LockException(String message, Throwable cause) {
        super(message, cause);
    }

    public LockException(Throwable cause) {
        super(cause);
    }

    public LockException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}