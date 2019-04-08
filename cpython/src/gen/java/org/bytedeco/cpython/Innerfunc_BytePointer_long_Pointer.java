// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpython.global.python.*;


// #ifndef Py_LIMITED_API
@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class Innerfunc_BytePointer_long_Pointer extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Innerfunc_BytePointer_long_Pointer(Pointer p) { super(p); }
    protected Innerfunc_BytePointer_long_Pointer() { allocate(); }
    private native void allocate();
    public native PyObject call(@Cast("const char*") BytePointer arg0, @Cast("Py_ssize_t") long arg1, Pointer arg2);
}
