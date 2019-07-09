// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_xphoto;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import org.bytedeco.opencv.opencv_photo.*;
import static org.bytedeco.opencv.global.opencv_photo.*;

import static org.bytedeco.opencv.global.opencv_xphoto.*;


/** \addtogroup xphoto
 *  \{
<p>
/** \brief This algorithm decomposes image into two layers: base layer and detail layer using bilateral filter
and compresses contrast of the base layer thus preserving all the details.
<p>
This implementation uses regular bilateral filter from OpenCV.
<p>
Saturation enhancement is possible as in cv::TonemapDrago.
<p>
For more information see \cite DD02 .
 */
@Namespace("cv::xphoto") @Properties(inherit = org.bytedeco.opencv.presets.opencv_xphoto.class)
public class TonemapDurand extends Tonemap {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TonemapDurand(Pointer p) { super(p); }


    public native float getSaturation();
    public native void setSaturation(float saturation);

    public native float getContrast();
    public native void setContrast(float contrast);

    public native float getSigmaSpace();
    public native void setSigmaSpace(float sigma_space);

    public native float getSigmaColor();
    public native void setSigmaColor(float sigma_color);
}
