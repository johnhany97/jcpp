// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class ASSEMBLY_FILE_DETAILED_INFORMATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ASSEMBLY_FILE_DETAILED_INFORMATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ASSEMBLY_FILE_DETAILED_INFORMATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ASSEMBLY_FILE_DETAILED_INFORMATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ASSEMBLY_FILE_DETAILED_INFORMATION position(long position) {
        return (ASSEMBLY_FILE_DETAILED_INFORMATION)super.position(position);
    }

    public native @Cast("DWORD") int ulFlags(); public native ASSEMBLY_FILE_DETAILED_INFORMATION ulFlags(int setter);
    public native @Cast("DWORD") int ulFilenameLength(); public native ASSEMBLY_FILE_DETAILED_INFORMATION ulFilenameLength(int setter);
    public native @Cast("DWORD") int ulPathLength(); public native ASSEMBLY_FILE_DETAILED_INFORMATION ulPathLength(int setter);

    public native @Cast("PCWSTR") CharPointer lpFileName(); public native ASSEMBLY_FILE_DETAILED_INFORMATION lpFileName(CharPointer setter);
    public native @Cast("PCWSTR") CharPointer lpFilePath(); public native ASSEMBLY_FILE_DETAILED_INFORMATION lpFilePath(CharPointer setter);
}
