// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


//
// Idle resiliency
//
@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class POWER_IDLE_RESILIENCY extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public POWER_IDLE_RESILIENCY() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public POWER_IDLE_RESILIENCY(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public POWER_IDLE_RESILIENCY(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public POWER_IDLE_RESILIENCY position(long position) {
        return (POWER_IDLE_RESILIENCY)super.position(position);
    }

    public native @Cast("DWORD") int CoalescingTimeout(); public native POWER_IDLE_RESILIENCY CoalescingTimeout(int setter);
    public native @Cast("DWORD") int IdleResiliencyPeriod(); public native POWER_IDLE_RESILIENCY IdleResiliencyPeriod(int setter);
}
