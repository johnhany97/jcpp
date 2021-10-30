// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ SmoothL1Loss ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Creates a criterion that uses a squared term if the absolute
 *  element-wise error falls below beta and an L1 term otherwise.
 *  It is less sensitive to outliers than the {@code MSELoss} and in some cases
 *  prevents exploding gradients (e.g. see the paper {@code Fast R-CNN} by Ross Girshick).
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.SmoothL1Loss to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::SmoothL1LossOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  SmoothL1Loss model(SmoothL1LossOptions().reduction(torch::kNone).beta(0.5));
 *  }</pre> */
// NOLINTNEXTLINE(bugprone-exception-escape)
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SmoothL1LossImpl extends SmoothL1LossImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SmoothL1LossImpl(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SmoothL1LossImpl(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SmoothL1LossImpl position(long position) {
        return (SmoothL1LossImpl)super.position(position);
    }
    @Override public SmoothL1LossImpl getPointer(long i) {
        return new SmoothL1LossImpl((Pointer)this).offsetAddress(i);
    }

  public SmoothL1LossImpl(@Const @ByRef(nullValue = "torch::nn::SmoothL1LossOptions{}") SmoothL1LossOptions options_) { super((Pointer)null); allocate(options_); }
  @NoDeallocator private native void allocate(@Const @ByRef(nullValue = "torch::nn::SmoothL1LossOptions{}") SmoothL1LossOptions options_);
  public SmoothL1LossImpl() { super((Pointer)null); allocate(); }
  @NoDeallocator private native void allocate();

  public native void reset();

  /** Pretty prints the {@code L1Loss} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  public native @ByVal Tensor forward(@Const @ByRef Tensor input, @Const @ByRef Tensor target);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef SmoothL1LossOptions options(); public native SmoothL1LossImpl options(SmoothL1LossOptions setter);
}