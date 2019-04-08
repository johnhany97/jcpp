// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuda.global.cudart.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class longlong2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public longlong2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public longlong2(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public longlong2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public longlong2 position(long position) {
        return (longlong2)super.position(position);
    }

    public native long x(); public native longlong2 x(long setter);
    public native long y(); public native longlong2 y(long setter);
}
