// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// OpSegment keeps track of OpKernels registered for sessions running
// on a device.
//
// The implementation maintains a two-level map. The 1st level maps
// session handle to the map of registered OpKernels. The 2nd level
// map maps node names to instantiated OpKernel objects.
//
// Each 2-nd level map is reference-counted and the caller can call
// AddHold to obtain a reference on all kernels of a session and
// ensure these kernels are alive until a corresponding RemoveHold is
// called on the same session.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class OpSegment extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OpSegment(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OpSegment(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public OpSegment position(long position) {
        return (OpSegment)super.position(position);
    }

  public OpSegment() { super((Pointer)null); allocate(); }
  private native void allocate();

  // A hold can be placed on a session, preventing all its kernels
  // from being deleted.
  public native void AddHold(@StdString BytePointer session_handle);
  public native void AddHold(@StdString String session_handle);
  public native void RemoveHold(@StdString BytePointer session_handle);
  public native void RemoveHold(@StdString String session_handle);

  // If the kernel for "node_name" has been created in the
  // "session_handle", returns the existing op kernel in "*kernel".
  // Otherwise, creates the kernel by calling create_fn(), cache it,
  // and returns it in "*kernel". If create_fn() fails, returns the
  // error.
  //
  // OpSegment keeps the ownership of the returned "*kernel".
  public native @ByVal Status FindOrCreate(@StdString BytePointer session_handle, @StdString BytePointer node_name,
                        @Cast("tensorflow::OpKernel**") PointerPointer kernel, @ByVal @Cast("tensorflow::OpSegment::CreateKernelFn*") Pointer create_fn);
  public native @ByVal Status FindOrCreate(@StdString BytePointer session_handle, @StdString BytePointer node_name,
                        @ByPtrPtr OpKernel kernel, @ByVal @Cast("tensorflow::OpSegment::CreateKernelFn*") Pointer create_fn);
  public native @ByVal Status FindOrCreate(@StdString String session_handle, @StdString String node_name,
                        @ByPtrPtr OpKernel kernel, @ByVal @Cast("tensorflow::OpSegment::CreateKernelFn*") Pointer create_fn);

  // Returns true if OpSegment should own the kernel.
  public static native @Cast("bool") boolean ShouldOwnKernel(FunctionLibraryRuntime lib,
                                @StdString BytePointer node_op);
  public static native @Cast("bool") boolean ShouldOwnKernel(FunctionLibraryRuntime lib,
                                @StdString String node_op);
}
