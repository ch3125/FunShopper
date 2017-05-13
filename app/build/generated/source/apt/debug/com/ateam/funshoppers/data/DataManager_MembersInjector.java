package com.ateam.funshoppers.data;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DataManager_MembersInjector implements MembersInjector<DataManager> {
  private final Provider<StoreService> mStoreServiceProvider;

  public DataManager_MembersInjector(Provider<StoreService> mStoreServiceProvider) {
    assert mStoreServiceProvider != null;
    this.mStoreServiceProvider = mStoreServiceProvider;
  }

  public static MembersInjector<DataManager> create(Provider<StoreService> mStoreServiceProvider) {
    return new DataManager_MembersInjector(mStoreServiceProvider);
  }

  @Override
  public void injectMembers(DataManager instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mStoreService = mStoreServiceProvider.get();
  }

  public static void injectMStoreService(
      DataManager instance, Provider<StoreService> mStoreServiceProvider) {
    instance.mStoreService = mStoreServiceProvider.get();
  }
}
