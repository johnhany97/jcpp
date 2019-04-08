// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_bgsegm;

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
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;

import static org.bytedeco.opencv.global.opencv_bgsegm.*;


/** \brief Implementation of the different yet better algorithm which is called GSOC, as it was implemented during GSOC and was not originated from any paper.
<p>
This algorithm demonstrates better performance on CDNET 2014 dataset compared to other algorithms in OpenCV.
 */
@Namespace("cv::bgsegm") @Properties(inherit = org.bytedeco.opencv.presets.opencv_bgsegm.class)
public class BackgroundSubtractorGSOC extends BackgroundSubtractor {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BackgroundSubtractorGSOC(Pointer p) { super(p); }

    // BackgroundSubtractor interface
    public native @Override void apply(@ByVal Mat image, @ByVal Mat fgmask, double learningRate/*=-1*/);
    public native void apply(@ByVal Mat image, @ByVal Mat fgmask);
    public native @Override void apply(@ByVal UMat image, @ByVal UMat fgmask, double learningRate/*=-1*/);
    public native void apply(@ByVal UMat image, @ByVal UMat fgmask);
    public native @Override void apply(@ByVal GpuMat image, @ByVal GpuMat fgmask, double learningRate/*=-1*/);
    public native void apply(@ByVal GpuMat image, @ByVal GpuMat fgmask);

    public native @Override void getBackgroundImage(@ByVal Mat backgroundImage);
    public native @Override void getBackgroundImage(@ByVal UMat backgroundImage);
    public native @Override void getBackgroundImage(@ByVal GpuMat backgroundImage);
}
