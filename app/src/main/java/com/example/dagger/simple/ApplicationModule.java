package com.example.dagger.simple;

import android.content.Context;
import android.location.LocationManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private final DemoApplication application;

    public ApplicationModule(DemoApplication application) {
        this.application = application;
    }

    @Provides
    Context context() {
        return application;
    }

    @Provides
    LocationManager locationManager(Context context) {
        return (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
    }
}
