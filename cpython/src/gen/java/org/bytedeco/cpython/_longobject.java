// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpython.global.python.*;

// #endif

/* Long integer representation.
   The absolute value of a number is equal to
   	SUM(for i=0 through abs(ob_size)-1) ob_digit[i] * 2**(SHIFT*i)
   Negative numbers are represented with ob_size < 0;
   zero is represented by ob_size == 0.
   In a normalized number, ob_digit[abs(ob_size)-1] (the most significant
   digit) is never zero.  Also, in all cases, for all valid i,
   	0 <= ob_digit[i] <= MASK.
   The allocation function takes care of allocating extra memory
   so that ob_digit[0] ... ob_digit[abs(ob_size)-1] are actually available.

   CAUTION:  Generic code manipulating subtypes of PyVarObject has to
   aware that ints abuse  ob_size's sign bit.
*/

@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class _longobject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public _longobject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public _longobject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _longobject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public _longobject position(long position) {
        return (_longobject)super.position(position);
    }

	public native @ByRef PyVarObject ob_base(); public native _longobject ob_base(PyVarObject setter);
	public native @Cast("digit") int ob_digit(int i); public native _longobject ob_digit(int i, int setter);
	@MemberGetter public native @Cast("digit*") IntPointer ob_digit();
}
