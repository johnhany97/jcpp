// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Static-methods only class for registering and looking up collective
// implementations.
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class CollectiveRegistry extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CollectiveRegistry() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CollectiveRegistry(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CollectiveRegistry(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CollectiveRegistry position(long position) {
        return (CollectiveRegistry)super.position(position);
    }

  // Looks up a previously registered CollectiveImplementation under
  // `collective_name`.  If found, creates an instance of the implementation and
  // assign to `implementation`.
  public static native @ByVal Status Lookup(@StdString BytePointer collective_name,
                         @Cast("tensorflow::CollectiveImplementationInterface**") PointerPointer implementation);
  public static native @ByVal Status Lookup(@StdString BytePointer collective_name,
                         @ByPtrPtr CollectiveImplementationInterface implementation);
  public static native @ByVal Status Lookup(@StdString String collective_name,
                         @ByPtrPtr CollectiveImplementationInterface implementation);

  // Looks up a previously registered CollectiveImplementation under
  // `collective_name`.  If found, returns the static instance of this
  // implementation via `implementation`.  This instance should only be used to
  // call InitializateCollectiveParams.
  public static native @ByVal Status LookupParamResolverInstance(
        @StdString BytePointer collective_name,
        @Cast("tensorflow::CollectiveImplementationInterface**") PointerPointer implementation);
  public static native @ByVal Status LookupParamResolverInstance(
        @StdString BytePointer collective_name,
        @ByPtrPtr CollectiveImplementationInterface implementation);
  public static native @ByVal Status LookupParamResolverInstance(
        @StdString String collective_name,
        @ByPtrPtr CollectiveImplementationInterface implementation);

  // Returns all registered collective implementations.
  public static native void GetAll(
        CollectiveImplementationVector implementations);
}
