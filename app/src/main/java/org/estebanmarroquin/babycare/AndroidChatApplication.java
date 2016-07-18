package org.estebanmarroquin.babycare;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by pc on 16/06/2016.
 */
public class AndroidChatApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        setupFirebase();
    }

    private void setupFirebase(){
        Firebase.setAndroidContext(this);
        Firebase.getDefaultConfig().setPersistenceEnabled(true);
    }
}