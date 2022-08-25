package keywords.exception;

import java.io.IOException;

/**
 * @author Ravindu
 * 8/4/2022
 */
class UnCheckedExceptionPropagation {

    // exception propagated to n()
    void m()  {
        // unchecked exception occurred
        throw new RuntimeException("device error");
    }

    // exception propagated to p()
    void n()  {
        m();
    }

    void p() {
        try {

            // exception handled
            n();
        } catch (Exception e) {
            System.out.println("exception handled. " + e);
        }
       // n();
    }

    public static void main(String[] args) {
        UnCheckedExceptionPropagation obj = new UnCheckedExceptionPropagation();
        obj.p();
        System.out.println("normal flow...");
    }

}

