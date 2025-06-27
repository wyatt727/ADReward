package com.my.target;

import android.content.Context;
import android.view.View;
import com.my.target.c;
import com.my.target.d;
import com.my.target.m4;
import java.util.List;

/* loaded from: classes4.dex */
public class h4 implements m4 {

    /* renamed from: a, reason: collision with root package name */
    public final m4.a f3988a;
    public final i4 b;
    public f c;

    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f3989a;

        public a(c cVar) {
            this.f3989a = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h4.this.a(view.getContext(), this.f3989a);
        }
    }

    public class b implements d.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.my.target.b f3990a;

        public b(com.my.target.b bVar) {
            this.f3990a = bVar;
        }

        @Override // com.my.target.d.a
        public void a(Context context) {
            h4.this.f3988a.a(this.f3990a, context);
        }
    }

    public h4(i4 i4Var, m4.a aVar) {
        this.b = i4Var;
        this.f3988a = aVar;
    }

    public static h4 a(Context context, m4.a aVar) {
        return new h4(new i4(context), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.f3988a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(w3 w3Var, View view) {
        this.f3988a.a(w3Var, null, view.getContext());
    }

    @Override // com.my.target.m4
    public void a() {
    }

    public void a(Context context, c cVar) {
        f fVar = this.c;
        if (fVar == null || !fVar.b()) {
            f fVar2 = this.c;
            if (fVar2 == null) {
                j3.a(cVar.b(), context);
            } else {
                fVar2.a(context);
            }
        }
    }

    public final void a(com.my.target.b bVar) {
        c adChoices = bVar.getAdChoices();
        if (adChoices == null) {
            return;
        }
        this.b.a(adChoices, new a(adChoices));
        List<c.a> listA = adChoices.a();
        if (listA == null) {
            return;
        }
        f fVarA = f.a(listA, new h1());
        this.c = fVarA;
        fVarA.a(new b(bVar));
    }

    public void a(final w3 w3Var) {
        this.b.a(w3Var.getOptimalLandscapeImage(), w3Var.getOptimalPortraitImage(), w3Var.getCloseIcon());
        this.b.setAgeRestrictions(w3Var.getAgeRestrictions());
        this.b.getImageView().setOnClickListener(new View.OnClickListener() { // from class: com.my.target.h4$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.a(w3Var, view);
            }
        });
        this.b.getCloseButton().setOnClickListener(new View.OnClickListener() { // from class: com.my.target.h4$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.a(view);
            }
        });
        a((com.my.target.b) w3Var);
        this.f3988a.a(w3Var, this.b);
    }

    @Override // com.my.target.m4
    public void destroy() {
    }

    @Override // com.my.target.m4
    public View getCloseButton() {
        return this.b.getCloseButton();
    }

    @Override // com.my.target.m4
    public View i() {
        return this.b;
    }

    @Override // com.my.target.m4
    public void pause() {
    }

    @Override // com.my.target.m4
    public void stop() {
    }
}
