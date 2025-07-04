package com.mbridge.msdk.out;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;

/* loaded from: classes4.dex */
public class Frame {
    private List<CampaignEx> campaigns;
    private String parentSessionId;
    private String sessionId;
    private int template;

    public List<CampaignEx> getCampaigns() {
        return this.campaigns;
    }

    public void setCampaigns(List<CampaignEx> list) {
        this.campaigns = list;
    }

    public String getParentSessionId() {
        return this.parentSessionId;
    }

    public void setParentSessionId(String str) {
        this.parentSessionId = str;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public int getTemplate() {
        return this.template;
    }

    public void setTemplate(int i) {
        this.template = i;
    }
}
