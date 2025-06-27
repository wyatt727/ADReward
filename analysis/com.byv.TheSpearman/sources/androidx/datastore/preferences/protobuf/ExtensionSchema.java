package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.FieldSet;
import androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
abstract class ExtensionSchema<T extends FieldSet.FieldDescriptorLite<T>> {
    abstract int extensionNumber(Map.Entry<?, ?> entry);

    abstract Object findExtensionByNumber(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i);

    abstract FieldSet<T> getExtensions(Object obj);

    abstract FieldSet<T> getMutableExtensions(Object obj);

    abstract boolean hasExtensions(MessageLite messageLite);

    abstract void makeImmutable(Object obj);

    abstract <UT, UB> UB parseExtension(Reader reader, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<T> fieldSet, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) throws IOException;

    abstract void parseLengthPrefixedMessageSetItem(Reader reader, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<T> fieldSet) throws IOException;

    abstract void parseMessageSetItem(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<T> fieldSet) throws IOException;

    abstract void serializeExtension(Writer writer, Map.Entry<?, ?> entry) throws IOException;

    abstract void setExtensions(Object obj, FieldSet<T> fieldSet);

    ExtensionSchema() {
    }
}
