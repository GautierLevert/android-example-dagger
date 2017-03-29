package com.example.dagger.simple;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = {AndroidInjectionModule.class, ApplicationModule.class, DemoActivityModule.class})
public interface ApplicationComponent {

    void inject(DemoApplication application);
}
