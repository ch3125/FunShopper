package com.ateam.funshoppers.injection.module;

import com.ateam.funshoppers.action.ActionExecutor;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationModule_ProvideActionExecutorFactory
    implements Factory<ActionExecutor> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideActionExecutorFactory(ApplicationModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ActionExecutor get() {
    return Preconditions.checkNotNull(
        module.provideActionExecutor(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ActionExecutor> create(ApplicationModule module) {
    return new ApplicationModule_ProvideActionExecutorFactory(module);
  }
}
