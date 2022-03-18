// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


/* The ma_values pointer is NULL for a combined table
 * or points to an array of PyObject* for a split table
 */
@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyDictObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyDictObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyDictObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyDictObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyDictObject position(long position) {
        return (PyDictObject)super.position(position);
    }
    @Override public PyDictObject getPointer(long i) {
        return new PyDictObject((Pointer)this).offsetAddress(i);
    }

    public native @ByRef PyObject ob_base(); public native PyDictObject ob_base(PyObject setter);

    /* Number of items in the dictionary */
    public native @Cast("Py_ssize_t") long ma_used(); public native PyDictObject ma_used(long setter);

    /* Dictionary version: globally unique, value change each time
       the dictionary is modified */
    public native @Cast("uint64_t") long ma_version_tag(); public native PyDictObject ma_version_tag(long setter);

    public native PyDictKeysObject ma_keys(); public native PyDictObject ma_keys(PyDictKeysObject setter);

    /* If ma_values is NULL, the table is "combined": keys and values
       are stored in ma_keys.

       If ma_values is not NULL, the table is split:
       keys are stored in ma_keys and values are stored in ma_values */
    public native PyObject ma_values(int i); public native PyDictObject ma_values(int i, PyObject setter);
    public native @Cast("PyObject**") PointerPointer ma_values(); public native PyDictObject ma_values(PointerPointer setter);
}
