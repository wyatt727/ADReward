package com.google.android.gms.dynamite;

import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes2.dex */
final class zzi implements DynamiteModule.VersionPolicy {
    zzi() {
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectModule(android.content.Context r3, java.lang.String r4, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions r5) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            r2 = this;
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult r0 = new com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult
            r0.<init>()
            int r1 = r5.zza(r3, r4)
            r0.localVersion = r1
            r1 = 1
            int r3 = r5.zzb(r3, r4, r1)
            r0.remoteVersion = r3
            int r4 = r0.localVersion
            r5 = 0
            if (r4 != 0) goto L1c
            if (r3 != 0) goto L1b
            r1 = r5
            goto L1f
        L1b:
            r4 = r5
        L1c:
            if (r4 < r3) goto L1f
            r1 = -1
        L1f:
            r0.selection = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.zzi.selectModule(android.content.Context, java.lang.String, com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$IVersions):com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult");
    }
}
