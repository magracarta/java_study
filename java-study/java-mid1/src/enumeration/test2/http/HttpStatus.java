package enumeration.test2.http;

public enum HttpStatus {
    //코드 작성
    OK(200,"OK"),
    BAD_REQUEST(400,"Bad Request"),
    NOT_FOUND(404,"Not Found"),
    INTERNAL_SERVER_ERROR(500,"Internal Server Error"),
    ;

    private int code;
    private String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static HttpStatus findByCode(int status) {
        HttpStatus[] values = HttpStatus.values();
        for (HttpStatus value : values) {
            if (value.getCode() == status) {
                return value;
            }
        }
        return null;
    }

    public boolean isSuccess() {
        return code >= 200 && code < 299;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
