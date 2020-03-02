package com.iostream.holiday.utils;

import android.app.Activity;
import android.content.Intent;

import com.iostream.holiday.home.HomeScreen;
import com.iostream.holiday.login.ui.login.LoginActivity;


public class NavigationUtils {



    public static void navigateToLogin(Activity context) {
        final Intent intent = new Intent(context, LoginActivity.class);

        context.startActivity(intent);
        context.finish();
    }

    public static void navigateToHome(Activity context) {
        final Intent intent = new Intent(context, HomeScreen.class);

        context.startActivity(intent);
        context.finish();
    }


}
