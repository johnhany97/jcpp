// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyWrapperDescrObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyWrapperDescrObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyWrapperDescrObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyWrapperDescrObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyWrapperDescrObject position(long position) {
        return (PyWrapperDescrObject)super.position(position);
    }
    @Override public PyWrapperDescrObject getPointer(long i) {
        return new PyWrapperDescrObject((Pointer)this).offsetAddress(i);
    }

    public native @ByRef PyDescrObject d_common(); public native PyWrapperDescrObject d_common(PyDescrObject setter);
    public native wrapperbase d_base(); public native PyWrapperDescrObject d_base(wrapperbase setter);
    public native Pointer d_wrapped(); public native PyWrapperDescrObject d_wrapped(Pointer setter); /* This can be any function pointer */
}
