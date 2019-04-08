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
 * Any object passed to PyArray_Broadcast must be binary compatible
 * with this structure.
 */

@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyArrayMultiIterObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyArrayMultiIterObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyArrayMultiIterObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyArrayMultiIterObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyArrayMultiIterObject position(long position) {
        return (PyArrayMultiIterObject)super.position(position);
    }

        public native @ByRef PyObject ob_base(); public native PyArrayMultiIterObject ob_base(PyObject setter);
        public native int numiter(); public native PyArrayMultiIterObject numiter(int setter);                 /* number of iters */
        public native @Cast("npy_intp") long size(); public native PyArrayMultiIterObject size(long setter);                    /* broadcasted size */
        public native @Cast("npy_intp") long index(); public native PyArrayMultiIterObject index(long setter);                   /* current index */
        public native int nd(); public native PyArrayMultiIterObject nd(int setter);                      /* number of dims */
        public native @Cast("npy_intp") long dimensions(int i); public native PyArrayMultiIterObject dimensions(int i, long setter);
        @MemberGetter public native @Cast("npy_intp*") SizeTPointer dimensions(); /* dimensions */
        public native PyArrayIterObject iters(int i); public native PyArrayMultiIterObject iters(int i, PyArrayIterObject setter);
        @MemberGetter public native @Cast("PyArrayIterObject**") PointerPointer iters();     /* iterators */
}
