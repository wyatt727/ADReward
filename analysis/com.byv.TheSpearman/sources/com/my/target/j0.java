package com.my.target;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.json.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.my.target.common.MyTargetConfig;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class j0 extends p1 {
    public static final int[] b = b0.a(260, 272, 268, 276, 516, IronSourceError.ERROR_NO_INTERNET_CONNECTION, 532, 528, IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT, 512, 264, 256, 280);

    /* renamed from: a, reason: collision with root package name */
    public Method f4011a;

    public j0() {
        try {
            this.f4011a = BluetoothDevice.class.getMethod("isConnected", new Class[0]);
        } catch (Throwable unused) {
        }
    }

    public static List<String> a(BluetoothAdapter bluetoothAdapter, Method method) {
        ArrayList arrayList = new ArrayList();
        try {
            for (BluetoothDevice bluetoothDevice : bluetoothAdapter.getBondedDevices()) {
                if (Arrays.binarySearch(b, bluetoothDevice.getBluetoothClass().getDeviceClass()) < 0 && ((Boolean) method.invoke(bluetoothDevice, new Object[0])).booleanValue()) {
                    String name = bluetoothDevice.getName();
                    if (!TextUtils.isEmpty(name)) {
                        arrayList.add(new String(Base64.encode(name.getBytes(), 2), C.UTF8_NAME));
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    public Map<String, String> a(MyTargetConfig myTargetConfig, Context context) {
        BluetoothAdapter defaultAdapter;
        HashMap map = new HashMap();
        if (this.f4011a != null && p1.a("android.permission.BLUETOOTH", context) && (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) != null && defaultAdapter.isEnabled()) {
            List<String> listA = a(defaultAdapter, this.f4011a);
            if (!listA.isEmpty()) {
                map.put("bdn", b0.a(listA));
            }
        }
        return map;
    }
}
