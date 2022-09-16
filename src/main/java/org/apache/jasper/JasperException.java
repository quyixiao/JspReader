package org.apache.jasper;

public class JasperException extends ServletException {

    private static final long serialVersionUID = 1L;

    public JasperException(String reason) {
        super(reason);
    }

    /**
     * Creates a JasperException with the embedded exception and the reason for
     * throwing a JasperException
     */
    public JasperException (String reason, Throwable exception) {
        super(reason, exception);
    }

    /**
     * Creates a JasperException with the embedded exception
     */
    public JasperException (Throwable exception) {
        super(exception);
    }
}
