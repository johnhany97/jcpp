// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.macosx.*;

// #endif

// #if !defined(_POSIX_C_SOURCE) || defined(_DARWIN_C_SOURCE)
@Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class accessx_descriptor extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public accessx_descriptor() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public accessx_descriptor(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public accessx_descriptor(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public accessx_descriptor position(long position) {
        return (accessx_descriptor)super.position(position);
    }

	public native @Cast("unsigned int") int ad_name_offset(); public native accessx_descriptor ad_name_offset(int setter);
	public native int ad_flags(); public native accessx_descriptor ad_flags(int setter);
	public native int ad_pad(int i); public native accessx_descriptor ad_pad(int i, int setter);
	@MemberGetter public native IntPointer ad_pad();
}
