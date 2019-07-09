// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_xfeatures2d;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
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
import org.bytedeco.opencv.opencv_shape.*;
import static org.bytedeco.opencv.global.opencv_shape.*;

import static org.bytedeco.opencv.global.opencv_xfeatures2d.*;


/** \addtogroup xfeatures2d_experiment
 *  \{
<p>
/** \brief Class implementing the FREAK (*Fast Retina Keypoint*) keypoint descriptor, described in \cite AOV12 .
<p>
The algorithm propose a novel keypoint descriptor inspired by the human visual system and more
precisely the retina, coined Fast Retina Key- point (FREAK). A cascade of binary strings is
computed by efficiently comparing image intensities over a retinal sampling pattern. FREAKs are in
general faster to compute with lower memory load and also more robust than SIFT, SURF or BRISK.
They are competitive alternatives to existing keypoints in particular for embedded applications.
<p>
\note
   -   An example on how to use the FREAK descriptor can be found at
        opencv_source_code/samples/cpp/freak_demo.cpp
 */
@Namespace("cv::xfeatures2d") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_xfeatures2d.class)
public class FREAK extends Feature2D {
    static { Loader.load(); }
    /** Default native constructor. */
    public FREAK() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FREAK(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FREAK(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FREAK position(long position) {
        return (FREAK)super.position(position);
    }


    @MemberGetter public static native int NB_SCALES();
    public static final int NB_SCALES = NB_SCALES();
    @MemberGetter public static native int NB_PAIRS();
    public static final int NB_PAIRS = NB_PAIRS();
    @MemberGetter public static native int NB_ORIENPAIRS();
    public static final int NB_ORIENPAIRS = NB_ORIENPAIRS();

    /**
    @param orientationNormalized Enable orientation normalization.
    @param scaleNormalized Enable scale normalization.
    @param patternScale Scaling of the description pattern.
    @param nOctaves Number of octaves covered by the detected keypoints.
    @param selectedPairs (Optional) user defined selected pairs indexes,
     */
    public static native @Ptr FREAK create(@Cast("bool") boolean orientationNormalized/*=true*/,
                                 @Cast("bool") boolean scaleNormalized/*=true*/,
                                 float patternScale/*=22.0f*/,
                                 int nOctaves/*=4*/,
                                 @StdVector IntPointer selectedPairs/*=std::vector<int>()*/);
    public static native @Ptr FREAK create();
    public static native @Ptr FREAK create(@Cast("bool") boolean orientationNormalized/*=true*/,
                                 @Cast("bool") boolean scaleNormalized/*=true*/,
                                 float patternScale/*=22.0f*/,
                                 int nOctaves/*=4*/,
                                 @StdVector IntBuffer selectedPairs/*=std::vector<int>()*/);
    public static native @Ptr FREAK create(@Cast("bool") boolean orientationNormalized/*=true*/,
                                 @Cast("bool") boolean scaleNormalized/*=true*/,
                                 float patternScale/*=22.0f*/,
                                 int nOctaves/*=4*/,
                                 @StdVector int[] selectedPairs/*=std::vector<int>()*/);
}
