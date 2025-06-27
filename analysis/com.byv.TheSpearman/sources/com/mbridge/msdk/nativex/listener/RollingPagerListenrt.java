package com.mbridge.msdk.nativex.listener;

import android.content.Context;
import androidx.viewpager.widget.ViewPager;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.e;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public class RollingPagerListenrt implements ViewPager.OnPageChangeListener {
    private NativeListener.FilpListener FilpListening;
    private List<Frame> frames;
    private List<Integer> list = new ArrayList();
    private i reportController;
    private String unit_id;

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
    }

    public void setFilpListening(NativeListener.FilpListener filpListener) {
        this.FilpListening = filpListener;
    }

    public void setCampList(List<Frame> list, Context context, String str) {
        this.frames = list;
        this.reportController = new i(context, 2);
        this.unit_id = str;
        this.list.clear();
        reportRollBC(0);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        reportRollBC(i);
    }

    public void reportRollBC(int i) {
        NativeListener.FilpListener filpListener = this.FilpListening;
        if (filpListener != null) {
            filpListener.filpEvent(i);
        }
        if (this.list.contains(Integer.valueOf(i))) {
            return;
        }
        this.list.add(Integer.valueOf(i));
        Frame frame = this.frames.get(i);
        List<CampaignEx> campaigns = frame.getCampaigns();
        if (campaigns == null || campaigns.isEmpty()) {
            return;
        }
        CampaignEx campaignEx = campaigns.get(0);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < campaigns.size(); i2++) {
            campaignEx = campaigns.get(i2);
            if (i2 == campaigns.size() - 1) {
                sb.append(campaignEx.getId());
            } else {
                sb.append(campaignEx.getId() + ",");
            }
        }
        HashMap map = new HashMap();
        map.put("rid_n", campaignEx.getRequestId());
        map.put("frame_id", (i + 1) + "");
        map.put("template", Integer.valueOf(frame.getTemplate()));
        map.put("cids", sb.toString());
        map.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.unit_id);
        String strA = k.a("2000005", map);
        if (e.a().b()) {
            e.a().a(strA);
        } else {
            this.reportController.a("native_rollbc", strA, this.unit_id, frame);
        }
    }
}
