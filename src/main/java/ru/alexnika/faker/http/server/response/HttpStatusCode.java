package ru.alexnika.faker.http.server.response;

public enum HttpStatusCode {

    CLIENT_ERROR_400_BAD_REQUEST(400, "Bad Request"),
    CLIENT_ERROR_404_NOT_FOUND(404, "Page Not Found"),
    CLIENT_ERROR_405_METHOD_NOT_ALLOWED(405, "Method Not Allowed"),
    CLIENT_ERROR_406_NOT_ACCEPTABLE(406, "Not Acceptable"),
    CLIENT_ERROR_414_URI_TOO_LONG(414, "URI Too Long"),

    SERVER_ERROR_500_INTERNAL_SERVER_ERROR(500, "Internal Server Error"),
    SERVER_ERROR_501_NOT_IMPLEMENTED(501, "Not Implemented"),
    SERVER_ERROR_505_HTTP_VERSION_NOT_SUPPORTED(505, "Http Version Not Supported");

    public final int STATUS_CODE;
    public final String MESSAGE;

    HttpStatusCode(int STATUS_CODE, String MESSAGE) {
        this.STATUS_CODE = STATUS_CODE;
        this.MESSAGE = MESSAGE;
    }
}
