// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class setentry extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public setentry() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public setentry(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public setentry(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public setentry position(long position) {
        return (setentry)super.position(position);
    }
    @Override public setentry getPointer(long i) {
        return new setentry((Pointer)this).offsetAddress(i);
    }

    public native PyObject key(); public native setentry key(PyObject setter);
    public native @Cast("Py_hash_t") long hash(); public native setentry hash(long setter);             /* Cached hash code of the key */
}
