package com.ateam.funshoppers.injection.module;

import com.ateam.funshoppers.data.StoreService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DataModule_ProvideStoreServiceFactory implements Factory<StoreService> {
  private final DataModule module;

  public DataModule_ProvideStoreServiceFactory(DataModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public StoreService get() {
    return Preconditions.checkNotNull(
        module.provideStoreService(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<StoreService> create(DataModule module) {
    return new DataModule_ProvideStoreServiceFactory(module);
  }
}
