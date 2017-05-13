
package com.ateam.funshoppers.Online.model;

import com.ateam.funshoppers.model.*;

import java.util.List;

public interface ITriggerable {
    List<com.ateam.funshoppers.model.ActionBeacon> getActions();

    void addAction(com.ateam.funshoppers.model.ActionBeacon action);

    void addActions(List<com.ateam.funshoppers.model.ActionBeacon> actions);
}
