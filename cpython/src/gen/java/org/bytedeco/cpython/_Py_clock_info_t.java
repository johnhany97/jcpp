// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


/* Structure used by time.get_clock_info() */
@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class _Py_clock_info_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public _Py_clock_info_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public _Py_clock_info_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _Py_clock_info_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public _Py_clock_info_t position(long position) {
        return (_Py_clock_info_t)super.position(position);
    }
    @Override public _Py_clock_info_t getPointer(long i) {
        return new _Py_clock_info_t((Pointer)this).offsetAddress(i);
    }

    public native @Cast("const char*") BytePointer implementation(); public native _Py_clock_info_t implementation(BytePointer setter);
    public native int monotonic(); public native _Py_clock_info_t monotonic(int setter);
    public native int adjustable(); public native _Py_clock_info_t adjustable(int setter);
    public native double resolution(); public native _Py_clock_info_t resolution(double setter);
}
