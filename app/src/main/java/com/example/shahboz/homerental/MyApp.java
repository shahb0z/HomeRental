package com.example.shahboz.homerental;

import android.app.Application;

import com.example.shahboz.homerental.data.Apartment;
import com.example.shahboz.homerental.data.MyUser;
import com.parse.Parse;
import com.parse.ParseObject;


/**
 * Created by shahboz on 14/06/2015.
 */
public class MyApp extends Application {
    public static final String USER_TYPE = "user_type";
    public static final String STUDENT = "student";
    public static final String ADVERTISER = "advertiser";

    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Apartment.class);
        ParseObject.registerSubclass(MyUser.class);
        Parse.initialize(this, "m84iKmdiWUhNxgyd7s3UJvMF9TxQipnyyX8SAWEA", "ut2vmoFZGCSwJjV9774bxCanmmC50agiQPi6809K");
    }
}