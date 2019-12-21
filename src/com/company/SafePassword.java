package com.company;

public class SafePassword {
    private static SafePassword safePassword;
    private String password;

    /**
     * Create constructor.
     */
    private SafePassword() {
        password = "154df4gg1";
    }

    /**
     * @return Instance of SafePassword class
     */
    public static SafePassword getInstance() {
        if (safePassword == null) {
            safePassword = new SafePassword();
        }
        return safePassword;
    }

    /**
     * @return password.
     */
    public String getPassword() {
        return password;
    }
}
