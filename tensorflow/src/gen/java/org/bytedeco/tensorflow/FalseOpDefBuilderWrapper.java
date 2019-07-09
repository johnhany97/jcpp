// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Template specialization that turns all calls into no-ops.
@Name("tensorflow::register_op::OpDefBuilderWrapper<false>") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class FalseOpDefBuilderWrapper extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FalseOpDefBuilderWrapper(Pointer p) { super(p); }

  public FalseOpDefBuilderWrapper(@Cast("const char*") BytePointer name) { super((Pointer)null); allocate(name); }
  private native void allocate(@Cast("const char*") BytePointer name);
  public FalseOpDefBuilderWrapper(String name) { super((Pointer)null); allocate(name); }
  private native void allocate(String name);
  public native @ByRef FalseOpDefBuilderWrapper Attr(@StringPiece BytePointer spec);
  public native @ByRef FalseOpDefBuilderWrapper Attr(@StringPiece String spec);
  public native @ByRef FalseOpDefBuilderWrapper Input(@StringPiece BytePointer spec);
  public native @ByRef FalseOpDefBuilderWrapper Input(@StringPiece String spec);
  public native @ByRef FalseOpDefBuilderWrapper Output(@StringPiece BytePointer spec);
  public native @ByRef FalseOpDefBuilderWrapper Output(@StringPiece String spec);
  public native @ByRef FalseOpDefBuilderWrapper SetIsCommutative();
  public native @ByRef FalseOpDefBuilderWrapper SetIsAggregate();
  public native @ByRef FalseOpDefBuilderWrapper SetIsStateful();
  public native @ByRef FalseOpDefBuilderWrapper SetAllowsUninitializedInput();
  public native @ByRef FalseOpDefBuilderWrapper Deprecated(int arg0, @StringPiece BytePointer arg1);
  public native @ByRef FalseOpDefBuilderWrapper Deprecated(int arg0, @StringPiece String arg1);
  public native @ByRef FalseOpDefBuilderWrapper Doc(@StringPiece BytePointer text);
  public native @ByRef FalseOpDefBuilderWrapper Doc(@StringPiece String text);
  public static class Fn_InferenceContext extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Fn_InferenceContext(Pointer p) { super(p); }
      protected Fn_InferenceContext() { allocate(); }
      private native void allocate();
      public native @ByVal Status call(InferenceContext arg0);
  }
  public native @ByRef FalseOpDefBuilderWrapper SetShapeFn(
        Fn_InferenceContext fn);
}
