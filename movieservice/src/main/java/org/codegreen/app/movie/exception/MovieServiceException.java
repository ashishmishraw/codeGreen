package org.codegreen.app.movie.exception;

/**
 * Created by mishra.ashish@icloud.
 *
 * If you extend RuntimeException , you don't need to declare it in the throws clause (i.e. it's an unchecked exception)
 *
 */
public class MovieServiceException extends RuntimeException {

    private static final long serialVersionUID =  981327537389931790L;

    private final String fieldName;

    public MovieServiceException(final String fieldName, final String message) {
        super(message);
        this.fieldName = fieldName;
    }

    public String getFieldName() {
        return fieldName;
    }

    @Override
    public String toString() {
        return "MovieServiceException [fieldName=" + fieldName + "]";
    }
}
