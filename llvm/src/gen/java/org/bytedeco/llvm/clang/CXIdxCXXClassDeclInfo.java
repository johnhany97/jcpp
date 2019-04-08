// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.clang;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.llvm.global.clang.*;


@Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXIdxCXXClassDeclInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXIdxCXXClassDeclInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CXIdxCXXClassDeclInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxCXXClassDeclInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CXIdxCXXClassDeclInfo position(long position) {
        return (CXIdxCXXClassDeclInfo)super.position(position);
    }

  @MemberGetter public native @Const CXIdxDeclInfo declInfo();
  @MemberGetter public native @Const CXIdxBaseClassInfo bases(int i);
  @MemberGetter public native @Cast("const CXIdxBaseClassInfo*const*") PointerPointer bases();
  public native @Cast("unsigned") int numBases(); public native CXIdxCXXClassDeclInfo numBases(int setter);
}
