package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.my.target.c;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.ImageData;
import com.my.target.m2;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final c f3944a;
    public final f b;
    public final m2.a c;
    public final String d;
    public final View.OnClickListener e;
    public WeakReference<i> f;

    public interface a {
        void a(Context context);
    }

    public d(c cVar, MenuFactory menuFactory, m2.a aVar) {
        this.f3944a = cVar;
        this.c = aVar;
        if (cVar == null) {
            this.b = null;
            this.e = null;
            this.d = null;
            return;
        }
        List<c.a> listA = cVar.a();
        if (listA == null || listA.isEmpty()) {
            this.b = null;
        } else {
            this.b = f.a(listA, menuFactory == null ? new h1() : menuFactory);
        }
        this.d = cVar.b();
        this.e = new View.OnClickListener() { // from class: com.my.target.d$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.a(view);
            }
        };
    }

    public static d a(c cVar) {
        return a(cVar, null, null);
    }

    public static d a(c cVar, MenuFactory menuFactory, m2.a aVar) {
        return new d(cVar, menuFactory, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a(view.getContext());
    }

    public void a() {
        f fVar = this.b;
        if (fVar != null) {
            fVar.a((a) null);
        }
        WeakReference<i> weakReference = this.f;
        i iVar = weakReference != null ? weakReference.get() : null;
        if (iVar == null) {
            return;
        }
        c cVar = this.f3944a;
        if (cVar != null) {
            m2.a(cVar.c(), iVar);
        }
        a(iVar);
        this.f.clear();
        this.f = null;
    }

    public void a(Context context) {
        f fVar = this.b;
        if (fVar != null) {
            if (fVar.b()) {
                return;
            }
            this.b.a(context);
        } else {
            String str = this.d;
            if (str != null) {
                j3.a(str, context);
            }
        }
    }

    public void a(i iVar) {
        iVar.setImageBitmap(null);
        iVar.setImageDrawable(null);
        iVar.setVisibility(8);
        iVar.setOnClickListener(null);
    }

    public void a(i iVar, a aVar) {
        if (this.f3944a == null) {
            a(iVar);
            return;
        }
        f fVar = this.b;
        if (fVar != null) {
            fVar.a(aVar);
        }
        this.f = new WeakReference<>(iVar);
        iVar.setVisibility(0);
        iVar.setOnClickListener(this.e);
        if (iVar.hasImage()) {
            return;
        }
        ImageData imageDataC = this.f3944a.c();
        Bitmap bitmap = imageDataC.getBitmap();
        if (bitmap != null) {
            iVar.setImageBitmap(bitmap);
        } else {
            m2.a(imageDataC, iVar, this.c);
        }
    }
}
