package pl.kibao.contributesandroidinjector;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ContributesAndroidInjectorModule {
    @ContributesAndroidInjector(modules = {MainModule.class})
    public abstract MainActivity contributeMainActivityInjector();
}
