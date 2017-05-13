package com.ateam.funshoppers.injection.module;

import com.ateam.funshoppers.data.DataManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationModule_ProvideDataManagerFactory implements Factory<DataManager> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideDataManagerFactory(ApplicationModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public DataManager get() {
    return Preconditions.checkNotNull(
        module.provideDataManager(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<DataManager> create(ApplicationModule module) {
    return new ApplicationModule_ProvideDataManagerFactory(module);
  }
}
