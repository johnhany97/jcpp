// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.macosx.*;

@Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class timespec extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public timespec() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public timespec(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public timespec(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public timespec position(long position) {
        return (timespec)super.position(position);
    }

	public native @Cast("__darwin_time_t") long tv_sec(); public native timespec tv_sec(long setter);
	public native long tv_nsec(); public native timespec tv_nsec(long setter);
}
