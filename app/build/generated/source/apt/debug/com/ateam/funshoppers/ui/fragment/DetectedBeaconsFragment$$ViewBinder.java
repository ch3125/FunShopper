// Generated code from Butter Knife. Do not modify!
package com.ateam.funshoppers.ui.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class DetectedBeaconsFragment$$ViewBinder<T extends com.ateam.funshoppers.ui.fragment.DetectedBeaconsFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131755173, "field 'mListBeacons'");
    target.mListBeacons = finder.castView(view, 2131755173, "field 'mListBeacons'");
    view = finder.findRequiredView(source, 2131755174, "field 'mProgressBar'");
    target.mProgressBar = finder.castView(view, 2131755174, "field 'mProgressBar'");
    view = finder.findRequiredView(source, 2131755175, "field 'mEmpty'");
    target.mEmpty = finder.castView(view, 2131755175, "field 'mEmpty'");
    view = finder.findRequiredView(source, 2131755143, "field 'mToolbar'");
    target.mToolbar = finder.castView(view, 2131755143, "field 'mToolbar'");
  }

  @Override public void unbind(T target) {
    target.mListBeacons = null;
    target.mProgressBar = null;
    target.mEmpty = null;
    target.mToolbar = null;
  }
}
