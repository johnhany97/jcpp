// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TAPE_WRITE_MARKS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TAPE_WRITE_MARKS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TAPE_WRITE_MARKS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TAPE_WRITE_MARKS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TAPE_WRITE_MARKS position(long position) {
        return (TAPE_WRITE_MARKS)super.position(position);
    }

    public native @Cast("DWORD") int Type(); public native TAPE_WRITE_MARKS Type(int setter);
    public native @Cast("DWORD") int Count(); public native TAPE_WRITE_MARKS Count(int setter);
    public native @Cast("BOOLEAN") boolean Immediate(); public native TAPE_WRITE_MARKS Immediate(boolean setter);
}
