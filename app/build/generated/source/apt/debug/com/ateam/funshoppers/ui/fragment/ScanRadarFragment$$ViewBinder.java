// Generated code from Butter Knife. Do not modify!
package com.ateam.funshoppers.ui.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ScanRadarFragment$$ViewBinder<T extends com.ateam.funshoppers.ui.fragment.ScanRadarFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131755170, "field 'mToolbar'");
    target.mToolbar = finder.castView(view, 2131755170, "field 'mToolbar'");
    view = finder.findRequiredView(source, 2131755223, "field 'mRadar'");
    target.mRadar = finder.castView(view, 2131755223, "field 'mRadar'");
    view = finder.findRequiredView(source, 2131755224, "field 'mDistView'");
    target.mDistView = finder.castView(view, 2131755224, "field 'mDistView'");
  }

  @Override public void unbind(T target) {
    target.mToolbar = null;
    target.mRadar = null;
    target.mDistView = null;
  }
}
