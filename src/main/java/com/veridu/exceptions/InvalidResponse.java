package com.veridu.exceptions;

/**
 * Class InvalidResponse
 */
public class InvalidResponse extends SDKException {

    public InvalidResponse() {
        super("Invalid Response");
    }

    /**
     * Throws InvalidResponse Exception with message
     *
     * @param msg
     *            String
     */
    public InvalidResponse(String msg) {
        super(msg);
    }
}
