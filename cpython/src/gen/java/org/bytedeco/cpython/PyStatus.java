// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;

// #endif

/* --- PyStatus ----------------------------------------------- */

@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyStatus extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyStatus() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyStatus(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyStatus(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyStatus position(long position) {
        return (PyStatus)super.position(position);
    }
    @Override public PyStatus getPointer(long i) {
        return new PyStatus((Pointer)this).offsetAddress(i);
    }

    /** enum PyStatus::_type */
    public static final int
        _PyStatus_TYPE_OK = 0,
        _PyStatus_TYPE_ERROR = 1,
        _PyStatus_TYPE_EXIT = 2;
    public native @Cast("const char*") BytePointer func(); public native PyStatus func(BytePointer setter);
    public native @Cast("const char*") BytePointer err_msg(); public native PyStatus err_msg(BytePointer setter);
    public native int exitcode(); public native PyStatus exitcode(int setter);
}
