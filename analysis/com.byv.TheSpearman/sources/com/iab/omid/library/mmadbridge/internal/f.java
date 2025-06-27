package com.iab.omid.library.mmadbridge.internal;

import android.view.View;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class f {
    private static final Pattern b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a, reason: collision with root package name */
    private final List<e> f1590a = new ArrayList();

    private void a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!b.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    private e b(View view) {
        for (e eVar : this.f1590a) {
            if (eVar.c().get() == view) {
                return eVar;
            }
        }
        return null;
    }

    public List<e> a() {
        return this.f1590a;
    }

    public void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        a(view);
        a(str);
        if (b(view) == null) {
            this.f1590a.add(new e(view, friendlyObstructionPurpose, str));
        }
    }

    public void b() {
        this.f1590a.clear();
    }

    public void c(View view) {
        a(view);
        e eVarB = b(view);
        if (eVarB != null) {
            this.f1590a.remove(eVarB);
        }
    }
}
