package org.jacoco.core.internal.analysis.filter;

import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TryCatchBlockNode;
import org.objectweb.asm.tree.VarInsnNode;

/* loaded from: classes5.dex */
public final class FinallyFilter implements IFilter {
    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(MethodNode methodNode, IFilterContext iFilterContext, IFilterOutput iFilterOutput) {
        for (TryCatchBlockNode tryCatchBlockNode : methodNode.tryCatchBlocks) {
            if (tryCatchBlockNode.type == null) {
                filter(iFilterOutput, methodNode.tryCatchBlocks, tryCatchBlockNode);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void filter(org.jacoco.core.internal.analysis.filter.IFilterOutput r10, java.util.List<org.objectweb.asm.tree.TryCatchBlockNode> r11, org.objectweb.asm.tree.TryCatchBlockNode r12) {
        /*
            org.objectweb.asm.tree.LabelNode r0 = r12.handler
            org.objectweb.asm.tree.AbstractInsnNode r0 = next(r0)
            int r1 = size(r0)
            if (r1 > 0) goto Ld
            return
        Ld:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.Iterator r3 = r11.iterator()
        L16:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L36
            java.lang.Object r4 = r3.next()
            org.objectweb.asm.tree.TryCatchBlockNode r4 = (org.objectweb.asm.tree.TryCatchBlockNode) r4
            org.objectweb.asm.tree.LabelNode r5 = r4.handler
            org.objectweb.asm.tree.LabelNode r6 = r12.handler
            if (r5 != r6) goto L16
            org.objectweb.asm.tree.LabelNode r5 = r4.start
        L2a:
            org.objectweb.asm.tree.LabelNode r6 = r4.end
            if (r5 == r6) goto L16
            r2.add(r5)
            org.objectweb.asm.tree.AbstractInsnNode r5 = r5.getNext()
            goto L2a
        L36:
            java.util.Iterator r11 = r11.iterator()
        L3a:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto Lc9
            java.lang.Object r3 = r11.next()
            org.objectweb.asm.tree.TryCatchBlockNode r3 = (org.objectweb.asm.tree.TryCatchBlockNode) r3
            org.objectweb.asm.tree.LabelNode r4 = r3.handler
            org.objectweb.asm.tree.LabelNode r5 = r12.handler
            if (r4 != r5) goto La6
            org.objectweb.asm.tree.LabelNode r4 = r3.start
            r5 = 0
            r6 = r5
        L50:
            org.objectweb.asm.tree.LabelNode r7 = r3.end
            if (r4 == r7) goto L97
            int r7 = r4.getType()
            r8 = 7
            r9 = 1
            if (r7 == r8) goto L77
            r8 = 8
            if (r7 == r8) goto L92
            r8 = 14
            if (r7 == r8) goto L92
            r8 = 15
            if (r7 == r8) goto L92
            int r6 = r4.getOpcode()
            r7 = 191(0xbf, float:2.68E-43)
            if (r6 == r7) goto L75
            switch(r6) {
                case 172: goto L75;
                case 173: goto L75;
                case 174: goto L75;
                case 175: goto L75;
                case 176: goto L75;
                case 177: goto L75;
                default: goto L73;
            }
        L73:
            r6 = r9
            goto L92
        L75:
            r6 = r5
            goto L92
        L77:
            r6 = r4
            org.objectweb.asm.tree.JumpInsnNode r6 = (org.objectweb.asm.tree.JumpInsnNode) r6
            org.objectweb.asm.tree.LabelNode r6 = r6.label
            org.objectweb.asm.tree.AbstractInsnNode r6 = next(r6)
            boolean r7 = r2.contains(r6)
            if (r7 != 0) goto L89
            merge(r10, r1, r0, r6)
        L89:
            int r6 = r4.getOpcode()
            r7 = 167(0xa7, float:2.34E-43)
            if (r6 == r7) goto L75
            goto L73
        L92:
            org.objectweb.asm.tree.AbstractInsnNode r4 = r4.getNext()
            goto L50
        L97:
            org.objectweb.asm.tree.AbstractInsnNode r4 = next(r4)
            if (r6 == 0) goto La6
            boolean r5 = r2.contains(r4)
            if (r5 != 0) goto La6
            merge(r10, r1, r0, r4)
        La6:
            if (r3 == r12) goto L3a
            org.objectweb.asm.tree.LabelNode r4 = r3.start
            org.objectweb.asm.tree.LabelNode r5 = r12.start
            if (r4 != r5) goto L3a
            org.objectweb.asm.tree.LabelNode r4 = r3.end
            org.objectweb.asm.tree.LabelNode r5 = r12.end
            if (r4 != r5) goto L3a
            org.objectweb.asm.tree.LabelNode r3 = r3.handler
            org.objectweb.asm.tree.AbstractInsnNode r3 = next(r3)
            org.objectweb.asm.tree.AbstractInsnNode r3 = next(r3)
            boolean r4 = r2.contains(r3)
            if (r4 != 0) goto L3a
            merge(r10, r1, r0, r3)
            goto L3a
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jacoco.core.internal.analysis.filter.FinallyFilter.filter(org.jacoco.core.internal.analysis.filter.IFilterOutput, java.util.List, org.objectweb.asm.tree.TryCatchBlockNode):void");
    }

    private static void merge(IFilterOutput iFilterOutput, int i, AbstractInsnNode abstractInsnNode, AbstractInsnNode abstractInsnNode2) {
        if (isSame(i, abstractInsnNode, abstractInsnNode2)) {
            iFilterOutput.ignore(abstractInsnNode, abstractInsnNode);
            AbstractInsnNode next = next(abstractInsnNode);
            for (int i2 = 0; i2 < i; i2++) {
                iFilterOutput.merge(next, abstractInsnNode2);
                next = next(next);
                abstractInsnNode2 = next(abstractInsnNode2);
            }
            iFilterOutput.ignore(next, next(next));
            if (abstractInsnNode2 == null || abstractInsnNode2.getOpcode() != 167) {
                return;
            }
            iFilterOutput.ignore(abstractInsnNode2, abstractInsnNode2);
        }
    }

    private static boolean isSame(int i, AbstractInsnNode abstractInsnNode, AbstractInsnNode abstractInsnNode2) {
        AbstractInsnNode next = next(abstractInsnNode);
        for (int i2 = 0; i2 < i; i2++) {
            if (abstractInsnNode2 == null || next.getOpcode() != abstractInsnNode2.getOpcode()) {
                return false;
            }
            next = next(next);
            abstractInsnNode2 = next(abstractInsnNode2);
        }
        return true;
    }

    private static int size(AbstractInsnNode abstractInsnNode) {
        if (58 != abstractInsnNode.getOpcode()) {
            return 0;
        }
        int i = ((VarInsnNode) abstractInsnNode).var;
        int i2 = -1;
        while (true) {
            i2++;
            abstractInsnNode = next(abstractInsnNode);
            if (abstractInsnNode == null) {
                return 0;
            }
            if (25 == abstractInsnNode.getOpcode() && i == ((VarInsnNode) abstractInsnNode).var) {
                if (191 != next(abstractInsnNode).getOpcode()) {
                    return 0;
                }
                return i2;
            }
        }
    }

    private static AbstractInsnNode next(AbstractInsnNode abstractInsnNode) {
        while (true) {
            abstractInsnNode = abstractInsnNode.getNext();
            if (abstractInsnNode == null || (14 != abstractInsnNode.getType() && 8 != abstractInsnNode.getType() && 15 != abstractInsnNode.getType())) {
                break;
            }
        }
        return abstractInsnNode;
    }
}
