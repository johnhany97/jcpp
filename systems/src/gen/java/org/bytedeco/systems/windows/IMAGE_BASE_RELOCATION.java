// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;
                        // Back to 4 byte packing
// #endif

//
// Based relocation format.
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMAGE_BASE_RELOCATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMAGE_BASE_RELOCATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMAGE_BASE_RELOCATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMAGE_BASE_RELOCATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMAGE_BASE_RELOCATION position(long position) {
        return (IMAGE_BASE_RELOCATION)super.position(position);
    }

    public native @Cast("DWORD") int VirtualAddress(); public native IMAGE_BASE_RELOCATION VirtualAddress(int setter);
    public native @Cast("DWORD") int SizeOfBlock(); public native IMAGE_BASE_RELOCATION SizeOfBlock(int setter);
//  WORD    TypeOffset[1];
}
