// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;

// #if WINAPI_FAMILY_PARTITION(WINAPI_PARTITION_APP)

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class FILE_BASIC_INFO extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FILE_BASIC_INFO() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FILE_BASIC_INFO(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FILE_BASIC_INFO(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FILE_BASIC_INFO position(long position) {
        return (FILE_BASIC_INFO)super.position(position);
    }

    public native @ByRef LARGE_INTEGER CreationTime(); public native FILE_BASIC_INFO CreationTime(LARGE_INTEGER setter);
    public native @ByRef LARGE_INTEGER LastAccessTime(); public native FILE_BASIC_INFO LastAccessTime(LARGE_INTEGER setter);
    public native @ByRef LARGE_INTEGER LastWriteTime(); public native FILE_BASIC_INFO LastWriteTime(LARGE_INTEGER setter);
    public native @ByRef LARGE_INTEGER ChangeTime(); public native FILE_BASIC_INFO ChangeTime(LARGE_INTEGER setter);
    public native @Cast("DWORD") int FileAttributes(); public native FILE_BASIC_INFO FileAttributes(int setter);
}
