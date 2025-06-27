package org.jacoco.core.internal.analysis.filter;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.LineNumberNode;
import org.objectweb.asm.tree.MethodNode;

/* loaded from: classes5.dex */
public final class KotlinInlineFilter implements IFilter {
    private int firstGeneratedLineNumber = -1;
    private static final Pattern LINE_INFO_PATTERN = Pattern.compile("([0-9]++)(#[0-9]++)?+(,[0-9]++)?+:([0-9]++)(,[0-9]++)?+");
    private static final Pattern FILE_INFO_PATTERN = Pattern.compile("\\+ ([0-9]++) (.++)");

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(MethodNode methodNode, IFilterContext iFilterContext, IFilterOutput iFilterOutput) {
        if (iFilterContext.getSourceDebugExtension() != null && KotlinGeneratedFilter.isKotlinClass(iFilterContext)) {
            if (this.firstGeneratedLineNumber == -1) {
                this.firstGeneratedLineNumber = getFirstGeneratedLineNumber(iFilterContext.getSourceFileName(), iFilterContext.getSourceDebugExtension());
            }
            int i = 0;
            Iterator<AbstractInsnNode> it = methodNode.instructions.iterator();
            while (it.hasNext()) {
                AbstractInsnNode next = it.next();
                if (15 == next.getType()) {
                    i = ((LineNumberNode) next).line;
                }
                if (i >= this.firstGeneratedLineNumber) {
                    iFilterOutput.ignore(next, next);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00da, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int getFirstGeneratedLineNumber(java.lang.String r8, java.lang.String r9) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.io.IOException -> Le3
            java.io.StringReader r1 = new java.io.StringReader     // Catch: java.io.IOException -> Le3
            r1.<init>(r9)     // Catch: java.io.IOException -> Le3
            r0.<init>(r1)     // Catch: java.io.IOException -> Le3
            java.lang.String r9 = "SMAP"
            expectLine(r0, r9)     // Catch: java.io.IOException -> Le3
            expectLine(r0, r8)     // Catch: java.io.IOException -> Le3
            java.lang.String r9 = "Kotlin"
            expectLine(r0, r9)     // Catch: java.io.IOException -> Le3
            java.lang.String r9 = "*S Kotlin"
            expectLine(r0, r9)     // Catch: java.io.IOException -> Le3
            java.lang.String r9 = "*F"
            expectLine(r0, r9)     // Catch: java.io.IOException -> Le3
            java.util.BitSet r9 = new java.util.BitSet     // Catch: java.io.IOException -> Le3
            r9.<init>()     // Catch: java.io.IOException -> Le3
        L26:
            java.lang.String r1 = "*L"
            java.lang.String r2 = r0.readLine()     // Catch: java.io.IOException -> Le3
            boolean r1 = r1.equals(r2)     // Catch: java.io.IOException -> Le3
            java.lang.String r3 = "Unexpected SMAP line: "
            r4 = 2
            r5 = 1
            if (r1 != 0) goto L70
            r0.readLine()     // Catch: java.io.IOException -> Le3
            java.util.regex.Pattern r1 = org.jacoco.core.internal.analysis.filter.KotlinInlineFilter.FILE_INFO_PATTERN     // Catch: java.io.IOException -> Le3
            java.util.regex.Matcher r1 = r1.matcher(r2)     // Catch: java.io.IOException -> Le3
            boolean r6 = r1.matches()     // Catch: java.io.IOException -> Le3
            if (r6 == 0) goto L5b
            java.lang.String r2 = r1.group(r4)     // Catch: java.io.IOException -> Le3
            boolean r2 = r2.equals(r8)     // Catch: java.io.IOException -> Le3
            if (r2 == 0) goto L26
            java.lang.String r1 = r1.group(r5)     // Catch: java.io.IOException -> Le3
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.io.IOException -> Le3
            r9.set(r1)     // Catch: java.io.IOException -> Le3
            goto L26
        L5b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.io.IOException -> Le3
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Le3
            r9.<init>()     // Catch: java.io.IOException -> Le3
            r9.append(r3)     // Catch: java.io.IOException -> Le3
            r9.append(r2)     // Catch: java.io.IOException -> Le3
            java.lang.String r9 = r9.toString()     // Catch: java.io.IOException -> Le3
            r8.<init>(r9)     // Catch: java.io.IOException -> Le3
            throw r8     // Catch: java.io.IOException -> Le3
        L70:
            boolean r8 = r9.isEmpty()     // Catch: java.io.IOException -> Le3
            if (r8 != 0) goto Ldb
            r8 = 2147483647(0x7fffffff, float:NaN)
        L79:
            java.lang.String r1 = r0.readLine()     // Catch: java.io.IOException -> Le3
            java.lang.String r2 = "*E"
            boolean r2 = r1.equals(r2)     // Catch: java.io.IOException -> Le3
            if (r2 != 0) goto Lda
            java.lang.String r2 = "*S KotlinDebug"
            boolean r2 = r1.equals(r2)     // Catch: java.io.IOException -> Le3
            if (r2 == 0) goto L8e
            goto Lda
        L8e:
            java.util.regex.Pattern r2 = org.jacoco.core.internal.analysis.filter.KotlinInlineFilter.LINE_INFO_PATTERN     // Catch: java.io.IOException -> Le3
            java.util.regex.Matcher r2 = r2.matcher(r1)     // Catch: java.io.IOException -> Le3
            boolean r6 = r2.matches()     // Catch: java.io.IOException -> Le3
            if (r6 == 0) goto Lc5
            java.lang.String r1 = r2.group(r5)     // Catch: java.io.IOException -> Le3
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.io.IOException -> Le3
            java.lang.String r6 = r2.group(r4)     // Catch: java.io.IOException -> Le3
            java.lang.String r6 = r6.substring(r5)     // Catch: java.io.IOException -> Le3
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.io.IOException -> Le3
            r7 = 4
            java.lang.String r2 = r2.group(r7)     // Catch: java.io.IOException -> Le3
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.io.IOException -> Le3
            boolean r6 = r9.get(r6)     // Catch: java.io.IOException -> Le3
            if (r6 == 0) goto Lc0
            if (r1 != r2) goto Lc0
            goto L79
        Lc0:
            int r8 = java.lang.Math.min(r2, r8)     // Catch: java.io.IOException -> Le3
            goto L79
        Lc5:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.io.IOException -> Le3
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Le3
            r9.<init>()     // Catch: java.io.IOException -> Le3
            r9.append(r3)     // Catch: java.io.IOException -> Le3
            r9.append(r1)     // Catch: java.io.IOException -> Le3
            java.lang.String r9 = r9.toString()     // Catch: java.io.IOException -> Le3
            r8.<init>(r9)     // Catch: java.io.IOException -> Le3
            throw r8     // Catch: java.io.IOException -> Le3
        Lda:
            return r8
        Ldb:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.io.IOException -> Le3
            java.lang.String r9 = "Unexpected SMAP FileSection"
            r8.<init>(r9)     // Catch: java.io.IOException -> Le3
            throw r8     // Catch: java.io.IOException -> Le3
        Le3:
            r8 = move-exception
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jacoco.core.internal.analysis.filter.KotlinInlineFilter.getFirstGeneratedLineNumber(java.lang.String, java.lang.String):int");
    }

    private static void expectLine(BufferedReader bufferedReader, String str) throws IOException {
        String line = bufferedReader.readLine();
        if (str.equals(line)) {
            return;
        }
        throw new IllegalStateException("Unexpected SMAP line: " + line);
    }
}
