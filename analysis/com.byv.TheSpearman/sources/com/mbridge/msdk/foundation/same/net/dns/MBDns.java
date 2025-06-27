package com.mbridge.msdk.foundation.same.net.dns;

import android.text.TextUtils;
import com.mbridge.msdk.c.e;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.thrid.okhttp.Dns;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public class MBDns implements Dns {
    private static String TAG = "MBDns";

    @Override // com.mbridge.msdk.thrid.okhttp.Dns
    public List<InetAddress> lookup(String str) throws UnknownHostException {
        ad.a(TAG, "host:" + str);
        ad.a(TAG, "host str:" + Arrays.toString(InetAddress.getAllByName(str)));
        try {
            String strB = e.a().b(str);
            if (!TextUtils.isEmpty(strB)) {
                ArrayList arrayList = new ArrayList(Arrays.asList(InetAddress.getAllByName(strB)));
                ad.a(TAG, "ip:" + strB);
                return arrayList;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Dns.SYSTEM.lookup(str);
    }
}
