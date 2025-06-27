package org.objectweb.asm.commons;

import org.objectweb.asm.ModuleVisitor;

/* loaded from: classes5.dex */
public class ModuleRemapper extends ModuleVisitor {
    protected final Remapper remapper;

    public ModuleRemapper(ModuleVisitor moduleVisitor, Remapper remapper) {
        this(589824, moduleVisitor, remapper);
    }

    protected ModuleRemapper(int i, ModuleVisitor moduleVisitor, Remapper remapper) {
        super(i, moduleVisitor);
        this.remapper = remapper;
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitMainClass(String str) {
        super.visitMainClass(this.remapper.mapType(str));
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitPackage(String str) {
        super.visitPackage(this.remapper.mapPackageName(str));
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitRequire(String str, int i, String str2) {
        super.visitRequire(this.remapper.mapModuleName(str), i, str2);
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitExport(String str, int i, String... strArr) {
        String[] strArr2;
        if (strArr != null) {
            strArr2 = new String[strArr.length];
            for (int i2 = 0; i2 < strArr.length; i2++) {
                strArr2[i2] = this.remapper.mapModuleName(strArr[i2]);
            }
        } else {
            strArr2 = null;
        }
        super.visitExport(this.remapper.mapPackageName(str), i, strArr2);
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitOpen(String str, int i, String... strArr) {
        String[] strArr2;
        if (strArr != null) {
            strArr2 = new String[strArr.length];
            for (int i2 = 0; i2 < strArr.length; i2++) {
                strArr2[i2] = this.remapper.mapModuleName(strArr[i2]);
            }
        } else {
            strArr2 = null;
        }
        super.visitOpen(this.remapper.mapPackageName(str), i, strArr2);
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitUse(String str) {
        super.visitUse(this.remapper.mapType(str));
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitProvide(String str, String... strArr) {
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr2[i] = this.remapper.mapType(strArr[i]);
        }
        super.visitProvide(this.remapper.mapType(str), strArr2);
    }
}
