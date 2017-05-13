// Generated code from Butter Knife. Do not modify!
package com.ateam.funshoppers.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class BeaconActionActivity$$ViewBinder<T extends com.ateam.funshoppers.ui.activity.BeaconActionActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131755170, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131755170, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131755171, "field 'viewPager'");
    target.viewPager = finder.castView(view, 2131755171, "field 'viewPager'");
    view = finder.findRequiredView(source, 2131755169, "field 'slidingTabs'");
    target.slidingTabs = finder.castView(view, 2131755169, "field 'slidingTabs'");
  }

  @Override public void unbind(T target) {
    target.toolbar = null;
    target.viewPager = null;
    target.slidingTabs = null;
  }
}
