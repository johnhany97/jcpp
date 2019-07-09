// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.llvm.global.LLVM.*;


/**
 * \} // endgoup LLVMCLTO
 * \defgroup LLVMCTLTO ThinLTO
 * \ingroup LLVMC
 *
 * \{
 */

/**
 * Type to wrap a single object returned by ThinLTO.
 *
 * @since LTO_API_VERSION=18
 */
@Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LTOObjectBuffer extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public LTOObjectBuffer() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public LTOObjectBuffer(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LTOObjectBuffer(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public LTOObjectBuffer position(long position) {
        return (LTOObjectBuffer)super.position(position);
    }

  @MemberGetter public native @Cast("const char*") BytePointer Buffer();
  public native @Cast("size_t") long Size(); public native LTOObjectBuffer Size(long setter);
}
