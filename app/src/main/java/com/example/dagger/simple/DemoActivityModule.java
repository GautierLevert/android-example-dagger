package com.example.dagger.simple;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = DemoActivityComponent.class)
public abstract class DemoActivityModule {
    @Binds
    @IntoMap
    @ActivityKey(DemoActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindDemoActivityInjectorFactory(DemoActivityComponent.Builder builder);
}
