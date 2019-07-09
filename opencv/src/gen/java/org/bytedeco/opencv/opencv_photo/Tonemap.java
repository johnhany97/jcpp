// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_photo;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.opencv.global.opencv_photo.*;


/** \brief Base class for tonemapping algorithms - tools that are used to map HDR image to 8-bit range.
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_photo.class)
public class Tonemap extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Tonemap(Pointer p) { super(p); }

    /** \brief Tonemaps image
    <p>
    @param src source image - CV_32FC3 Mat (float 32 bits 3 channels)
    @param dst destination image - CV_32FC3 Mat with values in [0, 1] range
     */
    public native void process(@ByVal Mat src, @ByVal Mat dst);
    public native void process(@ByVal UMat src, @ByVal UMat dst);
    public native void process(@ByVal GpuMat src, @ByVal GpuMat dst);

    public native float getGamma();
    public native void setGamma(float gamma);
}
