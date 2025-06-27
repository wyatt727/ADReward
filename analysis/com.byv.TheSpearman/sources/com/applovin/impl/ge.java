package com.applovin.impl;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.fe;
import com.applovin.impl.he;
import com.applovin.impl.r;
import com.applovin.impl.zb;
import com.applovin.mediation.MaxDebuggerMultiAdActivity;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public abstract class ge extends ne {

    /* renamed from: a, reason: collision with root package name */
    private he f456a;
    private ListView b;

    public ge() {
        this.communicatorTopics.add("adapter_initialization_status");
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    public void initialize(fe feVar) {
        setTitle(feVar.g());
        he heVar = new he(feVar, this);
        this.f456a = heVar;
        heVar.a(new a(feVar));
    }

    class a implements zb.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ fe f457a;

        a(fe feVar) {
            this.f457a = feVar;
        }

        @Override // com.applovin.impl.zb.a
        public void a(hb hbVar, yb ybVar) {
            if (hbVar.b() == he.a.TEST_ADS.ordinal()) {
                com.applovin.impl.sdk.k kVarO = this.f457a.o();
                fe.b bVarX = this.f457a.x();
                if (ge.this.f456a.a(hbVar)) {
                    if (fe.b.READY == bVarX) {
                        r.a(ge.this, MaxDebuggerMultiAdActivity.class, kVarO.e(), new C0026a());
                        return;
                    } else if (fe.b.DISABLED == bVarX) {
                        kVarO.n0().a();
                        zp.a(ybVar.c(), ybVar.b(), ge.this);
                        return;
                    } else {
                        zp.a(ybVar.c(), ybVar.b(), ge.this);
                        return;
                    }
                }
                zp.a(ybVar.c(), ybVar.b(), ge.this);
                return;
            }
            zp.a(ybVar.c(), ybVar.b(), ge.this);
        }

        /* renamed from: com.applovin.impl.ge$a$a, reason: collision with other inner class name */
        class C0026a implements r.b {
            C0026a() {
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerMultiAdActivity maxDebuggerMultiAdActivity) {
                maxDebuggerMultiAdActivity.initialize(a.this.f457a);
            }
        }
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.b = listView;
        listView.setAdapter((ListAdapter) this.f456a);
    }

    @Override // com.applovin.impl.ne
    protected com.applovin.impl.sdk.k getSdk() {
        he heVar = this.f456a;
        if (heVar != null) {
            return heVar.h().o();
        }
        return null;
    }

    @Override // com.applovin.impl.ne, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (this.f456a.h().b().equals(appLovinCommunicatorMessage.getMessageData().getString("adapter_class", ""))) {
            this.f456a.k();
            this.f456a.c();
        }
    }
}
