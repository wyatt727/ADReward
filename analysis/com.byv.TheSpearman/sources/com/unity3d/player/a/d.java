package com.unity3d.player.a;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.unity3d.player.IPermissionRequestCallbacks;
import com.unity3d.player.UnityPermissions;

/* loaded from: classes4.dex */
public class d extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    private final IPermissionRequestCallbacks f4391a;
    private final Activity b;
    private final Looper c = Looper.myLooper();

    public d(Activity activity, IPermissionRequestCallbacks iPermissionRequestCallbacks) {
        this.f4391a = iPermissionRequestCallbacks;
        this.b = activity;
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestPermissions(getArguments().getStringArray("PermissionNames"), 96489);
    }

    @Override // android.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 96489) {
            return;
        }
        int i2 = 0;
        if (strArr.length != 0) {
            while (i2 < strArr.length && i2 < iArr.length) {
                int i3 = iArr[i2];
                IPermissionRequestCallbacks iPermissionRequestCallbacks = this.f4391a;
                if (iPermissionRequestCallbacks != null && this.b != null && this.c != null) {
                    if (iPermissionRequestCallbacks instanceof UnityPermissions.ModalWaitForPermissionResponse) {
                        iPermissionRequestCallbacks.onPermissionGranted(strArr[i2]);
                    } else {
                        String str = strArr[i2] == null ? "<null>" : strArr[i2];
                        new Handler(this.c).post(new c(this, this.f4391a, str, iArr[i2], this.b.shouldShowRequestPermissionRationale(str)));
                    }
                }
                i2++;
            }
        } else if (this.f4391a != null && this.b != null && this.c != null) {
            String[] stringArray = getArguments().getStringArray("PermissionNames");
            if (this.f4391a instanceof UnityPermissions.ModalWaitForPermissionResponse) {
                int length = stringArray.length;
                while (i2 < length) {
                    this.f4391a.onPermissionDenied(stringArray[i2]);
                    i2++;
                }
            } else {
                new Handler(this.c).post(new b(this, stringArray));
            }
        }
        FragmentTransaction fragmentTransactionBeginTransaction = getActivity().getFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.remove(this);
        fragmentTransactionBeginTransaction.commit();
    }
}
