// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class FILE_RENAME_INFO extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FILE_RENAME_INFO() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FILE_RENAME_INFO(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FILE_RENAME_INFO(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FILE_RENAME_INFO position(long position) {
        return (FILE_RENAME_INFO)super.position(position);
    }

    public native @Cast("BOOLEAN") boolean ReplaceIfExists(); public native FILE_RENAME_INFO ReplaceIfExists(boolean setter);
    public native @Cast("HANDLE") Pointer RootDirectory(); public native FILE_RENAME_INFO RootDirectory(Pointer setter);
    public native @Cast("DWORD") int FileNameLength(); public native FILE_RENAME_INFO FileNameLength(int setter);
    public native @Cast("WCHAR") char FileName(int i); public native FILE_RENAME_INFO FileName(int i, char setter);
    @MemberGetter public native @Cast("WCHAR*") CharPointer FileName();
}
