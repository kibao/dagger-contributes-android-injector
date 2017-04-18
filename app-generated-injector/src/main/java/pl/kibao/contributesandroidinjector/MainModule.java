package pl.kibao.contributesandroidinjector;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {
    @Provides
    public String providesUsername() {
        return "john.doe";
    }
}
