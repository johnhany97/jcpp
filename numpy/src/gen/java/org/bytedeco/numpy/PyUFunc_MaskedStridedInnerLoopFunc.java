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


/*
 * The most generic one-dimensional inner loop for
 * a masked standard element-wise ufunc. "Masked" here means that it skips
 * doing calculations on any items for which the maskptr array has a true
 * value.
 */
@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyUFunc_MaskedStridedInnerLoopFunc extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PyUFunc_MaskedStridedInnerLoopFunc(Pointer p) { super(p); }
    protected PyUFunc_MaskedStridedInnerLoopFunc() { allocate(); }
    private native void allocate();
    public native void call(
                @Cast("char**") @ByPtrPtr BytePointer dataptrs, @Cast("npy_intp*") SizeTPointer strides,
                @Cast("char*") BytePointer maskptr, @Cast("npy_intp") long mask_stride,
                @Cast("npy_intp") long count,
                NpyAuxData innerloopdata);
}
