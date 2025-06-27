package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class FilterWord {
    private String EYQ;
    private List<FilterWord> Pm;
    private boolean Td;
    private String mZx;

    public FilterWord(String str, String str2) {
        this.EYQ = str;
        this.mZx = str2;
    }

    public FilterWord() {
    }

    public String getId() {
        return this.EYQ;
    }

    public void setId(String str) {
        this.EYQ = str;
    }

    public String getName() {
        return this.mZx;
    }

    public void setName(String str) {
        this.mZx = str;
    }

    public boolean getIsSelected() {
        return this.Td;
    }

    public void setIsSelected(boolean z) {
        this.Td = z;
    }

    public List<FilterWord> getOptions() {
        return this.Pm;
    }

    public void addOption(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.Pm == null) {
            this.Pm = new ArrayList();
        }
        this.Pm.add(filterWord);
    }

    public boolean isValid() {
        return (TextUtils.isEmpty(this.EYQ) || TextUtils.isEmpty(this.mZx)) ? false : true;
    }

    public boolean hasSecondOptions() {
        List<FilterWord> list = this.Pm;
        return (list == null || list.isEmpty()) ? false : true;
    }
}
