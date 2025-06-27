package com.mbridge.msdk.foundation.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.controller.d;
import com.mbridge.msdk.foundation.same.b.e;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.ad;

/* compiled from: SharedPerferenceManager.java */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2749a = "a";
    private static a d;
    FastKV b;
    SharedPreferences c;
    private final boolean e;

    private a() {
        d.a();
        this.e = true;
    }

    public static synchronized a a() {
        if (d == null) {
            d = new a();
        }
        return d;
    }

    public final String a(String str) {
        try {
            Context contextC = c.m().c();
            if (contextC == null) {
                return null;
            }
            if (this.e && this.b == null) {
                try {
                    this.b = new FastKV.Builder(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_CONFIG), "mbridge").build();
                } catch (Exception unused) {
                    this.b = null;
                }
            }
            FastKV fastKV = this.b;
            if (fastKV != null) {
                try {
                    return fastKV.getString(str, "");
                } catch (Exception unused2) {
                    return "";
                }
            }
            if (this.c == null && contextC != null) {
                this.c = contextC.getSharedPreferences("mbridge", 0);
            }
            return this.c.getString(str, "");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final int a(String str, int i) {
        try {
            Context contextC = c.m().c();
            if (contextC == null) {
                return i;
            }
            if (this.e && this.b == null) {
                try {
                    this.b = new FastKV.Builder(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_CONFIG), "mbridge").build();
                } catch (Exception unused) {
                    this.b = null;
                }
            }
            FastKV fastKV = this.b;
            if (fastKV != null) {
                try {
                    return fastKV.getInt(str, i);
                } catch (Exception unused2) {
                    return i;
                }
            }
            if (this.c == null) {
                this.c = contextC.getSharedPreferences("mbridge", 0);
            }
            return this.c.getInt(str, i);
        } catch (Exception e) {
            e.printStackTrace();
            return i;
        }
    }

    public final Long b(String str) {
        try {
            Context contextC = c.m().c();
            if (contextC == null) {
                ad.b(f2749a, "context is null in get");
                return 0L;
            }
            if (this.e && this.b == null) {
                try {
                    this.b = new FastKV.Builder(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_CONFIG), "mbridge").build();
                } catch (Exception unused) {
                    this.b = null;
                }
            }
            FastKV fastKV = this.b;
            if (fastKV != null) {
                try {
                    return Long.valueOf(fastKV.getLong(str, 0L));
                } catch (Exception unused2) {
                    return 0L;
                }
            }
            if (this.c == null && contextC != null) {
                this.c = contextC.getSharedPreferences("mbridge", 0);
            }
            return Long.valueOf(this.c.getLong(str, 0L));
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }

    public final void a(String str, String str2) {
        try {
            Context contextC = c.m().c();
            if (contextC == null) {
                return;
            }
            if (this.e && this.b == null) {
                try {
                    this.b = new FastKV.Builder(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_CONFIG), "mbridge").build();
                } catch (Exception unused) {
                    this.b = null;
                }
            }
            FastKV fastKV = this.b;
            if (fastKV != null) {
                try {
                    fastKV.putString(str, str2);
                    return;
                } catch (Exception unused2) {
                    return;
                }
            }
            if (this.c == null && contextC != null) {
                this.c = contextC.getSharedPreferences("mbridge", 0);
            }
            SharedPreferences.Editor editorEdit = this.c.edit();
            editorEdit.putString(str, str2);
            editorEdit.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void b(String str, int i) {
        try {
            Context contextC = c.m().c();
            if (contextC == null) {
                return;
            }
            if (this.e && this.b == null) {
                try {
                    this.b = new FastKV.Builder(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_CONFIG), "mbridge").build();
                } catch (Exception unused) {
                    this.b = null;
                }
            }
            FastKV fastKV = this.b;
            if (fastKV != null) {
                try {
                    fastKV.putInt(str, i);
                    return;
                } catch (Exception unused2) {
                    return;
                }
            }
            if (this.c == null && contextC != null) {
                this.c = contextC.getSharedPreferences("mbridge", 0);
            }
            SharedPreferences.Editor editorEdit = this.c.edit();
            editorEdit.putInt(str, i);
            editorEdit.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void a(String str, long j) {
        try {
            Context contextC = c.m().c();
            if (contextC == null) {
                ad.b(f2749a, "context is null in put");
                return;
            }
            if (this.e && this.b == null) {
                try {
                    this.b = new FastKV.Builder(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_CONFIG), "mbridge").build();
                } catch (Exception unused) {
                    this.b = null;
                }
            }
            FastKV fastKV = this.b;
            if (fastKV != null) {
                try {
                    fastKV.putLong(str, j);
                    return;
                } catch (Exception unused2) {
                    return;
                }
            }
            if (this.c == null && contextC != null) {
                this.c = contextC.getSharedPreferences("mbridge", 0);
            }
            SharedPreferences.Editor editorEdit = this.c.edit();
            editorEdit.putLong(str, j);
            editorEdit.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void c(String str) {
        Context contextC = c.m().c();
        if (contextC == null) {
            return;
        }
        if (this.e && this.b == null) {
            try {
                this.b = new FastKV.Builder(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_CONFIG), "mbridge").build();
            } catch (Exception unused) {
                this.b = null;
            }
        }
        FastKV fastKV = this.b;
        if (fastKV != null) {
            try {
                fastKV.remove(str);
            } catch (Exception unused2) {
            }
        } else {
            if (this.c == null && contextC != null) {
                this.c = contextC.getSharedPreferences("mbridge", 0);
            }
            this.c.edit().remove(str).apply();
        }
    }
}
