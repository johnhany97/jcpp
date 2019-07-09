// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class JOBOBJECT_EXTENDED_LIMIT_INFORMATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public JOBOBJECT_EXTENDED_LIMIT_INFORMATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public JOBOBJECT_EXTENDED_LIMIT_INFORMATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public JOBOBJECT_EXTENDED_LIMIT_INFORMATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public JOBOBJECT_EXTENDED_LIMIT_INFORMATION position(long position) {
        return (JOBOBJECT_EXTENDED_LIMIT_INFORMATION)super.position(position);
    }

    public native @ByRef JOBOBJECT_BASIC_LIMIT_INFORMATION BasicLimitInformation(); public native JOBOBJECT_EXTENDED_LIMIT_INFORMATION BasicLimitInformation(JOBOBJECT_BASIC_LIMIT_INFORMATION setter);
    public native @ByRef IO_COUNTERS IoInfo(); public native JOBOBJECT_EXTENDED_LIMIT_INFORMATION IoInfo(IO_COUNTERS setter);
    public native @Cast("SIZE_T") long ProcessMemoryLimit(); public native JOBOBJECT_EXTENDED_LIMIT_INFORMATION ProcessMemoryLimit(long setter);
    public native @Cast("SIZE_T") long JobMemoryLimit(); public native JOBOBJECT_EXTENDED_LIMIT_INFORMATION JobMemoryLimit(long setter);
    public native @Cast("SIZE_T") long PeakProcessMemoryUsed(); public native JOBOBJECT_EXTENDED_LIMIT_INFORMATION PeakProcessMemoryUsed(long setter);
    public native @Cast("SIZE_T") long PeakJobMemoryUsed(); public native JOBOBJECT_EXTENDED_LIMIT_INFORMATION PeakJobMemoryUsed(long setter);
}
