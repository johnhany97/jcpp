// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;



//
// Typedefs
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class SECURITY_ATTRIBUTES extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SECURITY_ATTRIBUTES() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SECURITY_ATTRIBUTES(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SECURITY_ATTRIBUTES(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SECURITY_ATTRIBUTES position(long position) {
        return (SECURITY_ATTRIBUTES)super.position(position);
    }

    public native @Cast("DWORD") int nLength(); public native SECURITY_ATTRIBUTES nLength(int setter);
    public native @Cast("LPVOID") Pointer lpSecurityDescriptor(); public native SECURITY_ATTRIBUTES lpSecurityDescriptor(Pointer setter);
    public native @Cast("BOOL") boolean bInheritHandle(); public native SECURITY_ATTRIBUTES bInheritHandle(boolean setter);
}
