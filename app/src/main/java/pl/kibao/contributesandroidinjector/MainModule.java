package pl.kibao.contributesandroidinjector;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {
    @Provides
    public String providesUsername() {
        return "john.doe";
    }
}
