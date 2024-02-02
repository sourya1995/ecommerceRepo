package com.sourya.ecommerce.exceptions;

public enum ErrorCode {
    GENERIC_ERROR("SOURYA-0001", "The System is unable to complete the request. Contact the support team."),
    HTTP_MEDIATYPE_NOT_SUPPORTED("SOURYA-0002", "Requested Media Type is not supported. Please use application/json or application/xml as 'Content-Type' header value."),
    HTTP_MESSAGE_NOT_WRITABLE("SOURYA-0003", "Missing 'Accept' header, Please add 'accept' header."),
    HTTP_MEDIA_TYPE_NOT_ACCEPTABLE("SOURYA-0004", "Requested 'Accept' header value is not supported. Please use application/json or application/xml as 'Accept' value."),
    JSON_PARSE_ERROR("SOURYA-0005", "Make sure payload is a valid JSON object."),
    HTTP_MESSAGE_NOT_READABLE("SOURYA-0006", "Make sure request payload should be a valid JSON or XML object according to 'Content-Type'.");

    private String errCode;
    private String errMsgKey;

    ErrorCode(final String errCode, final String errMsgKey) {
        this.errCode = errCode;
        this.errMsgKey = errMsgKey;
    }

    public String getErrCode() {
        return errCode;
    }

    public String getErrMsgKey() {
        return errMsgKey;
    }

}
