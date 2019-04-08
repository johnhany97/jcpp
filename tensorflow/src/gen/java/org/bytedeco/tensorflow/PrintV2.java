// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Prints a string scalar.
 * 
 *  Prints a string scalar to the desired output_stream.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: The string scalar to print.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * output_stream: A string specifying the output stream or logging level to print to.
 * 
 *  Returns:
 *  * the created {@code Operation} */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class PrintV2 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PrintV2(Pointer p) { super(p); }

  /** Optional attribute setters for PrintV2 */
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
  
    /** A string specifying the output stream or logging level to print to.
     * 
     *  Defaults to "stderr" */
    public native @ByVal Attrs OutputStream(@StringPiece BytePointer x);
    public native @ByVal Attrs OutputStream(@StringPiece String x);

    public native @StringPiece BytePointer output_stream_(); public native Attrs output_stream_(BytePointer setter);
  }
  public PrintV2(@Const @ByRef Scope scope, @ByVal Input input) { super((Pointer)null); allocate(scope, input); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input);
  public PrintV2(@Const @ByRef Scope scope, @ByVal Input input, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Operation") Operation asOperation();

  public static native @ByVal Attrs OutputStream(@StringPiece BytePointer x);
  public static native @ByVal Attrs OutputStream(@StringPiece String x);

  public native @ByRef Operation operation(); public native PrintV2 operation(Operation setter);
}
