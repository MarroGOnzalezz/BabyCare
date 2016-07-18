package org.estebanmarroquin.babycare.login;

/**
 * Created by pc on 17/06/2016.
 */
public interface LoginRespository {
    //void signUp(final String email, final String password);
    void signUp(String email, String password);
    void signIn(String email, String password);
    void checkSession();
    //void checkAlreadyAuthenticated();
}
