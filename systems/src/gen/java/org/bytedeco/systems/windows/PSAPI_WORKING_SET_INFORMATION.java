// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PSAPI_WORKING_SET_INFORMATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PSAPI_WORKING_SET_INFORMATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PSAPI_WORKING_SET_INFORMATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PSAPI_WORKING_SET_INFORMATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PSAPI_WORKING_SET_INFORMATION position(long position) {
        return (PSAPI_WORKING_SET_INFORMATION)super.position(position);
    }

    public native @Cast("ULONG_PTR") long NumberOfEntries(); public native PSAPI_WORKING_SET_INFORMATION NumberOfEntries(long setter);
    public native @ByRef PSAPI_WORKING_SET_BLOCK WorkingSetInfo(int i); public native PSAPI_WORKING_SET_INFORMATION WorkingSetInfo(int i, PSAPI_WORKING_SET_BLOCK setter);
    @MemberGetter public native PSAPI_WORKING_SET_BLOCK WorkingSetInfo();
}
