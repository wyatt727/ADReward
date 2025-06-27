package com.mbridge.msdk.scheme.applet;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class AppletModelManager {
    private static final String TAG = "AppletModelManager";
    private ConcurrentHashMap<String, AppletsModel> appletsModels;

    private AppletModelManager() {
        this.appletsModels = new ConcurrentHashMap<>();
    }

    public static AppletModelManager getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public AppletsModel get(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        try {
            String str = campaignEx.getRequestId() + "_" + campaignEx.getId() + "_" + campaignEx.getCampaignUnitId();
            if (this.appletsModels.containsKey(str)) {
                return this.appletsModels.get(str);
            }
            AppletsModel appletsModel = new AppletsModel(campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getRequestId());
            this.appletsModels.put(str, appletsModel);
            return appletsModel;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.b(TAG, e.getMessage());
            }
            return null;
        }
    }

    public void remove(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return;
        }
        try {
            String str = campaignEx.getRequestId() + "_" + campaignEx.getId() + "_" + campaignEx.getCampaignUnitId();
            if (this.appletsModels.containsKey(str)) {
                this.appletsModels.remove(str);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.b(TAG, e.getMessage());
            }
        }
    }

    public void replace(AppletsModel appletsModel, CampaignEx campaignEx) {
        if (campaignEx == null || appletsModel == null) {
            return;
        }
        try {
            String str = campaignEx.getRequestId() + "_" + campaignEx.getId() + "_" + campaignEx.getCampaignUnitId();
            if (this.appletsModels.containsKey(str)) {
                this.appletsModels.remove(str);
            }
            this.appletsModels.put(str, appletsModel);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.b(TAG, e.getMessage());
            }
        }
    }

    private static class SingletonHolder {
        private static final AppletModelManager INSTANCE = new AppletModelManager();

        private SingletonHolder() {
        }
    }
}
