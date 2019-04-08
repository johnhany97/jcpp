// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuda.global.cudart.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class float4 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public float4() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public float4(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public float4(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public float4 position(long position) {
        return (float4)super.position(position);
    }

    public native float x(); public native float4 x(float setter);
    public native float y(); public native float4 y(float setter);
    public native float z(); public native float4 z(float setter);
    public native float w(); public native float4 w(float setter);
}
