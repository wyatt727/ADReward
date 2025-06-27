package com.bytedance.adsdk.EYQ.mZx.Pm;

import androidx.webkit.ProxyConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: Operator.java */
/* loaded from: classes2.dex */
public enum Td implements Kbd {
    QUESTION("?", 0),
    COLON(":", 0),
    DOUBLE_AMP("&&", 1),
    DOUBLE_BAR("||", 1),
    EQ("==", 2),
    GT(">", 2),
    LT("<", 2),
    LT_EQ("<=", 2),
    GT_EQ(">=", 2),
    NOT_EQ("!=", 2),
    PLUS("+", 3),
    MINUS("-", 3),
    MULTI(ProxyConfig.MATCH_ALL_SCHEMES, 4),
    DIVISION("/", 4),
    MOD("%", 4);

    private final String Uc;
    private final int hYh;
    private static final Map<String, Td> hu = new HashMap(128);
    private static final Set<Td> UB = new HashSet();

    static {
        for (Td td : values()) {
            hu.put(td.EYQ(), td);
            UB.add(td);
        }
    }

    Td(String str, int i) {
        this.Uc = str;
        this.hYh = i;
    }

    public static Td EYQ(String str) {
        return hu.get(str);
    }

    public static boolean EYQ(Kbd kbd) {
        return kbd instanceof Td;
    }

    public String EYQ() {
        return this.Uc;
    }

    public int mZx() {
        return this.hYh;
    }
}
