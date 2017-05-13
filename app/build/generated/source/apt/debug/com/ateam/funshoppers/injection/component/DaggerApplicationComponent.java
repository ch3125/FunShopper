package com.ateam.funshoppers.injection.component;

import android.app.Application;
import com.ateam.funshoppers.action.ActionExecutor;
import com.ateam.funshoppers.data.DataManager;
import com.ateam.funshoppers.injection.module.ApplicationModule;
import com.ateam.funshoppers.injection.module.ApplicationModule_ProvideActionExecutorFactory;
import com.ateam.funshoppers.injection.module.ApplicationModule_ProvideApplicationFactory;
import com.ateam.funshoppers.injection.module.ApplicationModule_ProvideBeaconManagerFactory;
import com.ateam.funshoppers.injection.module.ApplicationModule_ProvideDataManagerFactory;
import dagger.internal.Preconditions;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.altbeacon.beacon.BeaconManager;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerApplicationComponent implements ApplicationComponent {
  private Provider<Application> provideApplicationProvider;

  private Provider<DataManager> provideDataManagerProvider;

  private Provider<BeaconManager> provideBeaconManagerProvider;

  private Provider<ActionExecutor> provideActionExecutorProvider;

  private DaggerApplicationComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideApplicationProvider =
        ScopedProvider.create(
            ApplicationModule_ProvideApplicationFactory.create(builder.applicationModule));

    this.provideDataManagerProvider =
        ScopedProvider.create(
            ApplicationModule_ProvideDataManagerFactory.create(builder.applicationModule));

    this.provideBeaconManagerProvider =
        ScopedProvider.create(
            ApplicationModule_ProvideBeaconManagerFactory.create(builder.applicationModule));

    this.provideActionExecutorProvider =
        ScopedProvider.create(
            ApplicationModule_ProvideActionExecutorFactory.create(builder.applicationModule));
  }

  @Override
  public Application application() {
    return provideApplicationProvider.get();
  }

  @Override
  public DataManager dataManager() {
    return provideDataManagerProvider.get();
  }

  @Override
  public BeaconManager beaconManager() {
    return provideBeaconManagerProvider.get();
  }

  @Override
  public ActionExecutor actionExecutor() {
    return provideActionExecutorProvider.get();
  }

  public static final class Builder {
    private ApplicationModule applicationModule;

    private Builder() {}

    public ApplicationComponent build() {
      if (applicationModule == null) {
        throw new IllegalStateException(
            ApplicationModule.class.getCanonicalName() + " must be set");
      }
      return new DaggerApplicationComponent(this);
    }

    public Builder applicationModule(ApplicationModule applicationModule) {
      this.applicationModule = Preconditions.checkNotNull(applicationModule);
      return this;
    }
  }
}
