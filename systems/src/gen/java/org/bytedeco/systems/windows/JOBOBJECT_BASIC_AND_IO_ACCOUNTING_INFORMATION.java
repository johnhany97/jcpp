// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class JOBOBJECT_BASIC_AND_IO_ACCOUNTING_INFORMATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public JOBOBJECT_BASIC_AND_IO_ACCOUNTING_INFORMATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public JOBOBJECT_BASIC_AND_IO_ACCOUNTING_INFORMATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public JOBOBJECT_BASIC_AND_IO_ACCOUNTING_INFORMATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public JOBOBJECT_BASIC_AND_IO_ACCOUNTING_INFORMATION position(long position) {
        return (JOBOBJECT_BASIC_AND_IO_ACCOUNTING_INFORMATION)super.position(position);
    }

    public native @ByRef JOBOBJECT_BASIC_ACCOUNTING_INFORMATION BasicInfo(); public native JOBOBJECT_BASIC_AND_IO_ACCOUNTING_INFORMATION BasicInfo(JOBOBJECT_BASIC_ACCOUNTING_INFORMATION setter);
    public native @ByRef IO_COUNTERS IoInfo(); public native JOBOBJECT_BASIC_AND_IO_ACCOUNTING_INFORMATION IoInfo(IO_COUNTERS setter);
}
