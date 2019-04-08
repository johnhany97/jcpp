// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// The session state remembers the tensors we choose to keep across
// multiple run calls.
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SessionState extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SessionState() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SessionState(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SessionState(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SessionState position(long position) {
        return (SessionState)super.position(position);
    }

  // Get a tensor from the session state.
  public native @ByVal Status GetTensor(@StdString BytePointer handle, Tensor tensor);
  public native @ByVal Status GetTensor(@StdString String handle, Tensor tensor);

  // Store a tensor in the session state.
  public native @ByVal Status AddTensor(@StdString BytePointer handle, @Const @ByRef Tensor tensor);
  public native @ByVal Status AddTensor(@StdString String handle, @Const @ByRef Tensor tensor);

  // Delete a tensdor from the session state.
  public native @ByVal Status DeleteTensor(@StdString BytePointer handle);
  public native @ByVal Status DeleteTensor(@StdString String handle);

  public native @Cast("tensorflow::int64") long GetNewId();

  @MemberGetter public static native @Cast("const char*") BytePointer kTensorHandleResourceTypeName();
}
