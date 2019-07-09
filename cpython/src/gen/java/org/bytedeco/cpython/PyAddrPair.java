// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpython.global.python.*;


/* for internal use only */
@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyAddrPair extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyAddrPair() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyAddrPair(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyAddrPair(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyAddrPair position(long position) {
        return (PyAddrPair)super.position(position);
    }

        public native int ap_lower(); public native PyAddrPair ap_lower(int setter);
        public native int ap_upper(); public native PyAddrPair ap_upper(int setter);
}
