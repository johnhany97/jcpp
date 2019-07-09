// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_bgsegm;

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
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;

import static org.bytedeco.opencv.global.opencv_bgsegm.*;


/** \brief Synthetic frame sequence generator for testing background subtraction algorithms.
 <p>
 It will generate the moving object on top of the background.
 It will apply some distortion to the background to make the test more complex.
 */
@Namespace("cv::bgsegm") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_bgsegm.class)
public class SyntheticSequenceGenerator extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SyntheticSequenceGenerator(Pointer p) { super(p); }

    /** \brief Creates an instance of SyntheticSequenceGenerator.
    <p>
    @param background Background image for object.
    @param object Object image which will move slowly over the background.
    @param amplitude Amplitude of wave distortion applied to background.
    @param wavelength Length of waves in distortion applied to background.
    @param wavespeed How fast waves will move.
    @param objspeed How fast object will fly over background.
     */
    public SyntheticSequenceGenerator(@ByVal Mat background, @ByVal Mat object, double amplitude, double wavelength, double wavespeed, double objspeed) { super((Pointer)null); allocate(background, object, amplitude, wavelength, wavespeed, objspeed); }
    private native void allocate(@ByVal Mat background, @ByVal Mat object, double amplitude, double wavelength, double wavespeed, double objspeed);
    public SyntheticSequenceGenerator(@ByVal UMat background, @ByVal UMat object, double amplitude, double wavelength, double wavespeed, double objspeed) { super((Pointer)null); allocate(background, object, amplitude, wavelength, wavespeed, objspeed); }
    private native void allocate(@ByVal UMat background, @ByVal UMat object, double amplitude, double wavelength, double wavespeed, double objspeed);
    public SyntheticSequenceGenerator(@ByVal GpuMat background, @ByVal GpuMat object, double amplitude, double wavelength, double wavespeed, double objspeed) { super((Pointer)null); allocate(background, object, amplitude, wavelength, wavespeed, objspeed); }
    private native void allocate(@ByVal GpuMat background, @ByVal GpuMat object, double amplitude, double wavelength, double wavespeed, double objspeed);

    /** \brief Obtain the next frame in the sequence.
    <p>
    @param frame Output frame.
    @param gtMask Output ground-truth (reference) segmentation mask object/background.
     */
    public native void getNextFrame(@ByVal Mat frame, @ByVal Mat gtMask);
    public native void getNextFrame(@ByVal UMat frame, @ByVal UMat gtMask);
    public native void getNextFrame(@ByVal GpuMat frame, @ByVal GpuMat gtMask);
}
