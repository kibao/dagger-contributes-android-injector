package pl.kibao.contributesandroidinjector;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(
    subcomponents =
        ContributesAndroidInjectorModule_ContributeMainActivityInjector.MainActivitySubcomponent.class
)
public abstract class ContributesAndroidInjectorModule_ContributeMainActivityInjector {
    private ContributesAndroidInjectorModule_ContributeMainActivityInjector() {}

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
        MainActivitySubcomponent.Builder builder);

    @Subcomponent(modules = MainModule.class)
    public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
        @Subcomponent.Builder
        abstract class Builder extends AndroidInjector.Builder<MainActivity> {}
    }
}
