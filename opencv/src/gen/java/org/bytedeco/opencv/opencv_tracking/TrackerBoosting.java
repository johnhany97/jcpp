// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_tracking;

import org.bytedeco.javacpp.annotation.Index;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
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


/** \brief the Boosting tracker
<p>
This is a real-time object tracking based on a novel on-line version of the AdaBoost algorithm.
The classifier uses the surrounding background as negative examples in update step to avoid the
drifting problem. The implementation is based on \cite OLB .
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_tracking.class)
public class TrackerBoosting extends Tracker {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TrackerBoosting(Pointer p) { super(p); }

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
    /**the number of classifiers to use in a OnlineBoosting algorithm */
    public native int numClassifiers(); public native Params numClassifiers(int setter);
    /**search region parameters to use in a OnlineBoosting algorithm */
    public native float samplerOverlap(); public native Params samplerOverlap(float setter);
    /** search region parameters to use in a OnlineBoosting algorithm */
    public native float samplerSearchFactor(); public native Params samplerSearchFactor(float setter);
    /**the initial iterations */
    public native int iterationInit(); public native Params iterationInit(int setter);
    /** # features */
    public native int featureSetNumFeatures(); public native Params featureSetNumFeatures(int setter);
    /**
     * \brief Read parameters from a file
     */
    public native void read( @Const @ByRef FileNode fn );

    /**
     * \brief Write parameters to a file
     */
    public native void write( @ByRef FileStorage fs );
  }

  /** \brief Constructor
    @param parameters BOOSTING parameters TrackerBoosting::Params
     */
  public static native @Ptr TrackerBoosting create(@Const @ByRef Params parameters);

  public static native @Ptr TrackerBoosting create();
}
