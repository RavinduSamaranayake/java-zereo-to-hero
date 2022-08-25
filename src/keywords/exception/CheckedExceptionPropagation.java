package keywords.exception;

import java.io.IOException;

/**
 * @author Ravindu
 * 8/4/2022
 */
class CheckedExceptionPropagation {

    // exception propagated to n()
    void m() throws IOException {
        // checked exception occurred
        throw new IOException("device error");
    }

    // exception propagated to p()
    void n() throws IOException {
        m();
    }

    void p() {
        try {

            // exception handled
            n();
        } catch (Exception e) {
            System.out.println("exception handled. " + e);
        }
    }

    public static void main(String[] args) {
        CheckedExceptionPropagation obj = new CheckedExceptionPropagation();
        obj.p();
        System.out.println("normal flow...");
    }
}

