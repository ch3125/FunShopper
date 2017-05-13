package com.ateam.funshoppers.injection.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.altbeacon.beacon.BeaconManager;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationModule_ProvideBeaconManagerFactory implements Factory<BeaconManager> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideBeaconManagerFactory(ApplicationModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BeaconManager get() {
    return Preconditions.checkNotNull(
        module.provideBeaconManager(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BeaconManager> create(ApplicationModule module) {
    return new ApplicationModule_ProvideBeaconManagerFactory(module);
  }
}
