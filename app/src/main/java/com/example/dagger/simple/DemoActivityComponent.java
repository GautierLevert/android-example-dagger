package com.example.dagger.simple;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent
public interface DemoActivityComponent extends AndroidInjector<DemoActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DemoActivity> {
    }
}
