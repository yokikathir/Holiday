package com.iostream.holiday.splash;

public interface SplashMVPView {
    interface View{

        void navigationActivityBasedSession(boolean loginStatus);

    }

    interface presenter
    {
        void startSplash();

    }
}
