// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.numpy;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.cpython.*;
import static org.bytedeco.cpython.global.python.*;

import static org.bytedeco.numpy.global.numpy.*;



@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyUFunc_PyFuncData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyUFunc_PyFuncData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyUFunc_PyFuncData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyUFunc_PyFuncData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyUFunc_PyFuncData position(long position) {
        return (PyUFunc_PyFuncData)super.position(position);
    }

        public native int nin(); public native PyUFunc_PyFuncData nin(int setter);
        public native int nout(); public native PyUFunc_PyFuncData nout(int setter);
        public native PyObject callable(); public native PyUFunc_PyFuncData callable(PyObject setter);
}
