// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.llvm.global.LLVM.*;


@Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMMCJITCompilerOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public LLVMMCJITCompilerOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public LLVMMCJITCompilerOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LLVMMCJITCompilerOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public LLVMMCJITCompilerOptions position(long position) {
        return (LLVMMCJITCompilerOptions)super.position(position);
    }

  public native @Cast("unsigned") int OptLevel(); public native LLVMMCJITCompilerOptions OptLevel(int setter);
  public native @Cast("LLVMCodeModel") int CodeModel(); public native LLVMMCJITCompilerOptions CodeModel(int setter);
  public native @Cast("LLVMBool") int NoFramePointerElim(); public native LLVMMCJITCompilerOptions NoFramePointerElim(int setter);
  public native @Cast("LLVMBool") int EnableFastISel(); public native LLVMMCJITCompilerOptions EnableFastISel(int setter);
  public native LLVMMCJITMemoryManagerRef MCJMM(); public native LLVMMCJITCompilerOptions MCJMM(LLVMMCJITMemoryManagerRef setter);
}
