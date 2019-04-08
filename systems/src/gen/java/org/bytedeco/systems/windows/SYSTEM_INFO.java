// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


// #if WINAPI_FAMILY_PARTITION(WINAPI_PARTITION_APP)

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class SYSTEM_INFO extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SYSTEM_INFO() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SYSTEM_INFO(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SYSTEM_INFO(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SYSTEM_INFO position(long position) {
        return (SYSTEM_INFO)super.position(position);
    }

        public native @Cast("DWORD") int dwOemId(); public native SYSTEM_INFO dwOemId(int setter);          // Obsolete field...do not use
            public native @Cast("WORD") short wProcessorArchitecture(); public native SYSTEM_INFO wProcessorArchitecture(short setter);
            public native @Cast("WORD") short wReserved(); public native SYSTEM_INFO wReserved(short setter);  
    public native @Cast("DWORD") int dwPageSize(); public native SYSTEM_INFO dwPageSize(int setter);
    public native @Cast("LPVOID") Pointer lpMinimumApplicationAddress(); public native SYSTEM_INFO lpMinimumApplicationAddress(Pointer setter);
    public native @Cast("LPVOID") Pointer lpMaximumApplicationAddress(); public native SYSTEM_INFO lpMaximumApplicationAddress(Pointer setter);
    public native @Cast("DWORD_PTR") long dwActiveProcessorMask(); public native SYSTEM_INFO dwActiveProcessorMask(long setter);
    public native @Cast("DWORD") int dwNumberOfProcessors(); public native SYSTEM_INFO dwNumberOfProcessors(int setter);
    public native @Cast("DWORD") int dwProcessorType(); public native SYSTEM_INFO dwProcessorType(int setter);
    public native @Cast("DWORD") int dwAllocationGranularity(); public native SYSTEM_INFO dwAllocationGranularity(int setter);
    public native @Cast("WORD") short wProcessorLevel(); public native SYSTEM_INFO wProcessorLevel(short setter);
    public native @Cast("WORD") short wProcessorRevision(); public native SYSTEM_INFO wProcessorRevision(short setter);
}
