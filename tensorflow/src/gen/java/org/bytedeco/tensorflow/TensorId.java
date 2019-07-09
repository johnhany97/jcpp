// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Identifier for a tensor within a step.
// first == operation_name, second == output_index
// Note: does not own backing storage for name.
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorId extends StringPieceIntPair {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorId(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TensorId(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TensorId position(long position) {
        return (TensorId)super.position(position);
    }


  // Inherit the set of constructors.

  // NOTE(skyewm): this is required on some platforms. I'm not sure why the
  // using statement above isn't always sufficient.
  public TensorId() { super((Pointer)null); allocate(); }
  private native void allocate();
  public TensorId(@Const @ByRef SafeTensorId id) { super((Pointer)null); allocate(id); }
  private native void allocate(@Const @ByRef SafeTensorId id);

  public native @StringPiece BytePointer node();
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
