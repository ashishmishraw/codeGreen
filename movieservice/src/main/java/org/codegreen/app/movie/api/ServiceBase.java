package org.codegreen.app.movie.api;

import org.codegreen.app.movie.exception.MovieServiceException;

import javax.ws.rs.core.Response;

/**
 * Created by mishra.ashish@icloud.com
 */
public class ServiceBase {

    /**
     * Error response
     *
     * @return {@link Response} response
     */
    public Response generateErrorResponse(final Throwable ex, Response.Status ERR_CODE, String errorMessage) {

        if (ex instanceof MovieServiceException) {
            ERR_CODE = Response.Status.BAD_REQUEST;
            errorMessage = ex.getMessage();
        }

        final Response.ResponseBuilder b =
                Response.status(ERR_CODE).entity(errorMessage);

        return b.build();
    }
}
