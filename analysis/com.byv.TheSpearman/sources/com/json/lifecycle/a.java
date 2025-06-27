package com.json.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/* loaded from: classes4.dex */
public class a extends Fragment {
    private static final String b = "com.ironsource.lifecycle.IronsourceLifecycleFragment";

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC0235a f1879a;

    /* renamed from: com.ironsource.lifecycle.a$a, reason: collision with other inner class name */
    interface InterfaceC0235a {
        void a(Activity activity);

        void b(Activity activity);

        void onResume(Activity activity);
    }

    static a a(Activity activity) {
        return (a) activity.getFragmentManager().findFragmentByTag(b);
    }

    private void a(InterfaceC0235a interfaceC0235a) {
        if (interfaceC0235a != null) {
            interfaceC0235a.b(getActivity());
        }
    }

    static void b(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager == null || fragmentManager.findFragmentByTag(b) != null) {
            return;
        }
        fragmentManager.beginTransaction().add(new a(), b).commit();
        fragmentManager.executePendingTransactions();
    }

    private void b(InterfaceC0235a interfaceC0235a) {
        if (interfaceC0235a != null) {
            interfaceC0235a.onResume(getActivity());
        }
    }

    private void c(InterfaceC0235a interfaceC0235a) {
        if (interfaceC0235a != null) {
            interfaceC0235a.a(getActivity());
        }
    }

    void d(InterfaceC0235a interfaceC0235a) {
        this.f1879a = interfaceC0235a;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(this.f1879a);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f1879a = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        b(this.f1879a);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        c(this.f1879a);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
    }
}
