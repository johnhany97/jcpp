// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;

@Name("std::unordered_map<std::string,void*>") @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class StringVoidMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringVoidMap(Pointer p) { super(p); }
    public StringVoidMap()       { allocate();  }
    private native void allocate();
    public native @Name("operator=") @ByRef StringVoidMap put(@ByRef StringVoidMap x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native Pointer get(@StdString BytePointer i);
    public native StringVoidMap put(@StdString BytePointer i, Pointer value);

    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator++") @ByRef Iterator increment();
        public native @Name("operator==") boolean equals(@ByRef Iterator it);
        public native @Name("operator*().first") @MemberGetter @StdString BytePointer first();
        public native @Name("operator*().second") @MemberGetter @Const Pointer second();
    }
}

