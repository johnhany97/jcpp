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


/** \brief the KCF (Kernelized Correlation Filter) tracker
 <p>
 * KCF is a novel tracking framework that utilizes properties of circulant matrix to enhance the processing speed.
 * This tracking method is an implementation of \cite KCF_ECCV which is extended to KCF with color-names features (\cite KCF_CN).
 * The original paper of KCF is available at <http://www.robots.ox.ac.uk/~joao/publications/henriques_tpami2015.pdf>
 * as well as the matlab implementation. For more information about KCF with color-names features, please refer to
 * <http://www.cvl.isy.liu.se/research/objrec/visualtracking/colvistrack/index.html>.
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_tracking.class)
public class TrackerKCF extends Tracker {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TrackerKCF(Pointer p) { super(p); }

  /**
  * \brief Feature type to be used in the tracking grayscale, colornames, compressed color-names
  * The modes available now:
  -   "GRAY" -- Use grayscale values as the feature
  -   "CN" -- Color-names feature
  */
  /** enum cv::TrackerKCF::MODE */
  public static final int
    GRAY   = (1 << 0),
    CN     = (1 << 1),
    CUSTOM = (1 << 2);

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
  
    /**
    * \brief Constructor
    */
    public Params() { super((Pointer)null); allocate(); }
    private native void allocate();

    /**
    * \brief Read parameters from a file
    */
    public native void read(@Const @ByRef FileNode arg0);

    /**
    * \brief Write parameters to a file
    */
    public native void write(@ByRef FileStorage arg0);

    /**  detection confidence threshold */
    public native float detect_thresh(); public native Params detect_thresh(float setter);
    /**  gaussian kernel bandwidth */
    public native float sigma(); public native Params sigma(float setter);
    /**  regularization */
    public native float lambda(); public native Params lambda(float setter);
    /**  linear interpolation factor for adaptation */
    public native float interp_factor(); public native Params interp_factor(float setter);
    /**  spatial bandwidth (proportional to target) */
    public native float output_sigma_factor(); public native Params output_sigma_factor(float setter);
    /**  compression learning rate */
    public native float pca_learning_rate(); public native Params pca_learning_rate(float setter);
    /**  activate the resize feature to improve the processing speed */
    public native @Cast("bool") boolean resize(); public native Params resize(boolean setter);
    /**  split the training coefficients into two matrices */
    public native @Cast("bool") boolean split_coeff(); public native Params split_coeff(boolean setter);
    /**  wrap around the kernel values */
    public native @Cast("bool") boolean wrap_kernel(); public native Params wrap_kernel(boolean setter);
    /**  activate the pca method to compress the features */
    public native @Cast("bool") boolean compress_feature(); public native Params compress_feature(boolean setter);
    /**  threshold for the ROI size */
    public native int max_patch_size(); public native Params max_patch_size(int setter);
    /**  feature size after compression */
    public native int compressed_size(); public native Params compressed_size(int setter);
    /**  compressed descriptors of TrackerKCF::MODE */
    public native int desc_pca(); public native Params desc_pca(int setter);
    /**  non-compressed descriptors of TrackerKCF::MODE */
    public native int desc_npca(); public native Params desc_npca(int setter);
  }

  public static class Arg0_Mat_Rect_Mat extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Arg0_Mat_Rect_Mat(Pointer p) { super(p); }
      protected Arg0_Mat_Rect_Mat() { allocate(); }
      private native void allocate();
      public native void call(@Const @ByVal Mat arg0, @Const @ByVal Rect arg1, @ByRef Mat arg2);
  }
  public native void setFeatureExtractor(Arg0_Mat_Rect_Mat arg0, @Cast("bool") boolean pca_func/*=false*/);
  public native void setFeatureExtractor(Arg0_Mat_Rect_Mat arg0);

  /** \brief Constructor
  @param parameters KCF parameters TrackerKCF::Params
  */
  public static native @Ptr TrackerKCF create(@Const @ByRef Params parameters);

  public static native @Ptr TrackerKCF create();
}
