// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** TODO: add doc.
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output} output
 *  * {@code Output} min_output
 *  * {@code Output} max_output */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class QuantizedConv2DWithBiasAndRelu extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QuantizedConv2DWithBiasAndRelu(Pointer p) { super(p); }

  /** Optional attribute setters for QuantizedConv2DWithBiasAndRelu */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
  
    /** Defaults to DT_QINT32 */
    public native @ByVal Attrs OutType(@Cast("tensorflow::DataType") int x);

    /** Defaults to [1, 1, 1, 1] */
    public native @ByVal Attrs Dilations(@ArraySlice IntPointer x);
    public native @ByVal Attrs Dilations(@ArraySlice IntBuffer x);
    public native @ByVal Attrs Dilations(@ArraySlice int... x);

    public native @Cast("tensorflow::DataType") int out_type_(); public native Attrs out_type_(int setter);
    public native @ArraySlice IntPointer dilations_(); public native Attrs dilations_(IntPointer setter);
  }
  public QuantizedConv2DWithBiasAndRelu(@Const @ByRef Scope scope,
                                 @ByVal Input input, @ByVal Input filter, @ByVal Input bias,
                                 @ByVal Input min_input,
                                 @ByVal Input max_input,
                                 @ByVal Input min_filter,
                                 @ByVal Input max_filter, @ArraySlice IntPointer strides, @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, input, filter, bias, min_input, max_input, min_filter, max_filter, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope,
                                 @ByVal Input input, @ByVal Input filter, @ByVal Input bias,
                                 @ByVal Input min_input,
                                 @ByVal Input max_input,
                                 @ByVal Input min_filter,
                                 @ByVal Input max_filter, @ArraySlice IntPointer strides, @StringPiece BytePointer padding);
  public QuantizedConv2DWithBiasAndRelu(@Const @ByRef Scope scope,
                                 @ByVal Input input, @ByVal Input filter, @ByVal Input bias,
                                 @ByVal Input min_input,
                                 @ByVal Input max_input,
                                 @ByVal Input min_filter,
                                 @ByVal Input max_filter, @ArraySlice IntBuffer strides, @StringPiece String padding) { super((Pointer)null); allocate(scope, input, filter, bias, min_input, max_input, min_filter, max_filter, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope,
                                 @ByVal Input input, @ByVal Input filter, @ByVal Input bias,
                                 @ByVal Input min_input,
                                 @ByVal Input max_input,
                                 @ByVal Input min_filter,
                                 @ByVal Input max_filter, @ArraySlice IntBuffer strides, @StringPiece String padding);
  public QuantizedConv2DWithBiasAndRelu(@Const @ByRef Scope scope,
                                 @ByVal Input input, @ByVal Input filter, @ByVal Input bias,
                                 @ByVal Input min_input,
                                 @ByVal Input max_input,
                                 @ByVal Input min_filter,
                                 @ByVal Input max_filter, @ArraySlice int[] strides, @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, input, filter, bias, min_input, max_input, min_filter, max_filter, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope,
                                 @ByVal Input input, @ByVal Input filter, @ByVal Input bias,
                                 @ByVal Input min_input,
                                 @ByVal Input max_input,
                                 @ByVal Input min_filter,
                                 @ByVal Input max_filter, @ArraySlice int[] strides, @StringPiece BytePointer padding);
  public QuantizedConv2DWithBiasAndRelu(@Const @ByRef Scope scope,
                                 @ByVal Input input, @ByVal Input filter, @ByVal Input bias,
                                 @ByVal Input min_input,
                                 @ByVal Input max_input,
                                 @ByVal Input min_filter,
                                 @ByVal Input max_filter, @ArraySlice IntPointer strides, @StringPiece String padding) { super((Pointer)null); allocate(scope, input, filter, bias, min_input, max_input, min_filter, max_filter, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope,
                                 @ByVal Input input, @ByVal Input filter, @ByVal Input bias,
                                 @ByVal Input min_input,
                                 @ByVal Input max_input,
                                 @ByVal Input min_filter,
                                 @ByVal Input max_filter, @ArraySlice IntPointer strides, @StringPiece String padding);
  public QuantizedConv2DWithBiasAndRelu(@Const @ByRef Scope scope,
                                 @ByVal Input input, @ByVal Input filter, @ByVal Input bias,
                                 @ByVal Input min_input,
                                 @ByVal Input max_input,
                                 @ByVal Input min_filter,
                                 @ByVal Input max_filter, @ArraySlice IntBuffer strides, @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, input, filter, bias, min_input, max_input, min_filter, max_filter, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope,
                                 @ByVal Input input, @ByVal Input filter, @ByVal Input bias,
                                 @ByVal Input min_input,
                                 @ByVal Input max_input,
                                 @ByVal Input min_filter,
                                 @ByVal Input max_filter, @ArraySlice IntBuffer strides, @StringPiece BytePointer padding);
  public QuantizedConv2DWithBiasAndRelu(@Const @ByRef Scope scope,
                                 @ByVal Input input, @ByVal Input filter, @ByVal Input bias,
                                 @ByVal Input min_input,
                                 @ByVal Input max_input,
                                 @ByVal Input min_filter,
                                 @ByVal Input max_filter, @ArraySlice int[] strides, @StringPiece String padding) { super((Pointer)null); allocate(scope, input, filter, bias, min_input, max_input, min_filter, max_filter, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope,
                                 @ByVal Input input, @ByVal Input filter, @ByVal Input bias,
                                 @ByVal Input min_input,
                                 @ByVal Input max_input,
                                 @ByVal Input min_filter,
                                 @ByVal Input max_filter, @ArraySlice int[] strides, @StringPiece String padding);
  public QuantizedConv2DWithBiasAndRelu(@Const @ByRef Scope scope,
                                 @ByVal Input input, @ByVal Input filter, @ByVal Input bias,
                                 @ByVal Input min_input,
                                 @ByVal Input max_input,
                                 @ByVal Input min_filter,
                                 @ByVal Input max_filter, @ArraySlice IntPointer strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, filter, bias, min_input, max_input, min_filter, max_filter, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope,
                                 @ByVal Input input, @ByVal Input filter, @ByVal Input bias,
                                 @ByVal Input min_input,
                                 @ByVal Input max_input,
                                 @ByVal Input min_filter,
                                 @ByVal Input max_filter, @ArraySlice IntPointer strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs);
  public QuantizedConv2DWithBiasAndRelu(@Const @ByRef Scope scope,
                                 @ByVal Input input, @ByVal Input filter, @ByVal Input bias,
                                 @ByVal Input min_input,
                                 @ByVal Input max_input,
                                 @ByVal Input min_filter,
                                 @ByVal Input max_filter, @ArraySlice IntBuffer strides, @StringPiece String padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, filter, bias, min_input, max_input, min_filter, max_filter, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope,
                                 @ByVal Input input, @ByVal Input filter, @ByVal Input bias,
                                 @ByVal Input min_input,
                                 @ByVal Input max_input,
                                 @ByVal Input min_filter,
                                 @ByVal Input max_filter, @ArraySlice IntBuffer strides, @StringPiece String padding, @Const @ByRef Attrs attrs);
  public QuantizedConv2DWithBiasAndRelu(@Const @ByRef Scope scope,
                                 @ByVal Input input, @ByVal Input filter, @ByVal Input bias,
                                 @ByVal Input min_input,
                                 @ByVal Input max_input,
                                 @ByVal Input min_filter,
                                 @ByVal Input max_filter, @ArraySlice int[] strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, filter, bias, min_input, max_input, min_filter, max_filter, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope,
                                 @ByVal Input input, @ByVal Input filter, @ByVal Input bias,
                                 @ByVal Input min_input,
                                 @ByVal Input max_input,
                                 @ByVal Input min_filter,
                                 @ByVal Input max_filter, @ArraySlice int[] strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs);
  public QuantizedConv2DWithBiasAndRelu(@Const @ByRef Scope scope,
                                 @ByVal Input input, @ByVal Input filter, @ByVal Input bias,
                                 @ByVal Input min_input,
                                 @ByVal Input max_input,
                                 @ByVal Input min_filter,
                                 @ByVal Input max_filter, @ArraySlice IntPointer strides, @StringPiece String padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, filter, bias, min_input, max_input, min_filter, max_filter, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope,
                                 @ByVal Input input, @ByVal Input filter, @ByVal Input bias,
                                 @ByVal Input min_input,
                                 @ByVal Input max_input,
                                 @ByVal Input min_filter,
                                 @ByVal Input max_filter, @ArraySlice IntPointer strides, @StringPiece String padding, @Const @ByRef Attrs attrs);
  public QuantizedConv2DWithBiasAndRelu(@Const @ByRef Scope scope,
                                 @ByVal Input input, @ByVal Input filter, @ByVal Input bias,
                                 @ByVal Input min_input,
                                 @ByVal Input max_input,
                                 @ByVal Input min_filter,
                                 @ByVal Input max_filter, @ArraySlice IntBuffer strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, filter, bias, min_input, max_input, min_filter, max_filter, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope,
                                 @ByVal Input input, @ByVal Input filter, @ByVal Input bias,
                                 @ByVal Input min_input,
                                 @ByVal Input max_input,
                                 @ByVal Input min_filter,
                                 @ByVal Input max_filter, @ArraySlice IntBuffer strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs);
  public QuantizedConv2DWithBiasAndRelu(@Const @ByRef Scope scope,
                                 @ByVal Input input, @ByVal Input filter, @ByVal Input bias,
                                 @ByVal Input min_input,
                                 @ByVal Input max_input,
                                 @ByVal Input min_filter,
                                 @ByVal Input max_filter, @ArraySlice int[] strides, @StringPiece String padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, filter, bias, min_input, max_input, min_filter, max_filter, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope,
                                 @ByVal Input input, @ByVal Input filter, @ByVal Input bias,
                                 @ByVal Input min_input,
                                 @ByVal Input max_input,
                                 @ByVal Input min_filter,
                                 @ByVal Input max_filter, @ArraySlice int[] strides, @StringPiece String padding, @Const @ByRef Attrs attrs);

  public static native @ByVal Attrs OutType(@Cast("tensorflow::DataType") int x);
  public static native @ByVal Attrs Dilations(@ArraySlice IntPointer x);
  public static native @ByVal Attrs Dilations(@ArraySlice IntBuffer x);
  public static native @ByVal Attrs Dilations(@ArraySlice int... x);

  public native @ByRef Operation operation(); public native QuantizedConv2DWithBiasAndRelu operation(Operation setter);
  public native @ByRef Output output(); public native QuantizedConv2DWithBiasAndRelu output(Output setter);
  public native @ByRef Output min_output(); public native QuantizedConv2DWithBiasAndRelu min_output(Output setter);
  public native @ByRef Output max_output(); public native QuantizedConv2DWithBiasAndRelu max_output(Output setter);
}
