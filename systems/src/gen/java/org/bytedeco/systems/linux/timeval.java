// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.linux.*;


/* A time value that is accurate to the nearest
   microsecond but also has a range of years.  */
@Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class timeval extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public timeval() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public timeval(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public timeval(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public timeval position(long position) {
        return (timeval)super.position(position);
    }

    public native @Cast("__time_t") long tv_sec(); public native timeval tv_sec(long setter);		/* Seconds.  */
    public native @Cast("__suseconds_t") long tv_usec(); public native timeval tv_usec(long setter);	/* Microseconds.  */
  }
