// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpython.global.python.*;


// #ifndef Py_LIMITED_API
@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyCompilerFlags extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyCompilerFlags() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyCompilerFlags(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyCompilerFlags(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyCompilerFlags position(long position) {
        return (PyCompilerFlags)super.position(position);
    }

    public native int cf_flags(); public native PyCompilerFlags cf_flags(int setter);  /* bitmask of CO_xxx flags relevant to future */
}
