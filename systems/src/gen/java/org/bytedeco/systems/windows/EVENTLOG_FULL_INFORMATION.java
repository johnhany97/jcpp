// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class EVENTLOG_FULL_INFORMATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public EVENTLOG_FULL_INFORMATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public EVENTLOG_FULL_INFORMATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EVENTLOG_FULL_INFORMATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public EVENTLOG_FULL_INFORMATION position(long position) {
        return (EVENTLOG_FULL_INFORMATION)super.position(position);
    }

    public native @Cast("DWORD") int dwFull(); public native EVENTLOG_FULL_INFORMATION dwFull(int setter);
}
