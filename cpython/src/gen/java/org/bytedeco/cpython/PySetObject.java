// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


/* The SetObject data structure is shared by set and frozenset objects.

Invariant for sets:
 - hash is -1

Invariants for frozensets:
 - data is immutable.
 - hash is the hash of the frozenset or -1 if not computed yet.

*/

@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PySetObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PySetObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PySetObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PySetObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PySetObject position(long position) {
        return (PySetObject)super.position(position);
    }
    @Override public PySetObject getPointer(long i) {
        return new PySetObject((Pointer)this).offsetAddress(i);
    }

    public native @ByRef PyObject ob_base(); public native PySetObject ob_base(PyObject setter);

    public native @Cast("Py_ssize_t") @Name("fill") long _fill(); public native PySetObject _fill(long setter);            /* Number active and dummy entries*/
    public native @Cast("Py_ssize_t") long used(); public native PySetObject used(long setter);            /* Number active entries */

    /* The table contains mask + 1 slots, and that's a power of 2.
     * We store the mask instead of the size because the mask is more
     * frequently needed.
     */
    public native @Cast("Py_ssize_t") long mask(); public native PySetObject mask(long setter);

    /* The table points to a fixed-size smalltable for small tables
     * or to additional malloc'ed memory for bigger tables.
     * The table pointer is never NULL which saves us from repeated
     * runtime null-tests.
     */
    public native setentry table(); public native PySetObject table(setentry setter);
    public native @Cast("Py_hash_t") long hash(); public native PySetObject hash(long setter);             /* Only used by frozenset objects */
    public native @Cast("Py_ssize_t") long finger(); public native PySetObject finger(long setter);          /* Search finger for pop() */

    public native @ByRef setentry smalltable(int i); public native PySetObject smalltable(int i, setentry setter);
    @MemberGetter public native setentry smalltable();
    public native PyObject weakreflist(); public native PySetObject weakreflist(PyObject setter);      /* List of weak references */
}
