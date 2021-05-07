// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \class LargeBinaryBuilder
 *  \brief Builder class for large variable-length binary data */
@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class LargeBinaryBuilder extends BaseLargeBinaryBuilder {
    static { Loader.load(); }

  
  
    public LargeBinaryBuilder(MemoryPool pool/*=arrow::default_memory_pool()*/) { super((Pointer)null); allocate(pool); }
    private native void allocate(MemoryPool pool/*=arrow::default_memory_pool()*/);
    public LargeBinaryBuilder() { super((Pointer)null); allocate(); }
    private native void allocate();
  
    public LargeBinaryBuilder(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, MemoryPool pool) { super((Pointer)null); allocate(type, pool); }
    private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type, MemoryPool pool);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LargeBinaryBuilder(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public LargeBinaryBuilder(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public LargeBinaryBuilder position(long position) {
        return (LargeBinaryBuilder)super.position(position);
    }
    @Override public LargeBinaryBuilder getPointer(long i) {
        return new LargeBinaryBuilder((Pointer)this).offsetAddress(i);
    }


  /** \cond FALSE */
  /** \endcond */

  public native @ByVal Status Finish(@SharedPtr LargeBinaryArray out);

  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type();
}
