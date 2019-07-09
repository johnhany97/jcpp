// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpython.global.python.*;

// #endif

/*
Another generally useful object type is a tuple of object pointers.
For Python, this is an immutable type.  C code can change the tuple items
(but not their number), and even use tuples as general-purpose arrays of
object references, but in general only brand new tuples should be mutated,
not ones that might already have been exposed to Python code.

*** WARNING *** PyTuple_SetItem does not increment the new item's reference
count, but does decrement the reference count of the item it replaces,
if not nil.  It does *decrement* the reference count if it is *not*
inserted in the tuple.  Similarly, PyTuple_GetItem does not increment the
returned item's reference count.
*/

// #ifndef Py_LIMITED_API
@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyTupleObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyTupleObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyTupleObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyTupleObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyTupleObject position(long position) {
        return (PyTupleObject)super.position(position);
    }

    public native @ByRef PyVarObject ob_base(); public native PyTupleObject ob_base(PyVarObject setter);
    public native PyObject ob_item(int i); public native PyTupleObject ob_item(int i, PyObject setter);
    @MemberGetter public native @Cast("PyObject**") PointerPointer ob_item();

    /* ob_item contains space for 'ob_size' elements.
     * Items must normally not be NULL, except during construction when
     * the tuple is not yet visible outside the function that builds it.
     */
}
