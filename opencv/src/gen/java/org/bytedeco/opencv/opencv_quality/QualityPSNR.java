// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_quality;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;

import static org.bytedeco.opencv.global.opencv_quality.*;


/**
\brief Full reference peak signal to noise ratio (PSNR) algorithm  https://en.wikipedia.org/wiki/Peak_signal-to-noise_ratio
*/
@Namespace("cv::quality") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_quality.class)
public class QualityPSNR extends QualityBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QualityPSNR(Pointer p) { super(p); }


    /** \brief Default maximum pixel value */
// #if __cplusplus >= 201103L || (defined(_MSC_VER) && _MSC_VER >= 1900/*MSVS 2015*/)
    @MemberGetter public static native double MAX_PIXEL_VALUE_DEFAULT();
    public static final double MAX_PIXEL_VALUE_DEFAULT = MAX_PIXEL_VALUE_DEFAULT();
// #else
    // support MSVS 2013
// #endif

    /**
    \brief Create an object which calculates quality via mean square error
    @param refImgs input image(s) to use as the source for comparison
    @param maxPixelValue maximum per-channel value for any individual pixel; eg 255 for uint8 image
    */
    public static native @Ptr QualityPSNR create(@ByVal MatVector refImgs, double maxPixelValue/*=cv::quality::QualityPSNR::MAX_PIXEL_VALUE_DEFAULT*/ );
    public static native @Ptr QualityPSNR create(@ByVal MatVector refImgs );
    public static native @Ptr QualityPSNR create(@ByVal UMatVector refImgs, double maxPixelValue/*=cv::quality::QualityPSNR::MAX_PIXEL_VALUE_DEFAULT*/ );
    public static native @Ptr QualityPSNR create(@ByVal UMatVector refImgs );
    public static native @Ptr QualityPSNR create(@ByVal GpuMatVector refImgs, double maxPixelValue/*=cv::quality::QualityPSNR::MAX_PIXEL_VALUE_DEFAULT*/ );
    public static native @Ptr QualityPSNR create(@ByVal GpuMatVector refImgs );

    /**
    \brief compute the PSNR
    @param cmpImgs Comparison images
    @return Per-channel PSNR value, or std::numeric_limits<double>::infinity() if the MSE between the two images == 0
    The PSNR for multi-frame images is computed by calculating the average MSE of all frames and then generating the PSNR from that value
    */
    public native @ByVal @Override Scalar compute(@ByVal MatVector cmpImgs);
    public native @ByVal @Override Scalar compute(@ByVal UMatVector cmpImgs);
    public native @ByVal @Override Scalar compute(@ByVal GpuMatVector cmpImgs);

    /** \brief Implements Algorithm::empty()  */
    public native @Cast("bool") @Override boolean empty();

    /** \brief Implements Algorithm::clear()  */
    public native @Override void clear();

    /**
    \brief static method for computing quality
    @param refImgs reference image(s)
    @param cmpImgs comparison image(s)
    @param qualityMaps output quality map(s), or cv::noArray()
    @param maxPixelValue maximum per-channel value for any individual pixel; eg 255 for uint8 image
    @return PSNR value, or std::numeric_limits<double>::infinity() if the MSE between the two images == 0
    The PSNR for multi-frame images is computed by calculating the average MSE of all frames and then generating the PSNR from that value
    */
    public static native @ByVal Scalar compute(@ByVal MatVector refImgs, @ByVal MatVector cmpImgs, @ByVal MatVector qualityMaps, double maxPixelValue/*=cv::quality::QualityPSNR::MAX_PIXEL_VALUE_DEFAULT*/);
    public static native @ByVal Scalar compute(@ByVal MatVector refImgs, @ByVal MatVector cmpImgs, @ByVal MatVector qualityMaps);
    public static native @ByVal Scalar compute(@ByVal UMatVector refImgs, @ByVal UMatVector cmpImgs, @ByVal UMatVector qualityMaps, double maxPixelValue/*=cv::quality::QualityPSNR::MAX_PIXEL_VALUE_DEFAULT*/);
    public static native @ByVal Scalar compute(@ByVal UMatVector refImgs, @ByVal UMatVector cmpImgs, @ByVal UMatVector qualityMaps);
    public static native @ByVal Scalar compute(@ByVal GpuMatVector refImgs, @ByVal GpuMatVector cmpImgs, @ByVal GpuMatVector qualityMaps, double maxPixelValue/*=cv::quality::QualityPSNR::MAX_PIXEL_VALUE_DEFAULT*/);
    public static native @ByVal Scalar compute(@ByVal GpuMatVector refImgs, @ByVal GpuMatVector cmpImgs, @ByVal GpuMatVector qualityMaps);

    /** \brief return the maximum pixel value used for PSNR computation */
    public native double getMaxPixelValue();

    /**
    \brief sets the maximum pixel value used for PSNR computation
    @param val Maximum pixel value
    */
    public native void setMaxPixelValue(double val);

}
