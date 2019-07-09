// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class COMSTAT extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public COMSTAT() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public COMSTAT(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public COMSTAT(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public COMSTAT position(long position) {
        return (COMSTAT)super.position(position);
    }

    public native @Cast("DWORD") @NoOffset int fCtsHold(); public native COMSTAT fCtsHold(int setter);
    public native @Cast("DWORD") @NoOffset int fDsrHold(); public native COMSTAT fDsrHold(int setter);
    public native @Cast("DWORD") @NoOffset int fRlsdHold(); public native COMSTAT fRlsdHold(int setter);
    public native @Cast("DWORD") @NoOffset int fXoffHold(); public native COMSTAT fXoffHold(int setter);
    public native @Cast("DWORD") @NoOffset int fXoffSent(); public native COMSTAT fXoffSent(int setter);
    public native @Cast("DWORD") @NoOffset int fEof(); public native COMSTAT fEof(int setter);
    public native @Cast("DWORD") @NoOffset int fTxim(); public native COMSTAT fTxim(int setter);
    public native @Cast("DWORD") @NoOffset int fReserved(); public native COMSTAT fReserved(int setter);
    public native @Cast("DWORD") int cbInQue(); public native COMSTAT cbInQue(int setter);
    public native @Cast("DWORD") int cbOutQue(); public native COMSTAT cbOutQue(int setter);
}
