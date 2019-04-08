// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_tracking;

import org.bytedeco.javacpp.annotation.Index;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import org.bytedeco.opencv.opencv_plot.*;
import static org.bytedeco.opencv.global.opencv_plot.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;

import static org.bytedeco.opencv.global.opencv_tracking.*;


/** \brief This sampler is based on particle filtering.
<p>
In principle, it can be thought of as performing some sort of optimization (and indeed, this
tracker uses opencv's optim module), where tracker seeks to find the rectangle in given frame,
which is the most *"similar"* to the initial rectangle (the one, given through the constructor).
<p>
The optimization performed is stochastic and somehow resembles genetic algorithms, where on each new
image received (submitted via TrackerSamplerPF::sampling()) we start with the region bounded by
boundingBox, then generate several "perturbed" boxes, take the ones most similar to the original.
This selection round is repeated several times. At the end, we hope that only the most promising box
remaining, and these are combined to produce the subrectangle of image, which is put as a sole
element in array sample.
<p>
It should be noted, that the definition of "similarity" between two rectangles is based on comparing
their histograms. As experiments show, tracker is *not* very succesfull if target is assumed to
strongly change its dimensions.
 */
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_tracking.class)
public class TrackerSamplerPF extends TrackerSamplerAlgorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TrackerSamplerPF(Pointer p) { super(p); }

  /** \brief This structure contains all the parameters that can be varied during the course of sampling
    algorithm. Below is the structure exposed, together with its members briefly explained with
    reference to the above discussion on algorithm's working.
 */
  @NoOffset public static class Params extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Params(Pointer p) { super(p); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Params(long size) { super((Pointer)null); allocateArray(size); }
      private native void allocateArray(long size);
      @Override public Params position(long position) {
          return (Params)super.position(position);
      }
  
    public Params() { super((Pointer)null); allocate(); }
    private native void allocate();
    /** number of selection rounds */
    public native int iterationNum(); public native Params iterationNum(int setter);
    /** number of "perturbed" boxes on each round */
    public native int particlesNum(); public native Params particlesNum(int setter);
    /** with each new round we exponentially decrease the amount of "perturbing" we allow (like in simulated annealing)
     *  and this very alpha controls how fast annealing happens, ie. how fast perturbing decreases */
    public native double alpha(); public native Params alpha(double setter);
  }
  /** \brief Constructor
    @param chosenRect Initial rectangle, that is supposed to contain target we'd like to track.
    @param parameters
     */
  public TrackerSamplerPF(@Const @ByRef Mat chosenRect,@Const @ByRef(nullValue = "cv::TrackerSamplerPF::Params()") Params parameters) { super((Pointer)null); allocate(chosenRect, parameters); }
  private native void allocate(@Const @ByRef Mat chosenRect,@Const @ByRef(nullValue = "cv::TrackerSamplerPF::Params()") Params parameters);
  public TrackerSamplerPF(@Const @ByRef Mat chosenRect) { super((Pointer)null); allocate(chosenRect); }
  private native void allocate(@Const @ByRef Mat chosenRect);
}
