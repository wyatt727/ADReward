package org.objectweb.asm.tree.analysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.IincInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LookupSwitchInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TableSwitchInsnNode;
import org.objectweb.asm.tree.TryCatchBlockNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.objectweb.asm.tree.analysis.Value;

/* loaded from: classes5.dex */
public class Analyzer<V extends Value> implements Opcodes {
    private Frame<V>[] frames;
    private List<TryCatchBlockNode>[] handlers;
    private boolean[] inInstructionsToProcess;
    private InsnList insnList;
    private int insnListSize;
    private int[] instructionsToProcess;
    private final Interpreter<V> interpreter;
    private int numInstructionsToProcess;
    private Subroutine[] subroutines;

    protected void init(String str, MethodNode methodNode) throws AnalyzerException {
    }

    protected void newControlFlowEdge(int i, int i2) {
    }

    protected boolean newControlFlowExceptionEdge(int i, int i2) {
        return true;
    }

    public Analyzer(Interpreter<V> interpreter) {
        this.interpreter = interpreter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [org.objectweb.asm.tree.analysis.Analyzer, org.objectweb.asm.tree.analysis.Analyzer<V extends org.objectweb.asm.tree.analysis.Value>] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [int] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23, types: [int] */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2, types: [org.objectweb.asm.tree.analysis.Subroutine] */
    /* JADX WARN: Type inference failed for: r6v3, types: [org.objectweb.asm.tree.analysis.Subroutine] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public Frame<V>[] analyze(String str, MethodNode methodNode) throws AnalyzerException {
        AbstractInsnNode abstractInsnNode;
        AbstractInsnNode abstractInsnNode2;
        Type objectType;
        Subroutine subroutine;
        int i;
        Object obj;
        boolean z = false;
        if ((methodNode.access & 1280) != 0) {
            Frame<V>[] frameArr = new Frame[0];
            this.frames = frameArr;
            return frameArr;
        }
        InsnList insnList = methodNode.instructions;
        this.insnList = insnList;
        int size = insnList.size();
        this.insnListSize = size;
        this.handlers = new List[size];
        this.frames = new Frame[size];
        this.subroutines = new Subroutine[size];
        this.inInstructionsToProcess = new boolean[size];
        this.instructionsToProcess = new int[size];
        this.numInstructionsToProcess = 0;
        for (int i2 = 0; i2 < methodNode.tryCatchBlocks.size(); i2++) {
            TryCatchBlockNode tryCatchBlockNode = methodNode.tryCatchBlocks.get(i2);
            int iIndexOf = this.insnList.indexOf(tryCatchBlockNode.end);
            for (int iIndexOf2 = this.insnList.indexOf(tryCatchBlockNode.start); iIndexOf2 < iIndexOf; iIndexOf2++) {
                List<TryCatchBlockNode> arrayList = this.handlers[iIndexOf2];
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.handlers[iIndexOf2] = arrayList;
                }
                arrayList.add(tryCatchBlockNode);
            }
        }
        LabelNode labelNode = null;
        Subroutine subroutine2 = new Subroutine(null, methodNode.maxLocals, null);
        ArrayList arrayList2 = new ArrayList();
        findSubroutine(0, subroutine2, arrayList2);
        HashMap map = new HashMap();
        while (!arrayList2.isEmpty()) {
            JumpInsnNode jumpInsnNode = (JumpInsnNode) arrayList2.remove(0);
            Subroutine subroutine3 = (Subroutine) map.get(jumpInsnNode.label);
            if (subroutine3 == null) {
                Subroutine subroutine4 = new Subroutine(jumpInsnNode.label, methodNode.maxLocals, jumpInsnNode);
                map.put(jumpInsnNode.label, subroutine4);
                findSubroutine(this.insnList.indexOf(jumpInsnNode.label), subroutine4, arrayList2);
            } else {
                subroutine3.callers.add(jumpInsnNode);
            }
        }
        for (int i3 = 0; i3 < this.insnListSize; i3++) {
            Subroutine[] subroutineArr = this.subroutines;
            if (subroutineArr[i3] != null && subroutineArr[i3].start == null) {
                this.subroutines[i3] = null;
            }
        }
        Frame frameComputeInitialFrame = computeInitialFrame(str, methodNode);
        merge(0, frameComputeInitialFrame, null);
        init(str, methodNode);
        while (true) {
            int i4 = this.numInstructionsToProcess;
            if (i4 > 0) {
                int[] iArr = this.instructionsToProcess;
                int i5 = i4 - 1;
                this.numInstructionsToProcess = i5;
                int i6 = iArr[i5];
                Frame<V> frame = this.frames[i6];
                Subroutine subroutine5 = this.subroutines[i6];
                this.inInstructionsToProcess[i6] = z;
                try {
                    try {
                        abstractInsnNode2 = methodNode.instructions.get(i6);
                    } catch (AnalyzerException e) {
                        throw new AnalyzerException(e.node, "Error at instruction " + i6 + ": " + e.getMessage(), e);
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    abstractInsnNode = null;
                }
                try {
                    int opcode = abstractInsnNode2.getOpcode();
                    int type = abstractInsnNode2.getType();
                    if (type == 8 || type == 15 || type == 14) {
                        int i7 = i6 + 1;
                        merge(i7, frame, subroutine5);
                        newControlFlowEdge(i6, i7);
                    } else {
                        frameComputeInitialFrame.init(frame).execute(abstractInsnNode2, this.interpreter);
                        ?? subroutine6 = subroutine5 == null ? labelNode : new Subroutine(subroutine5);
                        if (abstractInsnNode2 instanceof JumpInsnNode) {
                            JumpInsnNode jumpInsnNode2 = (JumpInsnNode) abstractInsnNode2;
                            if (opcode != 167 && opcode != 168) {
                                frameComputeInitialFrame.initJumpTarget(opcode, labelNode);
                                int i8 = i6 + 1;
                                merge(i8, frameComputeInitialFrame, subroutine6);
                                newControlFlowEdge(i6, i8);
                            }
                            int iIndexOf3 = this.insnList.indexOf(jumpInsnNode2.label);
                            frameComputeInitialFrame.initJumpTarget(opcode, jumpInsnNode2.label);
                            if (opcode == 168) {
                                merge(iIndexOf3, frameComputeInitialFrame, new Subroutine(jumpInsnNode2.label, methodNode.maxLocals, jumpInsnNode2));
                            } else {
                                merge(iIndexOf3, frameComputeInitialFrame, subroutine6);
                            }
                            newControlFlowEdge(i6, iIndexOf3);
                        } else if (abstractInsnNode2 instanceof LookupSwitchInsnNode) {
                            LookupSwitchInsnNode lookupSwitchInsnNode = (LookupSwitchInsnNode) abstractInsnNode2;
                            int iIndexOf4 = this.insnList.indexOf(lookupSwitchInsnNode.dflt);
                            frameComputeInitialFrame.initJumpTarget(opcode, lookupSwitchInsnNode.dflt);
                            merge(iIndexOf4, frameComputeInitialFrame, subroutine6);
                            newControlFlowEdge(i6, iIndexOf4);
                            for (?? r3 = z; r3 < lookupSwitchInsnNode.labels.size(); r3++) {
                                LabelNode labelNode2 = lookupSwitchInsnNode.labels.get(r3);
                                int iIndexOf5 = this.insnList.indexOf(labelNode2);
                                frameComputeInitialFrame.initJumpTarget(opcode, labelNode2);
                                merge(iIndexOf5, frameComputeInitialFrame, subroutine6);
                                newControlFlowEdge(i6, iIndexOf5);
                            }
                        } else if (abstractInsnNode2 instanceof TableSwitchInsnNode) {
                            TableSwitchInsnNode tableSwitchInsnNode = (TableSwitchInsnNode) abstractInsnNode2;
                            int iIndexOf6 = this.insnList.indexOf(tableSwitchInsnNode.dflt);
                            frameComputeInitialFrame.initJumpTarget(opcode, tableSwitchInsnNode.dflt);
                            merge(iIndexOf6, frameComputeInitialFrame, subroutine6);
                            newControlFlowEdge(i6, iIndexOf6);
                            for (?? r32 = z; r32 < tableSwitchInsnNode.labels.size(); r32++) {
                                LabelNode labelNode3 = tableSwitchInsnNode.labels.get(r32);
                                frameComputeInitialFrame.initJumpTarget(opcode, labelNode3);
                                int iIndexOf7 = this.insnList.indexOf(labelNode3);
                                merge(iIndexOf7, frameComputeInitialFrame, subroutine6);
                                newControlFlowEdge(i6, iIndexOf7);
                            }
                        } else if (opcode != 169) {
                            subroutine = subroutine6;
                            if (opcode != 191 && (opcode < 172 || opcode > 177)) {
                                if (subroutine != null) {
                                    if (abstractInsnNode2 instanceof VarInsnNode) {
                                        int i9 = ((VarInsnNode) abstractInsnNode2).var;
                                        subroutine.localsUsed[i9] = true;
                                        if (opcode == 22 || opcode == 24 || opcode == 55 || opcode == 57) {
                                            subroutine.localsUsed[i9 + 1] = true;
                                        }
                                    } else if (abstractInsnNode2 instanceof IincInsnNode) {
                                        subroutine.localsUsed[((IincInsnNode) abstractInsnNode2).var] = true;
                                    }
                                }
                                int i10 = i6 + 1;
                                merge(i10, frameComputeInitialFrame, subroutine);
                                newControlFlowEdge(i6, i10);
                            }
                            subroutine5 = subroutine;
                        } else {
                            if (subroutine6 == 0) {
                                throw new AnalyzerException(abstractInsnNode2, "RET instruction outside of a subroutine");
                            }
                            ?? r5 = z;
                            subroutine6 = subroutine6;
                            while (r5 < subroutine6.callers.size()) {
                                int iIndexOf8 = this.insnList.indexOf(subroutine6.callers.get(r5));
                                Frame<V>[] frameArr2 = this.frames;
                                if (frameArr2[iIndexOf8] != null) {
                                    int i11 = iIndexOf8 + 1;
                                    i = r5;
                                    obj = subroutine6;
                                    merge(i11, frameArr2[iIndexOf8], frameComputeInitialFrame, this.subroutines[iIndexOf8], subroutine6.localsUsed);
                                    newControlFlowEdge(i6, i11);
                                } else {
                                    i = r5;
                                    obj = subroutine6;
                                }
                                subroutine6 = obj;
                                r5 = i + 1;
                            }
                        }
                        subroutine = subroutine6;
                        subroutine5 = subroutine;
                    }
                    List<TryCatchBlockNode> list = this.handlers[i6];
                    if (list != null) {
                        for (TryCatchBlockNode tryCatchBlockNode2 : list) {
                            if (tryCatchBlockNode2.type == null) {
                                objectType = Type.getObjectType("java/lang/Throwable");
                            } else {
                                objectType = Type.getObjectType(tryCatchBlockNode2.type);
                            }
                            if (newControlFlowExceptionEdge(i6, tryCatchBlockNode2)) {
                                Frame<V> frameNewFrame = newFrame(frame);
                                frameNewFrame.clearStack();
                                frameNewFrame.push(this.interpreter.newExceptionValue(tryCatchBlockNode2, frameNewFrame, objectType));
                                merge(this.insnList.indexOf(tryCatchBlockNode2.handler), frameNewFrame, subroutine5);
                            }
                        }
                    }
                    z = false;
                    labelNode = null;
                } catch (RuntimeException e3) {
                    e = e3;
                    abstractInsnNode = abstractInsnNode2;
                    throw new AnalyzerException(abstractInsnNode, "Error at instruction " + i6 + ": " + e.getMessage(), e);
                }
            } else {
                return this.frames;
            }
        }
    }

    public Frame<V>[] analyzeAndComputeMaxs(String str, MethodNode methodNode) throws AnalyzerException {
        methodNode.maxLocals = computeMaxLocals(methodNode);
        methodNode.maxStack = -1;
        analyze(str, methodNode);
        methodNode.maxStack = computeMaxStack(this.frames);
        return this.frames;
    }

    private static int computeMaxLocals(MethodNode methodNode) {
        int argumentsAndReturnSizes = Type.getArgumentsAndReturnSizes(methodNode.desc) >> 2;
        Iterator<AbstractInsnNode> it = methodNode.instructions.iterator();
        while (it.hasNext()) {
            AbstractInsnNode next = it.next();
            if (next instanceof VarInsnNode) {
                argumentsAndReturnSizes = Math.max(argumentsAndReturnSizes, ((VarInsnNode) next).var + ((next.getOpcode() == 22 || next.getOpcode() == 24 || next.getOpcode() == 55 || next.getOpcode() == 57) ? 2 : 1));
            } else if (next instanceof IincInsnNode) {
                argumentsAndReturnSizes = Math.max(argumentsAndReturnSizes, ((IincInsnNode) next).var + 1);
            }
        }
        return argumentsAndReturnSizes;
    }

    private static int computeMaxStack(Frame<?>[] frameArr) {
        int iMax = 0;
        for (Frame<?> frame : frameArr) {
            if (frame != null) {
                int size = 0;
                for (int i = 0; i < frame.getStackSize(); i++) {
                    size += frame.getStack(i).getSize();
                }
                iMax = Math.max(iMax, size);
            }
        }
        return iMax;
    }

    private void findSubroutine(int i, Subroutine subroutine, List<AbstractInsnNode> list) throws AnalyzerException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i));
        while (!arrayList.isEmpty()) {
            int iIntValue = ((Integer) arrayList.remove(arrayList.size() - 1)).intValue();
            if (iIntValue < 0 || iIntValue >= this.insnListSize) {
                throw new AnalyzerException(null, "Execution can fall off the end of the code");
            }
            Subroutine[] subroutineArr = this.subroutines;
            if (subroutineArr[iIntValue] == null) {
                subroutineArr[iIntValue] = new Subroutine(subroutine);
                AbstractInsnNode abstractInsnNode = this.insnList.get(iIntValue);
                if (abstractInsnNode instanceof JumpInsnNode) {
                    if (abstractInsnNode.getOpcode() == 168) {
                        list.add(abstractInsnNode);
                    } else {
                        arrayList.add(Integer.valueOf(this.insnList.indexOf(((JumpInsnNode) abstractInsnNode).label)));
                    }
                } else if (abstractInsnNode instanceof TableSwitchInsnNode) {
                    TableSwitchInsnNode tableSwitchInsnNode = (TableSwitchInsnNode) abstractInsnNode;
                    findSubroutine(this.insnList.indexOf(tableSwitchInsnNode.dflt), subroutine, list);
                    for (int size = tableSwitchInsnNode.labels.size() - 1; size >= 0; size--) {
                        arrayList.add(Integer.valueOf(this.insnList.indexOf(tableSwitchInsnNode.labels.get(size))));
                    }
                } else if (abstractInsnNode instanceof LookupSwitchInsnNode) {
                    LookupSwitchInsnNode lookupSwitchInsnNode = (LookupSwitchInsnNode) abstractInsnNode;
                    findSubroutine(this.insnList.indexOf(lookupSwitchInsnNode.dflt), subroutine, list);
                    for (int size2 = lookupSwitchInsnNode.labels.size() - 1; size2 >= 0; size2--) {
                        arrayList.add(Integer.valueOf(this.insnList.indexOf(lookupSwitchInsnNode.labels.get(size2))));
                    }
                }
                List<TryCatchBlockNode> list2 = this.handlers[iIntValue];
                if (list2 != null) {
                    Iterator<TryCatchBlockNode> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(this.insnList.indexOf(it.next().handler)));
                    }
                }
                int opcode = abstractInsnNode.getOpcode();
                if (opcode != 167 && opcode != 191) {
                    switch (opcode) {
                        case Opcodes.RET /* 169 */:
                        case Opcodes.TABLESWITCH /* 170 */:
                        case Opcodes.LOOKUPSWITCH /* 171 */:
                        case 172:
                        case Opcodes.LRETURN /* 173 */:
                        case Opcodes.FRETURN /* 174 */:
                        case Opcodes.DRETURN /* 175 */:
                        case Opcodes.ARETURN /* 176 */:
                        case Opcodes.RETURN /* 177 */:
                            break;
                        default:
                            arrayList.add(Integer.valueOf(iIntValue + 1));
                            break;
                    }
                }
            }
        }
    }

    private Frame<V> computeInitialFrame(String str, MethodNode methodNode) {
        Frame<V> frameNewFrame = newFrame(methodNode.maxLocals, methodNode.maxStack);
        int i = 1;
        boolean z = (methodNode.access & 8) == 0;
        if (z) {
            frameNewFrame.setLocal(0, this.interpreter.newParameterValue(z, 0, Type.getObjectType(str)));
        } else {
            i = 0;
        }
        for (Type type : Type.getArgumentTypes(methodNode.desc)) {
            frameNewFrame.setLocal(i, this.interpreter.newParameterValue(z, i, type));
            i++;
            if (type.getSize() == 2) {
                frameNewFrame.setLocal(i, this.interpreter.newEmptyValue(i));
                i++;
            }
        }
        while (i < methodNode.maxLocals) {
            frameNewFrame.setLocal(i, this.interpreter.newEmptyValue(i));
            i++;
        }
        frameNewFrame.setReturn(this.interpreter.newReturnTypeValue(Type.getReturnType(methodNode.desc)));
        return frameNewFrame;
    }

    public Frame<V>[] getFrames() {
        return this.frames;
    }

    public List<TryCatchBlockNode> getHandlers(int i) {
        return this.handlers[i];
    }

    protected Frame<V> newFrame(int i, int i2) {
        return new Frame<>(i, i2);
    }

    protected Frame<V> newFrame(Frame<? extends V> frame) {
        return new Frame<>(frame);
    }

    protected boolean newControlFlowExceptionEdge(int i, TryCatchBlockNode tryCatchBlockNode) {
        return newControlFlowExceptionEdge(i, this.insnList.indexOf(tryCatchBlockNode.handler));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void merge(int i, Frame<V> frame, Subroutine subroutine) throws AnalyzerException {
        boolean zMerge;
        Frame<V>[] frameArr = this.frames;
        Frame<V> frame2 = frameArr[i];
        if (frame2 == null) {
            frameArr[i] = newFrame(frame);
            zMerge = true;
        } else {
            zMerge = frame2.merge(frame, this.interpreter);
        }
        Subroutine[] subroutineArr = this.subroutines;
        Subroutine subroutine2 = subroutineArr[i];
        if (subroutine2 == null) {
            if (subroutine != null) {
                subroutineArr[i] = new Subroutine(subroutine);
                zMerge = true;
            }
        } else if (subroutine != null) {
            zMerge |= subroutine2.merge(subroutine);
        }
        if (zMerge) {
            boolean[] zArr = this.inInstructionsToProcess;
            if (zArr[i]) {
                return;
            }
            zArr[i] = true;
            int[] iArr = this.instructionsToProcess;
            int i2 = this.numInstructionsToProcess;
            this.numInstructionsToProcess = i2 + 1;
            iArr[i2] = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void merge(int i, Frame<V> frame, Frame<V> frame2, Subroutine subroutine, boolean[] zArr) throws AnalyzerException {
        boolean zMerge;
        frame2.merge(frame, zArr);
        Frame<V>[] frameArr = this.frames;
        Frame<V> frame3 = frameArr[i];
        if (frame3 == null) {
            frameArr[i] = newFrame(frame2);
            zMerge = true;
        } else {
            zMerge = frame3.merge(frame2, this.interpreter);
        }
        Subroutine subroutine2 = this.subroutines[i];
        if (subroutine2 != null && subroutine != null) {
            zMerge |= subroutine2.merge(subroutine);
        }
        if (zMerge) {
            boolean[] zArr2 = this.inInstructionsToProcess;
            if (zArr2[i]) {
                return;
            }
            zArr2[i] = true;
            int[] iArr = this.instructionsToProcess;
            int i2 = this.numInstructionsToProcess;
            this.numInstructionsToProcess = i2 + 1;
            iArr[i2] = i;
        }
    }
}
