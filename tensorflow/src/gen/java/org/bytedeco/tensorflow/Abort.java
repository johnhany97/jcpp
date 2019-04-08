// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** \defgroup control_flow_ops Control Flow Ops
 *  \{
 <p>
 *  Raise a exception to abort the process when called.
 * 
 *  If exit_without_error is true, the process will exit normally,
 *  otherwise it will exit with a SIGABORT signal.
 * 
 *  Returns nothing but an exception.
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * error_msg: A string which is the message associated with the exception.
 * 
 *  Returns:
 *  * the created {@code Operation} */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Abort extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Abort(Pointer p) { super(p); }

  /** Optional attribute setters for Abort */
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
  
    /** A string which is the message associated with the exception.
     * 
     *  Defaults to "" */
    public native @ByVal Attrs ErrorMsg(@StringPiece BytePointer x);
    public native @ByVal Attrs ErrorMsg(@StringPiece String x);

    /** Defaults to false */
    public native @ByVal Attrs ExitWithoutError(@Cast("bool") boolean x);

    public native @StringPiece BytePointer error_msg_(); public native Attrs error_msg_(BytePointer setter);
    public native @Cast("bool") boolean exit_without_error_(); public native Attrs exit_without_error_(boolean setter);
  }
  public Abort(@Const @ByRef Scope scope) { super((Pointer)null); allocate(scope); }
  private native void allocate(@Const @ByRef Scope scope);
  public Abort(@Const @ByRef Scope scope, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Operation") Operation asOperation();

  public static native @ByVal Attrs ErrorMsg(@StringPiece BytePointer x);
  public static native @ByVal Attrs ErrorMsg(@StringPiece String x);
  public static native @ByVal Attrs ExitWithoutError(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native Abort operation(Operation setter);
}
