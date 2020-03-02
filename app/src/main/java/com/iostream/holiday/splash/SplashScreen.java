package com.iostream.holiday.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.iostream.holiday.R;
import com.iostream.holiday.utils.NavigationUtils;

public class SplashScreen extends AppCompatActivity implements SplashMVPView.View {

    SplashPresenter mSplashPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSplashPresenter=new SplashPresenter(this,this,3000);
        mSplashPresenter.startSplash();
    }

    @Override
    public void navigationActivityBasedSession(boolean loginStatus) {

        NavigationUtils.navigateToLogin(this);

    }
}
