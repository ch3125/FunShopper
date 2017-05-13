
package android.databinding;
import com.ateam.funshoppers.BR;
class DataBinderMapper {
    final static int TARGET_MIN_SDK = 23;
    public DataBinderMapper() {
    }
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
            case com.ateam.funshoppers.R.layout.item_action_beacon:
                return com.ateam.funshoppers.databinding.ItemActionBeaconBinding.bind(view, bindingComponent);
            case com.ateam.funshoppers.R.layout.item_tracked_beacon:
                return com.ateam.funshoppers.databinding.ItemTrackedBeaconBinding.bind(view, bindingComponent);
            case com.ateam.funshoppers.R.layout.item_detected_beacon:
                return com.ateam.funshoppers.databinding.ItemDetectedBeaconBinding.bind(view, bindingComponent);
        }
        return null;
    }
    android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case 376768375:
                if(tag.equals("layout/item_action_beacon_0"))
                    return com.ateam.funshoppers.R.layout.item_action_beacon;
                break;
            case -1526279439:
                if(tag.equals("layout/item_tracked_beacon_0"))
                    return com.ateam.funshoppers.R.layout.item_tracked_beacon;
                break;
            case 546062955:
                if(tag.equals("layout/item_detected_beacon_0"))
                    return com.ateam.funshoppers.R.layout.item_detected_beacon;
                break;
        }
        return 0;
    }
    String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"viewModel"};
    }
}