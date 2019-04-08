// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.macosx.*;


@Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class sigval extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public sigval() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public sigval(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sigval(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public sigval position(long position) {
        return (sigval)super.position(position);
    }

	/* Members as suggested by Annex C of POSIX 1003.1b. */
	public native int sival_int(); public native sigval sival_int(int setter);
	public native Pointer sival_ptr(); public native sigval sival_ptr(Pointer setter);
}
