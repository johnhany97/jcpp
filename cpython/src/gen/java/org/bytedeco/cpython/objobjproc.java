// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpython.global.python.*;


/* End buffer interface */
// #endif /* Py_LIMITED_API */

@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class objobjproc extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    objobjproc(Pointer p) { super(p); }
    protected objobjproc() { allocate(); }
    private native void allocate();
    public native int call(PyObject arg0, PyObject arg1);
}
