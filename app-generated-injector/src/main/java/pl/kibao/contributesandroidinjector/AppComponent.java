package pl.kibao.contributesandroidinjector;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(
    modules = {
        AndroidSupportInjectionModule.class,
        ContributesAndroidInjectorModule_ContributeMainActivityInjector.class,
    }
)
interface AppComponent extends AndroidInjector<App> {
}
