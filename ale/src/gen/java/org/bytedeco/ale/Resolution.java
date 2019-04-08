// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.ale;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ale.global.ale.*;


@Properties(inherit = org.bytedeco.ale.presets.ale.class)
public class Resolution extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Resolution() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Resolution(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Resolution(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Resolution position(long position) {
        return (Resolution)super.position(position);
    }

  public native @Cast("uInt32") int width(); public native Resolution width(int setter);
  public native @Cast("uInt32") int height(); public native Resolution height(int setter);
  public native @StdString BytePointer name(); public native Resolution name(BytePointer setter);
}
