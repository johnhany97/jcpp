// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.clang;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.llvm.global.clang.*;


@Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXIdxObjCInterfaceDeclInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXIdxObjCInterfaceDeclInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CXIdxObjCInterfaceDeclInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxObjCInterfaceDeclInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CXIdxObjCInterfaceDeclInfo position(long position) {
        return (CXIdxObjCInterfaceDeclInfo)super.position(position);
    }

  @MemberGetter public native @Const CXIdxObjCContainerDeclInfo containerInfo();
  @MemberGetter public native @Const CXIdxBaseClassInfo superInfo();
  @MemberGetter public native @Const CXIdxObjCProtocolRefListInfo protocols();
}
