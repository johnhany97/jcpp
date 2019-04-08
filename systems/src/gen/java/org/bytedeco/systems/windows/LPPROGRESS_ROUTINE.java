// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;

// #if WINAPI_FAMILY_PARTITION(WINAPI_PARTITION_DESKTOP)

@Convention("__stdcall") @Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class LPPROGRESS_ROUTINE extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    LPPROGRESS_ROUTINE(Pointer p) { super(p); }
    protected LPPROGRESS_ROUTINE() { allocate(); }
    private native void allocate();
    public native @Cast("DWORD") int call(
    @ByVal LARGE_INTEGER TotalFileSize,
    @ByVal LARGE_INTEGER TotalBytesTransferred,
    @ByVal LARGE_INTEGER StreamSize,
    @ByVal LARGE_INTEGER StreamBytesTransferred,
    @Cast("DWORD") int dwStreamNumber,
    @Cast("DWORD") int dwCallbackReason,
    @Cast("HANDLE") Pointer hSourceFile,
    @Cast("HANDLE") Pointer hDestinationFile,
    @Cast("LPVOID") Pointer lpData
    );
}
