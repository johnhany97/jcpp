// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class POWER_SESSION_TIMEOUTS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public POWER_SESSION_TIMEOUTS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public POWER_SESSION_TIMEOUTS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public POWER_SESSION_TIMEOUTS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public POWER_SESSION_TIMEOUTS position(long position) {
        return (POWER_SESSION_TIMEOUTS)super.position(position);
    }

    public native @Cast("DWORD") int InputTimeout(); public native POWER_SESSION_TIMEOUTS InputTimeout(int setter);
    public native @Cast("DWORD") int DisplayTimeout(); public native POWER_SESSION_TIMEOUTS DisplayTimeout(int setter);
}
