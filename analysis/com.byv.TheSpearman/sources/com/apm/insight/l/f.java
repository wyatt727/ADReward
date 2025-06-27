package com.apm.insight.l;

import com.apm.insight.nativecrash.NativeImpl;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* loaded from: classes.dex */
public class f {
    public static File a(String str, int i, int i2) throws IOException {
        File file = new File(o.a(com.apm.insight.i.g(), str), "logcat.txt");
        if (file.exists() && file.length() > 0) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.a(file.getAbsolutePath(), String.valueOf(i), String.valueOf(i2));
        return file;
    }

    public static void a() {
        try {
            a(com.apm.insight.i.f(), com.apm.insight.i.i().getLogcatDumpCount(), com.apm.insight.i.i().getLogcatLevel());
            if (com.apm.insight.i.u()) {
                b();
                d();
                c();
                e();
            }
        } catch (Throwable unused) {
        }
    }

    public static File b() throws IOException {
        File file = new File(o.e(com.apm.insight.i.g()), "maps.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.f(file.getAbsolutePath());
        return file;
    }

    public static File c() throws IOException {
        File file = new File(o.e(com.apm.insight.i.g()), "meminfo.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.d(file.getAbsolutePath());
        return file;
    }

    public static File d() throws IOException {
        File file = new File(o.e(com.apm.insight.i.g()), "fds.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.e(file.getAbsolutePath());
        return file;
    }

    public static File e() throws IOException {
        File file = new File(o.e(com.apm.insight.i.g()), "threads.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.g(file.getAbsolutePath());
        return file;
    }

    public static File f() throws Throwable {
        BufferedWriter bufferedWriter;
        File file = new File(o.e(com.apm.insight.i.g()), "anr_trace.txt");
        if (file.exists() || !com.apm.insight.runtime.a.f()) {
            return file;
        }
        File file2 = new File("/data/anr/traces.txt");
        if (!file2.exists()) {
            return file;
        }
        BufferedReader bufferedReader = null;
        try {
            file.getParentFile().mkdirs();
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(file));
                int length = 0;
                do {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        bufferedWriter.write(line);
                        bufferedWriter.write(10);
                        length += line.length();
                    } catch (IOException unused) {
                        bufferedReader = bufferedReader2;
                        k.a(bufferedReader);
                        k.a(bufferedWriter);
                        return file;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        k.a(bufferedReader);
                        k.a(bufferedWriter);
                        throw th;
                    }
                } while (length < 1048576);
                k.a(bufferedReader2);
            } catch (IOException unused2) {
                bufferedWriter = null;
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = null;
            }
        } catch (IOException unused3) {
            bufferedWriter = null;
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter = null;
        }
        k.a(bufferedWriter);
        return file;
    }
}
