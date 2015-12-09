package fr.vavelin.EntManager.Entity;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

import fr.vavelin.EntManager.Entity.Login;

/**
 * Created by kvavelin on 04/12/2015.
 */
public final class LoginForm {
    private static final String EMAIL_FIELD = "email";
    private static final String PASSWORD_FIELD = "password";

    private Map<String, String> errors = new HashMap<String, String>();

    public Map<String, String> getErrors() {
        return errors;
    }

    public Login logIn(HttpServletRequest request) {
        Login login = new Login();

        return login;
    }
}
