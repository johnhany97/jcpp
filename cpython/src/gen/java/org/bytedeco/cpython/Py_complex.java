// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpython.global.python.*;

// #endif

// #ifndef Py_LIMITED_API
@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class Py_complex extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Py_complex() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Py_complex(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Py_complex(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Py_complex position(long position) {
        return (Py_complex)super.position(position);
    }

    public native double real(); public native Py_complex real(double setter);
    public native double imag(); public native Py_complex imag(double setter);
}
