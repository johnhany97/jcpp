// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PPM_IDLE_ACCOUNTING extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PPM_IDLE_ACCOUNTING() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PPM_IDLE_ACCOUNTING(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PPM_IDLE_ACCOUNTING(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PPM_IDLE_ACCOUNTING position(long position) {
        return (PPM_IDLE_ACCOUNTING)super.position(position);
    }

    public native @Cast("DWORD") int StateCount(); public native PPM_IDLE_ACCOUNTING StateCount(int setter);
    public native @Cast("DWORD") int TotalTransitions(); public native PPM_IDLE_ACCOUNTING TotalTransitions(int setter);
    public native @Cast("DWORD") int ResetCount(); public native PPM_IDLE_ACCOUNTING ResetCount(int setter);
    public native @Cast("DWORD64") long StartTime(); public native PPM_IDLE_ACCOUNTING StartTime(long setter);
    public native @ByRef PPM_IDLE_STATE_ACCOUNTING State(int i); public native PPM_IDLE_ACCOUNTING State(int i, PPM_IDLE_STATE_ACCOUNTING setter);
    @MemberGetter public native PPM_IDLE_STATE_ACCOUNTING State();
}
