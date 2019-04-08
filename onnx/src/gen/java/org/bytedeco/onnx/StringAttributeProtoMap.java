// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.onnx.global.onnx.*;

@Name("std::unordered_map<std::string,const onnx::AttributeProto*>") @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class StringAttributeProtoMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringAttributeProtoMap(Pointer p) { super(p); }
    public StringAttributeProtoMap()       { allocate();  }
    private native void allocate();
    public native @Name("operator=") @ByRef StringAttributeProtoMap put(@ByRef StringAttributeProtoMap x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native @Const AttributeProto get(@StdString BytePointer i);
    public native StringAttributeProtoMap put(@StdString BytePointer i, AttributeProto value);

    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator++") @ByRef Iterator increment();
        public native @Name("operator==") boolean equals(@ByRef Iterator it);
        public native @Name("operator*().first") @MemberGetter @StdString BytePointer first();
        public native @Name("operator*().second") @MemberGetter @Const AttributeProto second();
    }
}

