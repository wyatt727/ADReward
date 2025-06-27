package com.facebook.ads.redexgen.uinode;

import android.os.Parcel;
import java.io.Serializable;

/* loaded from: assets/audience_network.dex */
public abstract class LR {
    public static Serializable A00(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        Serializable serializable = parcelObtain.readSerializable();
        parcelObtain.recycle();
        return serializable;
    }

    public static byte[] A01(Serializable serializable) {
        if (serializable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeSerializable(serializable);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
