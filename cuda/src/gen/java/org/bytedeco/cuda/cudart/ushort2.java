// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuda.global.cudart.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class ushort2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ushort2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ushort2(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ushort2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ushort2 position(long position) {
        return (ushort2)super.position(position);
    }

    public native @Cast("unsigned short") short x(); public native ushort2 x(short setter);
    public native @Cast("unsigned short") short y(); public native ushort2 y(short setter);
}
