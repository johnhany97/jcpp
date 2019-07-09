// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_stitching;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
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
import org.bytedeco.opencv.opencv_objdetect.*;
import static org.bytedeco.opencv.global.opencv_objdetect.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;
import org.bytedeco.opencv.opencv_shape.*;
import static org.bytedeco.opencv.global.opencv_shape.*;
import org.bytedeco.opencv.opencv_xfeatures2d.*;
import static org.bytedeco.opencv.global.opencv_xfeatures2d.*;

import static org.bytedeco.opencv.global.opencv_stitching.*;


/** \addtogroup stitching_blend
 *  \{
<p>
/** \brief Base class for all blenders.
<p>
Simple blender which puts one image over another
*/
@Namespace("cv::detail") @Properties(inherit = org.bytedeco.opencv.presets.opencv_stitching.class)
public class Blender extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Blender() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Blender(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Blender(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Blender position(long position) {
        return (Blender)super.position(position);
    }


    /** enum cv::detail::Blender:: */
    public static final int NO = 0, FEATHER = 1, MULTI_BAND = 2;
    public static native @Ptr Blender createDefault(int type, @Cast("bool") boolean try_gpu/*=false*/);
    public static native @Ptr Blender createDefault(int type);

    /** \brief Prepares the blender for blending.
    <p>
    @param corners Source images top-left corners
    @param sizes Source image sizes
     */
    public native void prepare(@Const @ByRef PointVector corners, @Const @ByRef SizeVector sizes);
    /** \overload */
    public native void prepare(@ByVal Rect dst_roi);
    /** \brief Processes the image.
    <p>
    @param img Source image
    @param mask Source image mask
    @param tl Source image top-left corners
     */
    public native void feed(@ByVal Mat img, @ByVal Mat mask, @ByVal Point tl);
    public native void feed(@ByVal UMat img, @ByVal UMat mask, @ByVal Point tl);
    public native void feed(@ByVal GpuMat img, @ByVal GpuMat mask, @ByVal Point tl);
    /** \brief Blends and returns the final pano.
    <p>
    @param dst Final pano
    @param dst_mask Final pano mask
     */
    public native void blend(@ByVal Mat dst,@ByVal Mat dst_mask);
    public native void blend(@ByVal UMat dst,@ByVal UMat dst_mask);
    public native void blend(@ByVal GpuMat dst,@ByVal GpuMat dst_mask);
}
