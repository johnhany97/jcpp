// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.clang;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.llvm.global.clang.*;


 /**
  * Visitor invoked for each file in a translation unit
  *        (used with clang_getInclusions()).
  *
  * This visitor function will be invoked by clang_getInclusions() for each
  * file included (either at the top-level or by \#include directives) within
  * a translation unit.  The first argument is the file being included, and
  * the second and third arguments provide the inclusion stack.  The
  * array is sorted in order of immediate inclusion.  For example,
  * the first element refers to the location that included 'included_file'.
  */
@Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXInclusionVisitor extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    CXInclusionVisitor(Pointer p) { super(p); }
    protected CXInclusionVisitor() { allocate(); }
    private native void allocate();
    public native void call(CXFile included_file,
                                   CXSourceLocation inclusion_stack,
                                   @Cast("unsigned") int include_len,
                                   CXClientData client_data);
}
