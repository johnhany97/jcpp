// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.onnx.global.onnx.*;


// Pass Analysis done after a predicate based pass.
@Namespace("onnx::optimization") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class CountBasedPassAnalysis extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CountBasedPassAnalysis(Pointer p) { super(p); }

  // Have to use raw pointer here. The idea is that the pass will pass <this> as
  // a parameter to the constructor. We could use std::enable_shared_from_this
  // but this complicates the memory model. Also since all passes come from
  // GlobalPassRegistry which already utilizes smart pointers we don't have to
  // worry about memory leaks from passes.
  public native Pass pass(); public native CountBasedPassAnalysis pass(Pass setter);
  public native @Cast("unsigned int") int num_positive_transforms(); public native CountBasedPassAnalysis num_positive_transforms(int setter);
  public native @Cast("bool") boolean initialization_done(); public native CountBasedPassAnalysis initialization_done(boolean setter);
  public native @Cast("bool") boolean finalization_done(); public native CountBasedPassAnalysis finalization_done(boolean setter);
  public CountBasedPassAnalysis(
        Pass pass,
        @Cast("unsigned int") int num_positive_transforms,
        @Cast("bool") boolean initialization_done,
        @Cast("bool") boolean finalization_done) { super((Pointer)null); allocate(pass, num_positive_transforms, initialization_done, finalization_done); }
  private native void allocate(
        Pass pass,
        @Cast("unsigned int") int num_positive_transforms,
        @Cast("bool") boolean initialization_done,
        @Cast("bool") boolean finalization_done);

  public native @Cast("bool") boolean graphChanged();
  public native @Cast("bool") boolean numSucceededTransforms();

  // Whether or not a repeated application of the pass might be useful.
  public native @Cast("bool") boolean fixedPointOptimizationNeeded();
}
