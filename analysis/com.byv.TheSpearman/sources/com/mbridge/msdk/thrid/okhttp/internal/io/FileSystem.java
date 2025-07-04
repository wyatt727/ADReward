package com.mbridge.msdk.thrid.okhttp.internal.io;

import com.mbridge.msdk.thrid.okio.Okio;
import com.mbridge.msdk.thrid.okio.Sink;
import com.mbridge.msdk.thrid.okio.Source;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes4.dex */
public interface FileSystem {
    public static final FileSystem SYSTEM = new FileSystem() { // from class: com.mbridge.msdk.thrid.okhttp.internal.io.FileSystem.1
        @Override // com.mbridge.msdk.thrid.okhttp.internal.io.FileSystem
        public Source source(File file) throws FileNotFoundException {
            return Okio.source(file);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.io.FileSystem
        public Sink sink(File file) throws FileNotFoundException {
            try {
                return Okio.sink(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return Okio.sink(file);
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.io.FileSystem
        public Sink appendingSink(File file) throws FileNotFoundException {
            try {
                return Okio.appendingSink(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return Okio.appendingSink(file);
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.io.FileSystem
        public void delete(File file) throws IOException {
            if (file.delete() || !file.exists()) {
                return;
            }
            throw new IOException("failed to delete " + file);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.io.FileSystem
        public boolean exists(File file) {
            return file.exists();
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.io.FileSystem
        public long size(File file) {
            return file.length();
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.io.FileSystem
        public void rename(File file, File file2) throws IOException {
            delete(file2);
            if (file.renameTo(file2)) {
                return;
            }
            throw new IOException("failed to rename " + file + " to " + file2);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.io.FileSystem
        public void deleteContents(File file) throws IOException {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                throw new IOException("not a readable directory: " + file);
            }
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    deleteContents(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete " + file2);
                }
            }
        }
    };

    Sink appendingSink(File file) throws FileNotFoundException;

    void delete(File file) throws IOException;

    void deleteContents(File file) throws IOException;

    boolean exists(File file);

    void rename(File file, File file2) throws IOException;

    Sink sink(File file) throws FileNotFoundException;

    long size(File file);

    Source source(File file) throws FileNotFoundException;
}
