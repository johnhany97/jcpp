// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.caffe;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.caffe.global.caffe.*;


/**
 * \brief An interface for the units of computation which can be composed into a
 *        Net.
 *
 * Layer%s must implement a Forward function, in which they take their input
 * (bottom) Blob%s (if any) and compute their output Blob%s (if any).
 * They may also implement a Backward function, in which they compute the error
 * gradients with respect to their input Blob%s, given the error gradients with
 * their output Blob%s.
 */
@Name("caffe::Layer<float>") @NoOffset @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class FloatLayer extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FloatLayer(Pointer p) { super(p); }

  /**
   * You should not implement your own constructor. Any set up code should go
   * to SetUp(), where the dimensions of the bottom blobs are provided to the
   * layer.
   */
  public FloatLayer(@Const @ByRef LayerParameter param) { super((Pointer)null); allocate(param); }
  private native void allocate(@Const @ByRef LayerParameter param);

  /**
   * \brief Implements common layer setup functionality.
   *
   * @param bottom the preshaped input blobs
   * @param top
   *     the allocated but unshaped output blobs, to be shaped by Reshape
   *
   * Checks that the number of bottom and top blobs is correct.
   * Calls LayerSetUp to do special layer setup for individual layer types,
   * followed by Reshape to set up sizes of top blobs and internal buffers.
   * Sets up the loss weight multiplier blobs for any non-zero loss weights.
   * This method may not be overridden.
   */
  public native void SetUp(@Const @ByRef FloatBlobVector bottom,
        @Const @ByRef FloatBlobVector top);

  /**
   * \brief Does layer-specific setup: your layer should implement this function
   *        as well as Reshape.
   *
   * @param bottom
   *     the preshaped input blobs, whose data fields store the input data for
   *     this layer
   * @param top
   *     the allocated but unshaped output blobs
   *
   * This method should do one-time layer specific setup. This includes reading
   * and processing relevent parameters from the <code>layer_param_</code>.
   * Setting up the shapes of top blobs and internal buffers should be done in
   * <code>Reshape</code>, which will be called before the forward pass to
   * adjust the top blob sizes.
   */
  @Virtual public native void LayerSetUp(@Const @ByRef FloatBlobVector bottom,
        @Const @ByRef FloatBlobVector top);

  /**
   * \brief Adjust the shapes of top blobs and internal buffers to accommodate
   *        the shapes of the bottom blobs.
   *
   * @param bottom the input blobs, with the requested input shapes
   * @param top the top blobs, which should be reshaped as needed
   *
   * This method should reshape top blobs as needed according to the shapes
   * of the bottom (input) blobs, as well as reshaping any internal buffers
   * and making any other necessary adjustments so that the layer can
   * accommodate the bottom blobs.
   */
  @Virtual(true) public native void Reshape(@Const @ByRef FloatBlobVector bottom,
        @Const @ByRef FloatBlobVector top);

  /**
   * \brief Given the bottom blobs, compute the top blobs and the loss.
   *
   * @param bottom
   *     the input blobs, whose data fields store the input data for this layer
   * @param top
   *     the preshaped output blobs, whose data fields will store this layers'
   *     outputs
   * @return The total loss from the layer.
   *
   * The Forward wrapper calls the relevant device wrapper function
   * (Forward_cpu or Forward_gpu) to compute the top blob values given the
   * bottom blobs.  If the layer has any non-zero loss_weights, the wrapper
   * then computes and returns the loss.
   *
   * Your layer should implement Forward_cpu and (optionally) Forward_gpu.
   */
  public native float Forward(@Const @ByRef FloatBlobVector bottom,
        @Const @ByRef FloatBlobVector top);

  /**
   * \brief Given the top blob error gradients, compute the bottom blob error
   *        gradients.
   *
   * @param top
   *     the output blobs, whose diff fields store the gradient of the error
   *     with respect to themselves
   * @param propagate_down
   *     a vector with equal length to bottom, with each index indicating
   *     whether to propagate the error gradients down to the bottom blob at
   *     the corresponding index
   * @param bottom
   *     the input blobs, whose diff fields will store the gradient of the error
   *     with respect to themselves after Backward is run
   *
   * The Backward wrapper calls the relevant device wrapper function
   * (Backward_cpu or Backward_gpu) to compute the bottom blob diffs given the
   * top blob diffs.
   *
   * Your layer should implement Backward_cpu and (optionally) Backward_gpu.
   */
  public native void Backward(@Const @ByRef FloatBlobVector top,
        @Const @ByRef BoolVector propagate_down,
        @Const @ByRef FloatBlobVector bottom);

  /**
   * \brief Returns the vector of learnable parameter blobs.
   */
  public native @ByRef FloatBlobSharedVector blobs();

  /**
   * \brief Returns the layer parameter.
   */
  public native @Const @ByRef LayerParameter layer_param();

  /**
   * \brief Writes the layer parameter to a protocol buffer
   */
  @Virtual public native void ToProto(LayerParameter param, @Cast("bool") boolean write_diff/*=false*/);

  /**
   * \brief Returns the scalar loss associated with a top blob at a given index.
   */
  public native float loss(@Const int top_index);

  /**
   * \brief Sets the loss associated with a top blob at a given index.
   */
  public native void set_loss(@Const int top_index, @Const float value);

  /**
   * \brief Returns the layer type.
   */
  @Virtual public native @Const({false, false, true}) @Cast("const char*") BytePointer type();

  /**
   * \brief Returns the exact number of bottom blobs required by the layer,
   *        or -1 if no exact number is required.
   *
   * This method should be overridden to return a non-negative value if your
   * layer expects some exact number of bottom blobs.
   */
  @Virtual public native @Const({false, false, true}) int ExactNumBottomBlobs();
  /**
   * \brief Returns the minimum number of bottom blobs required by the layer,
   *        or -1 if no minimum number is required.
   *
   * This method should be overridden to return a non-negative value if your
   * layer expects some minimum number of bottom blobs.
   */
  @Virtual public native @Const({false, false, true}) int MinBottomBlobs();
  /**
   * \brief Returns the maximum number of bottom blobs required by the layer,
   *        or -1 if no maximum number is required.
   *
   * This method should be overridden to return a non-negative value if your
   * layer expects some maximum number of bottom blobs.
   */
  @Virtual public native @Const({false, false, true}) int MaxBottomBlobs();
  /**
   * \brief Returns the exact number of top blobs required by the layer,
   *        or -1 if no exact number is required.
   *
   * This method should be overridden to return a non-negative value if your
   * layer expects some exact number of top blobs.
   */
  @Virtual public native @Const({false, false, true}) int ExactNumTopBlobs();
  /**
   * \brief Returns the minimum number of top blobs required by the layer,
   *        or -1 if no minimum number is required.
   *
   * This method should be overridden to return a non-negative value if your
   * layer expects some minimum number of top blobs.
   */
  @Virtual public native @Const({false, false, true}) int MinTopBlobs();
  /**
   * \brief Returns the maximum number of top blobs required by the layer,
   *        or -1 if no maximum number is required.
   *
   * This method should be overridden to return a non-negative value if your
   * layer expects some maximum number of top blobs.
   */
  @Virtual public native @Const({false, false, true}) int MaxTopBlobs();
  /**
   * \brief Returns true if the layer requires an equal number of bottom and
   *        top blobs.
   *
   * This method should be overridden to return true if your layer expects an
   * equal number of bottom and top blobs.
   */
  @Virtual public native @Cast("bool") @Const({false, false, true}) boolean EqualNumBottomTopBlobs();

  /**
   * \brief Return whether "anonymous" top blobs are created automatically
   *        by the layer.
   *
   * If this method returns true, Net::Init will create enough "anonymous" top
   * blobs to fulfill the requirement specified by ExactNumTopBlobs() or
   * MinTopBlobs().
   */
  @Virtual public native @Cast("bool") @Const({false, false, true}) boolean AutoTopBlobs();

  /**
   * \brief Return whether to allow force_backward for a given bottom blob
   *        index.
   *
   * If AllowForceBackward(i) == false, we will ignore the force_backward
   * setting and backpropagate to blob i only if it needs gradient information
   * (as is done when force_backward == false).
   */
  @Virtual public native @Cast("bool") @Const({false, false, true}) boolean AllowForceBackward(@Const int bottom_index);

  /**
   * \brief Specifies whether the layer should compute gradients w.r.t. a
   *        parameter at a particular index given by param_id.
   *
   * You can safely ignore false values and always compute gradients
   * for all parameters, but possibly with wasteful computation.
   */
  public native @Cast("bool") boolean param_propagate_down(@Const int param_id);
  /**
   * \brief Sets whether the layer should compute gradients w.r.t. a
   *        parameter at a particular index given by param_id.
   */
  public native void set_param_propagate_down(@Const int param_id, @Cast("const bool") boolean value);
  @Virtual(true) protected native void Forward_cpu(@Const @ByRef FloatBlobVector bottom,
        @Const @ByRef FloatBlobVector top);
  @Virtual protected native void Forward_gpu(@Const @ByRef FloatBlobVector bottom,
        @Const @ByRef FloatBlobVector top);
  @Virtual(true) protected native void Backward_cpu(@Const @ByRef FloatBlobVector top,
        @Const @ByRef BoolVector propagate_down,
        @Const @ByRef FloatBlobVector bottom);
  @Virtual protected native void Backward_gpu(@Const @ByRef FloatBlobVector top,
        @Const @ByRef BoolVector propagate_down,
        @Const @ByRef FloatBlobVector bottom);
  @Virtual protected native void CheckBlobCounts(@Const @ByRef FloatBlobVector bottom,
                                 @Const @ByRef FloatBlobVector top);
}
