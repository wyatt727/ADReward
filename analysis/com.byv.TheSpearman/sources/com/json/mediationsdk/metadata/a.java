package com.json.mediationsdk.metadata;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1972a = "do_not_sell";
    public static final String b = "is_child_directed";
    public static final String c = "is_deviceid_optout";
    public static final String d = "google_family_self_certified_sdks";
    public static final String e = "iiqf";
    public static final String f = "is_test_suite";
    public static final String g = "true";
    protected static final String h = "false";
    public static final String i = "enable";
    static final Set<String> j;
    static final Set<String> k;
    static final Set<String> l;
    public static final int m = 2048;

    static {
        HashSet hashSet = new HashSet(Arrays.asList(b, c, f, d, e));
        j = hashSet;
        k = new HashSet(Arrays.asList(c, d, f, e));
        HashSet hashSet2 = new HashSet(hashSet);
        l = hashSet2;
        hashSet2.add(f1972a);
    }
}
