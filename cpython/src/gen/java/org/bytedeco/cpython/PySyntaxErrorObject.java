// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PySyntaxErrorObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PySyntaxErrorObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PySyntaxErrorObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PySyntaxErrorObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PySyntaxErrorObject position(long position) {
        return (PySyntaxErrorObject)super.position(position);
    }
    @Override public PySyntaxErrorObject getPointer(long i) {
        return new PySyntaxErrorObject((Pointer)this).offsetAddress(i);
    }

    public native @ByRef PyObject ob_base(); public native PySyntaxErrorObject ob_base(PyObject setter); public native PyObject dict(); public native PySyntaxErrorObject dict(PyObject setter);
             public native PyObject args(); public native PySyntaxErrorObject args(PyObject setter); public native PyObject traceback(); public native PySyntaxErrorObject traceback(PyObject setter);
             public native PyObject context(); public native PySyntaxErrorObject context(PyObject setter); public native PyObject cause(); public native PySyntaxErrorObject cause(PyObject setter);
             public native @Cast("char") byte suppress_context(); public native PySyntaxErrorObject suppress_context(byte setter);
    public native PyObject msg(); public native PySyntaxErrorObject msg(PyObject setter);
    public native PyObject filename(); public native PySyntaxErrorObject filename(PyObject setter);
    public native PyObject lineno(); public native PySyntaxErrorObject lineno(PyObject setter);
    public native PyObject offset(); public native PySyntaxErrorObject offset(PyObject setter);
    public native PyObject end_lineno(); public native PySyntaxErrorObject end_lineno(PyObject setter);
    public native PyObject end_offset(); public native PySyntaxErrorObject end_offset(PyObject setter);
    public native PyObject text(); public native PySyntaxErrorObject text(PyObject setter);
    public native PyObject print_file_and_line(); public native PySyntaxErrorObject print_file_and_line(PyObject setter);
}
