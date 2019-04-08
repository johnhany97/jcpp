// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuda.global.cudart.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class uint1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public uint1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public uint1(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public uint1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public uint1 position(long position) {
        return (uint1)super.position(position);
    }

    public native @Cast("unsigned int") int x(); public native uint1 x(int setter);
}
