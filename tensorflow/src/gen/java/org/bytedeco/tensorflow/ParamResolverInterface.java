// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Interface that provides resolution of shared CollectiveParams fields.
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ParamResolverInterface extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ParamResolverInterface(Pointer p) { super(p); }


  // Called by each collective op at first execution in order to fill out
  // the CollectiveParams structure with data gathered from the full
  // (maybe distributed) collection of peer nodes.
  public native void CompleteParamsAsync(@StdString BytePointer device, CollectiveParams cp,
                                     CancellationManager cancel_mgr,
                                     @Cast("const tensorflow::StatusCallback*") @ByRef Pointer done);
  public native void CompleteParamsAsync(@StdString String device, CollectiveParams cp,
                                     CancellationManager cancel_mgr,
                                     @Cast("const tensorflow::StatusCallback*") @ByRef Pointer done);

  // Used within a distributed implementation to discover/verify
  // data shared across a device group.
  public native void CompleteGroupAsync(@Const CompleteGroupRequest request,
                                    CompleteGroupResponse response,
                                    CancellationManager cancel_mgr,
                                    @Cast("const tensorflow::StatusCallback*") @ByRef Pointer done);

  // Used within a distributed implementation to discover/verify data
  // shared across an instance group.
  public native void CompleteInstanceAsync(@Const CompleteInstanceRequest request,
                                       CompleteInstanceResponse response,
                                       CancellationManager cancel_mgr,
                                       @Cast("const tensorflow::StatusCallback*") @ByRef Pointer done);
}
