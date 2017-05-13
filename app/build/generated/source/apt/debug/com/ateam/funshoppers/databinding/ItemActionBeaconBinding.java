package com.ateam.funshoppers.databinding;
import com.ateam.funshoppers.R;
import com.ateam.funshoppers.BR;
import android.view.View;
public class ItemActionBeaconBinding extends android.databinding.ViewDataBinding {
    
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.container_action_name, 8);
        sViewsWithIds.put(R.id.container_action_action, 9);
        sViewsWithIds.put(R.id.container_tools, 10);
    }
    // views
    public final android.widget.RelativeLayout containerAction;
    public final android.widget.LinearLayout containerActionAction;
    public final android.widget.RelativeLayout containerActionName;
    public final android.widget.RelativeLayout containerTools;
    public final android.widget.FrameLayout contentView;
    public final android.widget.ImageView imageActionDelete;
    public final android.widget.ImageView imageActionEnabled;
    private final android.widget.TextView mboundView4;
    private final android.widget.TextView mboundView5;
    public final android.widget.TextView textActionEnable;
    public final android.widget.TextView textActionName;
    // variables
    private com.ateam.funshoppers.viewModel.ActionBeaconViewModel mViewModel;
    // values
    // listeners
    
    public ItemActionBeaconBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds);
        this.containerAction = (android.widget.RelativeLayout) bindings[1];
        this.containerAction.setTag(null);
        this.containerActionAction = (android.widget.LinearLayout) bindings[9];
        this.containerActionName = (android.widget.RelativeLayout) bindings[8];
        this.containerTools = (android.widget.RelativeLayout) bindings[10];
        this.contentView = (android.widget.FrameLayout) bindings[0];
        this.contentView.setTag(null);
        this.imageActionDelete = (android.widget.ImageView) bindings[7];
        this.imageActionDelete.setTag(null);
        this.imageActionEnabled = (android.widget.ImageView) bindings[6];
        this.imageActionEnabled.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.textActionEnable = (android.widget.TextView) bindings[2];
        this.textActionEnable.setTag(null);
        this.textActionName = (android.widget.TextView) bindings[3];
        this.textActionName.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
    
    @Override
    public void invalidateAll() {
        synchronized(this) {
            mDirtyFlags = 0b10L;
        }
        requestRebind();
    }
    
    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }
    
    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
            case BR.viewModel :
                setViewModel((com.ateam.funshoppers.viewModel.ActionBeaconViewModel) variable);
                return true;
        }
        return false;
    }
    
    public void setViewModel(com.ateam.funshoppers.viewModel.ActionBeaconViewModel viewModel) {
        updateRegistration(0, viewModel);
        this.mViewModel = viewModel;
        synchronized(this) {
            mDirtyFlags |= 0b1L;
        }
        super.requestRebind();
    }
    public com.ateam.funshoppers.viewModel.ActionBeaconViewModel getViewModel() {
        return mViewModel;
    }
    
    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModel((com.ateam.funshoppers.viewModel.ActionBeaconViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(com.ateam.funshoppers.viewModel.ActionBeaconViewModel viewModel, int fieldId) {
        switch (fieldId) {
            case BR._all:
                synchronized(this) {
                    mDirtyFlags |= 0b1L;
                }
                return true;
        }
        return false;
    }
    
    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.ateam.funshoppers.viewModel.ActionBeaconViewModel viewModel = mViewModel;
        android.graphics.drawable.Drawable IsEnabledViewModelAn = null;
        android.view.View.OnClickListener onClickEditViewModel = null;
        java.lang.String eventNameViewModel = null;
        boolean isEnabledViewModel = false;
        java.lang.String actionNamesViewModel = null;
        android.view.View.OnClickListener onClickDeleteViewMod = null;
        java.lang.String enableStatusViewMode = null;
        android.view.View.OnClickListener onClickEnableViewMod = null;
        java.lang.String nameViewModel = null;
    
        if ((dirtyFlags & 0b11L) != 0) {
            // read viewModel~
            viewModel = viewModel;
            updateRegistration(0, viewModel);
        
            if (viewModel != null) {
                // read onClickEdit~.~viewModel~
                onClickEditViewModel = viewModel.onClickEdit();
                // read eventName~.~viewModel~
                eventNameViewModel = viewModel.getEventName();
                // read isEnabled~.~viewModel~
                isEnabledViewModel = viewModel.isEnabled();
                // read actionNames~.~viewModel~
                actionNamesViewModel = viewModel.getActionNames();
                // read onClickDelete~.~viewModel~
                onClickDeleteViewMod = viewModel.onClickDelete();
                // read enableStatus~.~viewModel~
                enableStatusViewMode = viewModel.getEnableStatus();
                // read onClickEnable~.~viewModel~
                onClickEnableViewMod = viewModel.onClickEnable();
                // read name~.~viewModel~
                nameViewModel = viewModel.getName();
            }
            if((dirtyFlags & 0b11L) != 0) {
                if (isEnabledViewModel) {
                    dirtyFlags |= 0b1000L;
                } else {
                    dirtyFlags |= 0b100L;
                }}
        
            // read ?:isEnabled~.~viewModel~~@android:drawable/ic_alarm_on_black_18dp~~@android:drawable/ic_alarm_off_black_18dp~
            IsEnabledViewModelAn = isEnabledViewModel ? getRoot().getResources().getDrawable(R.drawable.ic_alarm_on_black_18dp) : getRoot().getResources().getDrawable(R.drawable.ic_alarm_off_black_18dp);
        }
        // batch finished
        if ((dirtyFlags & 0b11L) != 0) {
            // api target 1
            this.containerAction.setOnClickListener(onClickEditViewModel);
            this.imageActionDelete.setOnClickListener(onClickDeleteViewMod);
            this.imageActionEnabled.setOnClickListener(onClickEnableViewMod);
            android.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.imageActionEnabled, IsEnabledViewModelAn);
            this.mboundView4.setText(eventNameViewModel);
            this.mboundView5.setText(actionNamesViewModel);
            this.textActionEnable.setOnClickListener(onClickEnableViewMod);
            this.textActionEnable.setText(enableStatusViewMode);
            this.textActionName.setText(nameViewModel);
        }
    }
    // Listener Stub Implementations
    // dirty flag
    private  long mDirtyFlags = 0b1111111111111111111111111111111111111111111111111111111111111111L;
    
    public static ItemActionBeaconBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ItemActionBeaconBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemActionBeaconBinding>inflate(inflater, com.ateam.funshoppers.R.layout.item_action_beacon, root, attachToRoot, bindingComponent);
    }
    public static ItemActionBeaconBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ItemActionBeaconBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.ateam.funshoppers.R.layout.item_action_beacon, null, false), bindingComponent);
    }
    public static ItemActionBeaconBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ItemActionBeaconBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_action_beacon_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemActionBeaconBinding(bindingComponent, view);
    }
}
    /* flag mapping
        flag 0: viewModel~
        flag 1: INVALIDATE ANY
        flag 2: ?:isEnabled~.~viewModel~~@android:drawable/ic_alarm_on_black_18dp~~@android:drawable/ic_alarm_off_black_18dp~== false
        flag 3: ?:isEnabled~.~viewModel~~@android:drawable/ic_alarm_on_black_18dp~~@android:drawable/ic_alarm_off_black_18dp~== true
    flag mapping end*/
    //end