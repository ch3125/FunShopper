// Generated code from Butter Knife. Do not modify!
package com.ateam.funshoppers.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainNavigationActivity$$ViewBinder<T extends com.ateam.funshoppers.ui.activity.MainNavigationActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131755179, "field 'fab' and method 'navAction'");
    target.fab = finder.castView(view, 2131755179, "field 'fab'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.navAction();
        }
      });
    view = finder.findRequiredView(source, 2131755176, "field 'drawer'");
    target.drawer = finder.castView(view, 2131755176, "field 'drawer'");
    view = finder.findRequiredView(source, 2131755170, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131755170, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131755178, "field 'navigationView'");
    target.navigationView = finder.castView(view, 2131755178, "field 'navigationView'");
  }

  @Override public void unbind(T target) {
    target.fab = null;
    target.drawer = null;
    target.toolbar = null;
    target.navigationView = null;
  }
}
