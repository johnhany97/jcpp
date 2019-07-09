// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.ale;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ale.global.ale.*;


/** A simple wrapper around the Atari RAM. */ 
@NoOffset @Properties(inherit = org.bytedeco.ale.presets.ale.class)
public class ALERAM extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ALERAM(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ALERAM(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ALERAM position(long position) {
        return (ALERAM)super.position(position);
    }

    public ALERAM() { super((Pointer)null); allocate(); }
    private native void allocate();
    public ALERAM(@Const @ByRef ALERAM rhs) { super((Pointer)null); allocate(rhs); }
    private native void allocate(@Const @ByRef ALERAM rhs);

    public native @ByRef @Name("operator =") ALERAM put(@Const @ByRef ALERAM rhs);

    /** Byte accessors */ 
    public native @Cast("byte_t") byte get(@Cast("unsigned int") int x);
    public native @Cast("byte_t*") @Name("byte") BytePointer _byte(@Cast("unsigned int") int x);
   
    /** Returns the whole array (equivalent to byte(0)). */
    public native @Cast("byte_t*") BytePointer array();

    public native @Cast("size_t") long size();
    /** Returns whether two copies of the RAM are equal */
    public native @Cast("bool") boolean equals(@Const @ByRef ALERAM rhs);
}
