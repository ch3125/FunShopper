package com.ateam.funshoppers.injection.component;

import com.ateam.funshoppers.data.DataManager;
import com.ateam.funshoppers.data.DataManager_MembersInjector;
import com.ateam.funshoppers.data.StoreService;
import com.ateam.funshoppers.injection.module.DataModule;
import com.ateam.funshoppers.injection.module.DataModule_ProvideStoreServiceFactory;
import dagger.MembersInjector;
import dagger.internal.Preconditions;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerDataComponent implements DataComponent {
  private Provider<StoreService> provideStoreServiceProvider;

  private MembersInjector<DataManager> dataManagerMembersInjector;

  private DaggerDataComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideStoreServiceProvider =
        ScopedProvider.create(DataModule_ProvideStoreServiceFactory.create(builder.dataModule));

    this.dataManagerMembersInjector =
        DataManager_MembersInjector.create(provideStoreServiceProvider);
  }

  @Override
  public void inject(DataManager dataManager) {
    dataManagerMembersInjector.injectMembers(dataManager);
  }

  public static final class Builder {
    private DataModule dataModule;

    private ApplicationComponent applicationComponent;

    private Builder() {}

    public DataComponent build() {
      if (dataModule == null) {
        throw new IllegalStateException(DataModule.class.getCanonicalName() + " must be set");
      }
      if (applicationComponent == null) {
        throw new IllegalStateException(
            ApplicationComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerDataComponent(this);
    }

    public Builder dataModule(DataModule dataModule) {
      this.dataModule = Preconditions.checkNotNull(dataModule);
      return this;
    }

    public Builder applicationComponent(ApplicationComponent applicationComponent) {
      this.applicationComponent = Preconditions.checkNotNull(applicationComponent);
      return this;
    }
  }
}
