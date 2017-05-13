package com.ateam.funshoppers.databinding;
import com.ateam.funshoppers.R;
import com.ateam.funshoppers.BR;
import android.view.View;
public class ItemDetectedBeaconBinding extends android.databinding.ViewDataBinding {
    
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.container_view, 10);
        sViewsWithIds.put(R.id.beacon_item_view_header, 11);
        sViewsWithIds.put(R.id.beacon_item_view, 12);
        sViewsWithIds.put(R.id.beacon_item_distance_label, 13);
        sViewsWithIds.put(R.id.beacon_major_minor_container, 14);
    }
    // views
    public final android.widget.TextView beaconItemDistanceLabel;
    public final android.widget.TextView beaconItemDistanceValue;
    public final android.widget.TextView beaconItemId2Value;
    public final android.widget.TextView beaconItemId3Value;
    public final android.widget.TextView beaconItemMajorLabel;
    public final android.widget.TextView beaconItemMinorLabel;
    public final android.widget.TextView beaconItemUuidValue;
    public final android.widget.LinearLayout beaconItemView;
    public final android.widget.LinearLayout beaconItemViewHeader;
    public final android.widget.LinearLayout beaconMajorMinorContainer;
    public final android.widget.LinearLayout beaconMinorContainer;
    public final android.widget.LinearLayout containerView;
    public final android.widget.FrameLayout contentView;
    private final android.widget.Button mboundView2;
    private final android.widget.LinearLayout mboundView4;
    // variables
    private com.ateam.funshoppers.viewModel.DetectedBeaconViewModel mViewModel;
    // values
    // listeners
    
    public ItemDetectedBeaconBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds);
        this.beaconItemDistanceLabel = (android.widget.TextView) bindings[13];
        this.beaconItemDistanceValue = (android.widget.TextView) bindings[3];
        this.beaconItemDistanceValue.setTag(null);
        this.beaconItemId2Value = (android.widget.TextView) bindings[6];
        this.beaconItemId2Value.setTag(null);
        this.beaconItemId3Value = (android.widget.TextView) bindings[9];
        this.beaconItemId3Value.setTag(null);
        this.beaconItemMajorLabel = (android.widget.TextView) bindings[5];
        this.beaconItemMajorLabel.setTag(null);
        this.beaconItemMinorLabel = (android.widget.TextView) bindings[8];
        this.beaconItemMinorLabel.setTag(null);
        this.beaconItemUuidValue = (android.widget.TextView) bindings[1];
        this.beaconItemUuidValue.setTag(null);
        this.beaconItemView = (android.widget.LinearLayout) bindings[12];
        this.beaconItemViewHeader = (android.widget.LinearLayout) bindings[11];
        this.beaconMajorMinorContainer = (android.widget.LinearLayout) bindings[14];
        this.beaconMinorContainer = (android.widget.LinearLayout) bindings[7];
        this.beaconMinorContainer.setTag(null);
        this.containerView = (android.widget.LinearLayout) bindings[10];
        this.contentView = (android.widget.FrameLayout) bindings[0];
        this.contentView.setTag(null);
        this.mboundView2 = (android.widget.Button) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (android.widget.LinearLayout) bindings[4];
        this.mboundView4.setTag(null);
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
                setViewModel((com.ateam.funshoppers.viewModel.DetectedBeaconViewModel) variable);
                return true;
        }
        return false;
    }
    
    public void setViewModel(com.ateam.funshoppers.viewModel.DetectedBeaconViewModel viewModel) {
        updateRegistration(0, viewModel);
        this.mViewModel = viewModel;
        synchronized(this) {
            mDirtyFlags |= 0b1L;
        }
        super.requestRebind();
    }
    public com.ateam.funshoppers.viewModel.DetectedBeaconViewModel getViewModel() {
        return mViewModel;
    }
    
    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModel((com.ateam.funshoppers.viewModel.DetectedBeaconViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(com.ateam.funshoppers.viewModel.DetectedBeaconViewModel viewModel, int fieldId) {
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
        com.ateam.funshoppers.viewModel.DetectedBeaconViewModel viewModel = mViewModel;
        java.lang.String nameMinorViewModel = null;
        java.lang.String nameMajorViewModel = null;
        int visibilityMajorViewM = 0;
        java.lang.String uuidViewModel = null;
        android.view.View.OnClickListener onClickBeaconViewMod = null;
        java.lang.String distanceViewModel = null;
        int visibilityMinorViewM = 0;
        java.lang.String minorViewModel = null;
        java.lang.String majorViewModel = null;
    
        if ((dirtyFlags & 0b11L) != 0) {
            // read viewModel~
            viewModel = viewModel;
            updateRegistration(0, viewModel);
        
            if (viewModel != null) {
                // read nameMinor~.~viewModel~
                nameMinorViewModel = viewModel.getNameMinor();
                // read nameMajor~.~viewModel~
                nameMajorViewModel = viewModel.getNameMajor();
                // read visibilityMajor~.~viewModel~
                visibilityMajorViewM = viewModel.visibilityMajor();
                // read uuid~.~viewModel~
                uuidViewModel = viewModel.getUuid();
                // read onClickBeacon~.~viewModel~
                onClickBeaconViewMod = viewModel.onClickBeacon();
                // read distance~.~viewModel~
                distanceViewModel = viewModel.getDistance();
                // read visibilityMinor~.~viewModel~
                visibilityMinorViewM = viewModel.visibilityMinor();
                // read minor~.~viewModel~
                minorViewModel = viewModel.getMinor();
                // read major~.~viewModel~
                majorViewModel = viewModel.getMajor();
            }
        }
        // batch finished
        if ((dirtyFlags & 0b11L) != 0) {
            // api target 1
            this.beaconItemDistanceValue.setText(distanceViewModel);
            this.beaconItemId2Value.setText(majorViewModel);
            this.beaconItemId3Value.setText(minorViewModel);
            this.beaconItemMajorLabel.setText(nameMajorViewModel);
            this.beaconItemMinorLabel.setText(nameMinorViewModel);
            this.beaconItemUuidValue.setText(uuidViewModel);
            this.beaconMinorContainer.setVisibility(visibilityMinorViewM);
            this.contentView.setOnClickListener(onClickBeaconViewMod);
            this.mboundView2.setText(uuidViewModel);
            this.mboundView4.setVisibility(visibilityMajorViewM);
        }
    }
    // Listener Stub Implementations
    // dirty flag
    private  long mDirtyFlags = 0b1111111111111111111111111111111111111111111111111111111111111111L;
    
    public static ItemDetectedBeaconBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ItemDetectedBeaconBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemDetectedBeaconBinding>inflate(inflater, com.ateam.funshoppers.R.layout.item_detected_beacon, root, attachToRoot, bindingComponent);
    }
    public static ItemDetectedBeaconBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ItemDetectedBeaconBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.ateam.funshoppers.R.layout.item_detected_beacon, null, false), bindingComponent);
    }
    public static ItemDetectedBeaconBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ItemDetectedBeaconBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_detected_beacon_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemDetectedBeaconBinding(bindingComponent, view);
    }
}
    /* flag mapping
        flag 0: viewModel~
        flag 1: INVALIDATE ANY
    flag mapping end*/
    //end