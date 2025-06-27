package com.my.target;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import com.my.target.c;
import com.my.target.common.menu.Menu;
import com.my.target.common.menu.MenuAction;
import com.my.target.common.menu.MenuFactory;
import com.my.target.d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class f implements Menu.Listener {

    /* renamed from: a, reason: collision with root package name */
    public final List<c.a> f3961a;
    public final MenuFactory b;
    public Map<MenuAction, c.a> c;
    public Menu d;
    public d.a e;
    public WeakReference<Context> f;

    public f(List<c.a> list, MenuFactory menuFactory) {
        this.f3961a = list;
        this.b = menuFactory;
    }

    public static f a(List<c.a> list, MenuFactory menuFactory) {
        return new f(list, menuFactory);
    }

    public final void a() {
        Menu menu = this.d;
        if (menu == null) {
            return;
        }
        menu.dismiss();
        this.d = null;
        this.c = null;
    }

    public void a(Context context) {
        if (this.f3961a.size() == 0) {
            return;
        }
        Menu menuCreateMenu = this.b.createMenu();
        this.d = menuCreateMenu;
        this.f = new WeakReference<>(context);
        if (this.c == null) {
            this.c = new HashMap();
        }
        for (c.a aVar : this.f3961a) {
            MenuAction menuAction = new MenuAction(aVar.f3932a, 0);
            menuCreateMenu.addAction(menuAction);
            this.c.put(menuAction, aVar);
        }
        menuCreateMenu.addAction(new MenuAction("", 1));
        menuCreateMenu.setListener(this);
        menuCreateMenu.present(context);
    }

    public void a(d.a aVar) {
        this.e = aVar;
    }

    public boolean b() {
        return this.d != null;
    }

    @Override // com.my.target.common.menu.Menu.Listener
    public void onActionClick(MenuAction menuAction) {
        d.a aVar;
        String str;
        if (menuAction.style == 1) {
            a();
            return;
        }
        WeakReference<Context> weakReference = this.f;
        if (weakReference == null) {
            ba.a("AdChoicesOptionsController: there is no context, can't process action click");
            return;
        }
        Context context = weakReference.get();
        if (context == null) {
            ba.a("AdChoicesOptionsController: there is no context, can't process action click");
            return;
        }
        Map<MenuAction, c.a> map = this.c;
        if (map == null) {
            str = "AdChoicesOptionsController: there are no associatedOptions, can't process action click";
        } else {
            c.a aVar2 = map.get(menuAction);
            if (aVar2 != null) {
                String str2 = aVar2.c;
                if (!TextUtils.isEmpty(str2)) {
                    w9.c(str2, context);
                }
                if (aVar2.b.equals("copy")) {
                    String str3 = aVar2.e;
                    if (str3 != null) {
                        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("copied id", str3));
                    }
                    a();
                    return;
                }
                String str4 = aVar2.d;
                if (!TextUtils.isEmpty(str4)) {
                    j3.a(str4, context);
                }
                if (aVar2.f && (aVar = this.e) != null) {
                    aVar.a(context);
                }
                a();
                return;
            }
            str = "AdChoicesOptionsController: can't obtain option by menu action.";
        }
        ba.a(str);
    }
}
