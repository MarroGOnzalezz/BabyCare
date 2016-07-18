package org.estebanmarroquin.babycare.login;

import org.estebanmarroquin.babycare.login.events.LoginEvent;

/**
 * Created by pc on 17/06/2016.
 */
public interface LoginPresenter {
    void onCreate();
    void onDestroy();
    void checkForAuthenticatedUser();
    void onEventMainThread(LoginEvent event);
    void validateLogin(String email, String password);
    void registerNewUser(String email, String password);
    //void onEventMainThread(LoginEvent event);
}
