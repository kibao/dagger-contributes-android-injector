[![Build Status](https://travis-ci.org/kibao/dagger-contributes-android-injector.svg?branch=master)](https://travis-ci.org/kibao/dagger-contributes-android-injector)

During building `app` module, the following error is thrown:

    :app:compileDebugJavaWithJavac
    /app/build/generated/source/apt/debug/pl/kibao/contributesandroidinjector/ContributesAndroidInjectorModule_ContributeMainActivityInjector.java:21: error: @dagger.android.ActivityKey methods should bind dagger.android.AndroidInjector.Factory<? extends android.app.Activity>, not dagger.android.AndroidInjector.Factory<? extends android.app.Activity>. See https://google.github.io/dagger/android
      abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
                                                           ^
    1 error

Whereas almost the same `app-generated-injector` modules works fine.
The only difference is that, it uses generated `ContributesAndroidInjectorModule_ContributeMainActivityInjector`
class instead of `ContributesAndroidInjectorModule` with annotated method.
