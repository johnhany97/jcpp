// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class OVERLAPPED extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public OVERLAPPED() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OVERLAPPED(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OVERLAPPED(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public OVERLAPPED position(long position) {
        return (OVERLAPPED)super.position(position);
    }

    public native @Cast("ULONG_PTR") long Internal(); public native OVERLAPPED Internal(long setter);
    public native @Cast("ULONG_PTR") long InternalHigh(); public native OVERLAPPED InternalHigh(long setter);
            public native @Cast("DWORD") int Offset(); public native OVERLAPPED Offset(int setter);
            public native @Cast("DWORD") int OffsetHigh(); public native OVERLAPPED OffsetHigh(int setter); 
        public native @Cast("PVOID") Pointer Pointer(); public native OVERLAPPED Pointer(Pointer setter); 

    public native @Cast("HANDLE") Pointer hEvent(); public native OVERLAPPED hEvent(Pointer setter);
}
