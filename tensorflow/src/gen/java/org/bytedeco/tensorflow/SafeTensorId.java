// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Same as TensorId, except owns the backing storage for the op name. This makes
// the memory management simpler at the expense of a copy.
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SafeTensorId extends StringIntPair {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SafeTensorId(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SafeTensorId(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SafeTensorId position(long position) {
        return (SafeTensorId)super.position(position);
    }


  // NOTE(skyewm): this is required on some platforms. I'm not sure why the
  // using "using Base::pair;" isn't always sufficient.
  public SafeTensorId() { super((Pointer)null); allocate(); }
  private native void allocate();
  public SafeTensorId(@StdString BytePointer str, int idx) { super((Pointer)null); allocate(str, idx); }
  private native void allocate(@StdString BytePointer str, int idx);
  public SafeTensorId(@StdString String str, int idx) { super((Pointer)null); allocate(str, idx); }
  private native void allocate(@StdString String str, int idx);
  public SafeTensorId(@Const @ByRef TensorId id) { super((Pointer)null); allocate(id); }
  private native void allocate(@Const @ByRef TensorId id);

  public native @StdString BytePointer node();
  public native int index();

  public native @StdString BytePointer ToString();

  public static class Hasher extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Hasher() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Hasher(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Hasher(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Hasher position(long position) {
          return (Hasher)super.position(position);
      }
  
    public native @Cast("std::size_t") @Name("operator ()") long apply(@Const @ByRef TensorId x);
  }
}
