// Generated code from Butter Knife. Do not modify!
package com.ateam.funshoppers.ui.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class BaseFragment$EmptyView$$ViewBinder<T extends com.ateam.funshoppers.ui.fragment.BaseFragment.EmptyView> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131755276, "field 'text'");
    target.text = finder.castView(view, 2131755276, "field 'text'");
  }

  @Override public void unbind(T target) {
    target.text = null;
  }
}
