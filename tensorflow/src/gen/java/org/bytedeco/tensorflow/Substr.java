// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Return substrings from {@code Tensor} of strings.
 * 
 *  For each string in the input {@code Tensor}, creates a substring starting at index
 *  {@code pos} with a total length of {@code len}.
 * 
 *  If {@code len} defines a substring that would extend beyond the length of the input
 *  string, then as many characters as possible are used.
 * 
 *  A negative {@code pos} indicates distance within the string backwards from the end.
 * 
 *  If {@code pos} specifies an index which is out of range for any of the input strings,
 *  then an {@code InvalidArgumentError} is thrown.
 * 
 *  {@code pos} and {@code len} must have the same shape, otherwise a {@code ValueError} is thrown on
 *  Op creation.
 * 
 *  *NOTE*: {@code Substr} supports broadcasting up to two dimensions. More about
 *  broadcasting
 *  [here](http://docs.scipy.org/doc/numpy/user/basics.broadcasting.html)
 * 
 *  ---
 * 
 *  Examples
 * 
 *  Using scalar {@code pos} and {@code len}:
 * 
 *  <pre>{@code python
 *  input = [b'Hello', b'World']
 *  position = 1
 *  length = 3
 * 
 *  output = [b'ell', b'orl']
 *  }</pre>
 * 
 *  Using {@code pos} and {@code len} with same shape as {@code input}:
 * 
 *  <pre>{@code python
 *  input = [[b'ten', b'eleven', b'twelve'],
 *           [b'thirteen', b'fourteen', b'fifteen'],
 *           [b'sixteen', b'seventeen', b'eighteen']]
 *  position = [[1, 2, 3],
 *              [1, 2, 3],
 *              [1, 2, 3]]
 *  length =   [[2, 3, 4],
 *              [4, 3, 2],
 *              [5, 5, 5]]
 * 
 *  output = [[b'en', b'eve', b'lve'],
 *            [b'hirt', b'urt', b'te'],
 *            [b'ixtee', b'vente', b'hteen']]
 *  }</pre>
 * 
 *  Broadcasting {@code pos} and {@code len} onto {@code input}:
 * 
 *  <pre>{@code
 *  input = [[b'ten', b'eleven', b'twelve'],
 *           [b'thirteen', b'fourteen', b'fifteen'],
 *           [b'sixteen', b'seventeen', b'eighteen'],
 *           [b'nineteen', b'twenty', b'twentyone']]
 *  position = [1, 2, 3]
 *  length =   [1, 2, 3]
 * 
 *  output = [[b'e', b'ev', b'lve'],
 *            [b'h', b'ur', b'tee'],
 *            [b'i', b've', b'hte'],
 *            [b'i', b'en', b'nty']]
 *  }</pre>
 * 
 *  Broadcasting {@code input} onto {@code pos} and {@code len}:
 * 
 *  <pre>{@code
 *  input = b'thirteen'
 *  position = [1, 5, 7]
 *  length =   [3, 2, 1]
 * 
 *  output = [b'hir', b'ee', b'n']
 *  }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: Tensor of strings
 *  * pos: Scalar defining the position of first character in each substring
 *  * len: Scalar defining the number of characters to include in each substring
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * unit: The unit that is used to create the substring.  One of: {@code "BYTE"} (for
 *  defining position and length by bytes) or {@code "UTF8_CHAR"} (for the UTF-8
 *  encoded Unicode code points).  The default is {@code "BYTE"}. Results are undefined if
 *  {@code unit=UTF8_CHAR} and the {@code input} strings do not contain structurally valid
 *  UTF-8.
 * 
 *  Returns:
 *  * {@code Output}: Tensor of substrings */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Substr extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Substr(Pointer p) { super(p); }

  /** Optional attribute setters for Substr */
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
  
    /** The unit that is used to create the substring.  One of: {@code "BYTE"} (for
     *  defining position and length by bytes) or {@code "UTF8_CHAR"} (for the UTF-8
     *  encoded Unicode code points).  The default is {@code "BYTE"}. Results are undefined if
     *  {@code unit=UTF8_CHAR} and the {@code input} strings do not contain structurally valid
     *  UTF-8.
     * 
     *  Defaults to "BYTE" */
    public native @ByVal Attrs Unit(@StringPiece BytePointer x);
    public native @ByVal Attrs Unit(@StringPiece String x);

    public native @StringPiece BytePointer unit_(); public native Attrs unit_(BytePointer setter);
  }
  public Substr(@Const @ByRef Scope scope, @ByVal Input input,
         @ByVal Input pos, @ByVal Input len) { super((Pointer)null); allocate(scope, input, pos, len); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
         @ByVal Input pos, @ByVal Input len);
  public Substr(@Const @ByRef Scope scope, @ByVal Input input,
         @ByVal Input pos, @ByVal Input len, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, pos, len, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
         @ByVal Input pos, @ByVal Input len, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Unit(@StringPiece BytePointer x);
  public static native @ByVal Attrs Unit(@StringPiece String x);

  public native @ByRef Operation operation(); public native Substr operation(Operation setter);
  public native @ByRef Output output(); public native Substr output(Output setter);
}
