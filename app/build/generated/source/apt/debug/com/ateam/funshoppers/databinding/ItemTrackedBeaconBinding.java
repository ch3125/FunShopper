package com.ateam.funshoppers.databinding;
import com.ateam.funshoppers.R;
import com.ateam.funshoppers.BR;
import android.view.View;
public class ItemTrackedBeaconBinding extends android.databinding.ViewDataBinding {
    
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.removable_item, 13);
        sViewsWithIds.put(R.id.container_parent, 14);
        sViewsWithIds.put(R.id.container_uuid, 15);
        sViewsWithIds.put(R.id.container_middle, 16);
        sViewsWithIds.put(R.id.left_middle_container, 17);
        sViewsWithIds.put(R.id.beacon_major_minor_container, 18);
        sViewsWithIds.put(R.id.beacon_item_id_label, 19);
        sViewsWithIds.put(R.id.right_middle_container, 20);
        sViewsWithIds.put(R.id.beacon_item_rssi_label, 21);
        sViewsWithIds.put(R.id.recycler_actions, 22);
    }
    // views
    public final android.widget.TextView beaconItemActionName;
    public final android.widget.TextView beaconItemId1Value;
    public final android.widget.TextView beaconItemId2Value;
    public final android.widget.TextView beaconItemId3Value;
    public final android.widget.TextView beaconItemIdLabel;
    public final android.widget.TextView beaconItemMajorLabel;
    public final android.widget.TextView beaconItemMinorLabel;
    public final android.widget.TextView beaconItemProximity;
    public final android.widget.TextView beaconItemRssiLabel;
    public final android.widget.TextView beaconItemType;
    public final android.widget.LinearLayout beaconMajorMinorContainer;
    public final android.widget.LinearLayout beaconMinorContainer;
    public final android.widget.TextView beaconUuidLabel;
    public final android.widget.TextView beaconUuidValue;
    public final android.support.v7.widget.CardView cardView;
    public final android.widget.LinearLayout containerMiddle;
    public final android.widget.RelativeLayout containerParent;
    public final android.widget.LinearLayout containerUuid;
    public final android.widget.LinearLayout leftMiddleContainer;
    private final android.widget.LinearLayout mboundView3;
    public final android.support.v7.widget.RecyclerView recyclerActions;
    public final android.widget.LinearLayout removableItem;
    public final android.widget.LinearLayout rightMiddleContainer;
    // variables
    private com.ateam.funshoppers.viewModel.TrackedBeaconViewModel mViewModel;
    // values
    // listeners
    
    public ItemTrackedBeaconBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds);
        this.beaconItemActionName = (android.widget.TextView) bindings[12];
        this.beaconItemActionName.setTag(null);
        this.beaconItemId1Value = (android.widget.TextView) bindings[9];
        this.beaconItemId1Value.setTag(null);
        this.beaconItemId2Value = (android.widget.TextView) bindings[5];
        this.beaconItemId2Value.setTag(null);
        this.beaconItemId3Value = (android.widget.TextView) bindings[8];
        this.beaconItemId3Value.setTag(null);
        this.beaconItemIdLabel = (android.widget.TextView) bindings[19];
        this.beaconItemMajorLabel = (android.widget.TextView) bindings[4];
        this.beaconItemMajorLabel.setTag(null);
        this.beaconItemMinorLabel = (android.widget.TextView) bindings[7];
        this.beaconItemMinorLabel.setTag(null);
        this.beaconItemProximity = (android.widget.TextView) bindings[10];
        this.beaconItemProximity.setTag(null);
        this.beaconItemRssiLabel = (android.widget.TextView) bindings[21];
        this.beaconItemType = (android.widget.TextView) bindings[11];
        this.beaconItemType.setTag(null);
        this.beaconMajorMinorContainer = (android.widget.LinearLayout) bindings[18];
        this.beaconMinorContainer = (android.widget.LinearLayout) bindings[6];
        this.beaconMinorContainer.setTag(null);
        this.beaconUuidLabel = (android.widget.TextView) bindings[1];
        this.beaconUuidLabel.setTag(null);
        this.beaconUuidValue = (android.widget.TextView) bindings[2];
        this.beaconUuidValue.setTag(null);
        this.cardView = (android.support.v7.widget.CardView) bindings[0];
        this.cardView.setTag(null);
        this.containerMiddle = (android.widget.LinearLayout) bindings[16];
        this.containerParent = (android.widget.RelativeLayout) bindings[14];
        this.containerUuid = (android.widget.LinearLayout) bindings[15];
        this.leftMiddleContainer = (android.widget.LinearLayout) bindings[17];
        this.mboundView3 = (android.widget.LinearLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.recyclerActions = (android.support.v7.widget.RecyclerView) bindings[22];
        this.removableItem = (android.widget.LinearLayout) bindings[13];
        this.rightMiddleContainer = (android.widget.LinearLayout) bindings[20];
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
                setViewModel((com.ateam.funshoppers.viewModel.TrackedBeaconViewModel) variable);
                return true;
        }
        return false;
    }
    
    public void setViewModel(com.ateam.funshoppers.viewModel.TrackedBeaconViewModel viewModel) {
        updateRegistration(0, viewModel);
        this.mViewModel = viewModel;
        synchronized(this) {
            mDirtyFlags |= 0b1L;
        }
        super.requestRebind();
    }
    public com.ateam.funshoppers.viewModel.TrackedBeaconViewModel getViewModel() {
        return mViewModel;
    }
    
    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModel((com.ateam.funshoppers.viewModel.TrackedBeaconViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(com.ateam.funshoppers.viewModel.TrackedBeaconViewModel viewModel, int fieldId) {
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
        com.ateam.funshoppers.viewModel.TrackedBeaconViewModel viewModel = mViewModel;
        android.view.View.OnClickListener onClickBeaconAddView = null;
        java.lang.String nameMinorViewModel = null;
        java.lang.String nameMajorViewModel = null;
        java.lang.String beaconTypeViewModel = null;
        int visibilityMajorViewM = 0;
        java.lang.String uuidViewModel = null;
        java.lang.String nameUuidViewModel = null;
        int visibilityMinorViewM = 0;
        java.lang.String minorViewModel = null;
        java.lang.String proximityViewModel = null;
        java.lang.String majorViewModel = null;
        int proximityColorViewMo = 0;
        java.lang.String nameViewModel = null;
    
        if ((dirtyFlags & 0b11L) != 0) {
            // read viewModel~
            viewModel = viewModel;
            updateRegistration(0, viewModel);
        
            if (viewModel != null) {
                // read onClickBeaconAdd~.~viewModel~
                onClickBeaconAddView = viewModel.onClickBeaconAdd();
                // read nameMinor~.~viewModel~
                nameMinorViewModel = viewModel.getNameMinor();
                // read nameMajor~.~viewModel~
                nameMajorViewModel = viewModel.getNameMajor();
                // read beaconType~.~viewModel~
                beaconTypeViewModel = viewModel.getBeaconType();
                // read visibilityMajor~.~viewModel~
                visibilityMajorViewM = viewModel.visibilityMajor();
                // read uuid~.~viewModel~
                uuidViewModel = viewModel.getUuid();
                // read nameUuid~.~viewModel~
                nameUuidViewModel = viewModel.getNameUuid();
                // read visibilityMinor~.~viewModel~
                visibilityMinorViewM = viewModel.visibilityMinor();
                // read minor~.~viewModel~
                minorViewModel = viewModel.getMinor();
                // read proximity~.~viewModel~
                proximityViewModel = viewModel.getProximity();
                // read major~.~viewModel~
                majorViewModel = viewModel.getMajor();
                // read proximityColor~.~viewModel~
                proximityColorViewMo = viewModel.getProximityColor();
                // read name~.~viewModel~
                nameViewModel = viewModel.getName();
            }
        }
        // batch finished
        if ((dirtyFlags & 0b11L) != 0) {
            // api target 1
            this.beaconItemActionName.setOnClickListener(onClickBeaconAddView);
            this.beaconItemId1Value.setText(nameViewModel);
            this.beaconItemId2Value.setText(majorViewModel);
            this.beaconItemId3Value.setText(minorViewModel);
            this.beaconItemMajorLabel.setText(nameMajorViewModel);
            this.beaconItemMinorLabel.setText(nameMinorViewModel);
            this.beaconItemProximity.setText(proximityViewModel);
            this.beaconItemProximity.setTextColor(proximityColorViewMo);
            this.beaconItemType.setText(beaconTypeViewModel);
            this.beaconMinorContainer.setVisibility(visibilityMinorViewM);
            this.beaconUuidLabel.setText(nameUuidViewModel);
            this.beaconUuidValue.setText(uuidViewModel);
            this.mboundView3.setVisibility(visibilityMajorViewM);
        }
    }
    // Listener Stub Implementations
    // dirty flag
    private  long mDirtyFlags = 0b1111111111111111111111111111111111111111111111111111111111111111L;
    
    public static ItemTrackedBeaconBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ItemTrackedBeaconBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemTrackedBeaconBinding>inflate(inflater, com.ateam.funshoppers.R.layout.item_tracked_beacon, root, attachToRoot, bindingComponent);
    }
    public static ItemTrackedBeaconBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ItemTrackedBeaconBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.ateam.funshoppers.R.layout.item_tracked_beacon, null, false), bindingComponent);
    }
    public static ItemTrackedBeaconBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ItemTrackedBeaconBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_tracked_beacon_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemTrackedBeaconBinding(bindingComponent, view);
    }
}
    /* flag mapping
        flag 0: viewModel~
        flag 1: INVALIDATE ANY
    flag mapping end*/
    //end