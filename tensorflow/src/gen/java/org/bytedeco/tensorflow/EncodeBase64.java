// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Encode strings into web-safe base64 format.
 * 
 *  Refer to the following article for more information on base64 format:
 *  en.wikipedia.org/wiki/Base64. Base64 strings may have padding with '=' at the
 *  end so that the encoded has length multiple of 4. See Padding section of the
 *  link above.
 * 
 *  Web-safe means that the encoder uses - and _ instead of + and /.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: Strings to be encoded.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * pad: Bool whether padding is applied at the ends.
 * 
 *  Returns:
 *  * {@code Output}: Input strings encoded in base64. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class EncodeBase64 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EncodeBase64(Pointer p) { super(p); }

  /** Optional attribute setters for EncodeBase64 */
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
  
    /** Bool whether padding is applied at the ends.
     * 
     *  Defaults to false */
    public native @ByVal Attrs Pad(@Cast("bool") boolean x);

    public native @Cast("bool") boolean pad_(); public native Attrs pad_(boolean setter);
  }
  public EncodeBase64(@Const @ByRef Scope scope, @ByVal Input input) { super((Pointer)null); allocate(scope, input); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input);
  public EncodeBase64(@Const @ByRef Scope scope, @ByVal Input input, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Pad(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native EncodeBase64 operation(Operation setter);
  public native @ByRef Output output(); public native EncodeBase64 output(Output setter);
}
