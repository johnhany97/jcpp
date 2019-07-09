// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


// #ifdef UNICODE
// #endif  // !UNICODE

/***** Thread walking **************************************************/

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class THREADENTRY32 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public THREADENTRY32() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public THREADENTRY32(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public THREADENTRY32(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public THREADENTRY32 position(long position) {
        return (THREADENTRY32)super.position(position);
    }

    public native @Cast("DWORD") int dwSize(); public native THREADENTRY32 dwSize(int setter);
    public native @Cast("DWORD") int cntUsage(); public native THREADENTRY32 cntUsage(int setter);
    public native @Cast("DWORD") int th32ThreadID(); public native THREADENTRY32 th32ThreadID(int setter);       // this thread
    public native @Cast("DWORD") int th32OwnerProcessID(); public native THREADENTRY32 th32OwnerProcessID(int setter); // Process this thread is associated with
    public native @Cast("LONG") int tpBasePri(); public native THREADENTRY32 tpBasePri(int setter);
    public native @Cast("LONG") int tpDeltaPri(); public native THREADENTRY32 tpDeltaPri(int setter);
    public native @Cast("DWORD") int dwFlags(); public native THREADENTRY32 dwFlags(int setter);
}
