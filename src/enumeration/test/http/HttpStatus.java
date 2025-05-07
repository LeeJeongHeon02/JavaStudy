package enumeration.test.http;

public enum HttpStatus {
    OK(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SEVER_ERROR(500, "Internal Sever Error");

    private int code;
    private String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static HttpStatus findByCode(int code) {
        for (HttpStatus httpStatus : values()) {
            if (httpStatus.code == code) {
                return httpStatus;
            }
        }
        return null;
    }

    public boolean isSuccess() {
        return 200 <= code && code < 300;
    }
}
