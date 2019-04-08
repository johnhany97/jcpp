// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Resize {@code images} to {@code size} using bilinear interpolation.
 * 
 *  Input images can be of different types but output images are always float.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * images: 4-D with shape {@code [batch, height, width, channels]}.
 *  * size: = A 1-D int32 Tensor of 2 elements: {@code new_height, new_width}.  The
 *  new size for the images.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * align_corners: If true, the centers of the 4 corner pixels of the input and output tensors are
 *  aligned, preserving the values at the corner pixels. Defaults to false.
 * 
 *  Returns:
 *  * {@code Output}: 4-D with shape
 *  {@code [batch, new_height, new_width, channels]}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ResizeBilinear extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ResizeBilinear(Pointer p) { super(p); }

  /** Optional attribute setters for ResizeBilinear */
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
  
    /** If true, the centers of the 4 corner pixels of the input and output tensors are
     *  aligned, preserving the values at the corner pixels. Defaults to false.
     * 
     *  Defaults to false */
    public native @ByVal Attrs AlignCorners(@Cast("bool") boolean x);

    public native @Cast("bool") boolean align_corners_(); public native Attrs align_corners_(boolean setter);
  }
  public ResizeBilinear(@Const @ByRef Scope scope, @ByVal Input images,
                 @ByVal Input size) { super((Pointer)null); allocate(scope, images, size); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input images,
                 @ByVal Input size);
  public ResizeBilinear(@Const @ByRef Scope scope, @ByVal Input images,
                 @ByVal Input size, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, images, size, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input images,
                 @ByVal Input size, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs AlignCorners(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native ResizeBilinear operation(Operation setter);
  public native @ByRef Output resized_images(); public native ResizeBilinear resized_images(Output setter);
}
