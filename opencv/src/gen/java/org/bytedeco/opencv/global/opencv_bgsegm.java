// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.global;

import org.bytedeco.opencv.opencv_bgsegm.*;

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

public class opencv_bgsegm extends org.bytedeco.opencv.presets.opencv_bgsegm {
    static { Loader.load(); }

// Parsed from <opencv2/bgsegm.hpp>

/*
By downloading, copying, installing or using the software you agree to this
license. If you do not agree to this license, do not download, install,
copy or use the software.


                          License Agreement
               For Open Source Computer Vision Library
                       (3-clause BSD License)

Copyright (C) 2013, OpenCV Foundation, all rights reserved.
Third party copyrights are property of their respective owners.

Redistribution and use in source and binary forms, with or without modification,
are permitted provided that the following conditions are met:

  * Redistributions of source code must retain the above copyright notice,
    this list of conditions and the following disclaimer.

  * Redistributions in binary form must reproduce the above copyright notice,
    this list of conditions and the following disclaimer in the documentation
    and/or other materials provided with the distribution.

  * Neither the names of the copyright holders nor the names of the contributors
    may be used to endorse or promote products derived from this software
    without specific prior written permission.

This software is provided by the copyright holders and contributors "as is" and
any express or implied warranties, including, but not limited to, the implied
warranties of merchantability and fitness for a particular purpose are
disclaimed. In no event shall copyright holders or contributors be liable for
any direct, indirect, incidental, special, exemplary, or consequential damages
(including, but not limited to, procurement of substitute goods or services;
loss of use, data, or profits; or business interruption) however caused
and on any theory of liability, whether in contract, strict liability,
or tort (including negligence or otherwise) arising in any way out of
the use of this software, even if advised of the possibility of such damage.
*/

// #ifndef __OPENCV_BGSEGM_HPP__
// #define __OPENCV_BGSEGM_HPP__

// #include "opencv2/video.hpp"

// #ifdef __cplusplus

/** \defgroup bgsegm Improved Background-Foreground Segmentation Methods
*/
// Targeting ../opencv_bgsegm/BackgroundSubtractorMOG.java



/** \brief Creates mixture-of-gaussian background subtractor
<p>
@param history Length of the history.
@param nmixtures Number of Gaussian mixtures.
@param backgroundRatio Background ratio.
@param noiseSigma Noise strength (standard deviation of the brightness or each color channel). 0
means some automatic value.
 */
@Namespace("cv::bgsegm") public static native @Ptr BackgroundSubtractorMOG createBackgroundSubtractorMOG(int history/*=200*/, int nmixtures/*=5*/,
                                  double backgroundRatio/*=0.7*/, double noiseSigma/*=0*/);
@Namespace("cv::bgsegm") public static native @Ptr BackgroundSubtractorMOG createBackgroundSubtractorMOG();
// Targeting ../opencv_bgsegm/BackgroundSubtractorGMG.java



/** \brief Creates a GMG Background Subtractor
<p>
@param initializationFrames number of frames used to initialize the background models.
@param decisionThreshold Threshold value, above which it is marked foreground, else background.
 */
@Namespace("cv::bgsegm") public static native @Ptr BackgroundSubtractorGMG createBackgroundSubtractorGMG(int initializationFrames/*=120*/,
                                                                        double decisionThreshold/*=0.8*/);
@Namespace("cv::bgsegm") public static native @Ptr BackgroundSubtractorGMG createBackgroundSubtractorGMG();
// Targeting ../opencv_bgsegm/BackgroundSubtractorCNT.java



/** \brief Creates a CNT Background Subtractor
<p>
@param minPixelStability number of frames with same pixel color to consider stable
@param useHistory determines if we're giving a pixel credit for being stable for a long time
@param maxPixelStability maximum allowed credit for a pixel in history
@param isParallel determines if we're parallelizing the algorithm
 */

@Namespace("cv::bgsegm") public static native @Ptr BackgroundSubtractorCNT createBackgroundSubtractorCNT(int minPixelStability/*=15*/,
                              @Cast("bool") boolean useHistory/*=true*/,
                              int maxPixelStability/*=15*60*/,
                              @Cast("bool") boolean isParallel/*=true*/);
@Namespace("cv::bgsegm") public static native @Ptr BackgroundSubtractorCNT createBackgroundSubtractorCNT();

/** enum cv::bgsegm::LSBPCameraMotionCompensation */
public static final int
    LSBP_CAMERA_MOTION_COMPENSATION_NONE = 0,
    LSBP_CAMERA_MOTION_COMPENSATION_LK = 1;
// Targeting ../opencv_bgsegm/BackgroundSubtractorGSOC.java


// Targeting ../opencv_bgsegm/BackgroundSubtractorLSBP.java


// Targeting ../opencv_bgsegm/BackgroundSubtractorLSBPDesc.java



/** \brief Creates an instance of BackgroundSubtractorGSOC algorithm.
<p>
Implementation of the different yet better algorithm which is called GSOC, as it was implemented during GSOC and was not originated from any paper.
<p>
@param mc Whether to use camera motion compensation.
@param nSamples Number of samples to maintain at each point of the frame.
@param replaceRate Probability of replacing the old sample - how fast the model will update itself.
@param propagationRate Probability of propagating to neighbors.
@param hitsThreshold How many positives the sample must get before it will be considered as a possible replacement.
@param alpha Scale coefficient for threshold.
@param beta Bias coefficient for threshold.
@param blinkingSupressionDecay Blinking supression decay factor.
@param blinkingSupressionMultiplier Blinking supression multiplier.
@param noiseRemovalThresholdFacBG Strength of the noise removal for background points.
@param noiseRemovalThresholdFacFG Strength of the noise removal for foreground points.
 */
@Namespace("cv::bgsegm") public static native @Ptr BackgroundSubtractorGSOC createBackgroundSubtractorGSOC(int mc/*=cv::bgsegm::LSBP_CAMERA_MOTION_COMPENSATION_NONE*/, int nSamples/*=20*/, float replaceRate/*=0.003f*/, float propagationRate/*=0.01f*/, int hitsThreshold/*=32*/, float alpha/*=0.01f*/, float beta/*=0.0022f*/, float blinkingSupressionDecay/*=0.1f*/, float blinkingSupressionMultiplier/*=0.1f*/, float noiseRemovalThresholdFacBG/*=0.0004f*/, float noiseRemovalThresholdFacFG/*=0.0008f*/);
@Namespace("cv::bgsegm") public static native @Ptr BackgroundSubtractorGSOC createBackgroundSubtractorGSOC();

/** \brief Creates an instance of BackgroundSubtractorLSBP algorithm.
<p>
Background Subtraction using Local SVD Binary Pattern. More details about the algorithm can be found at \cite LGuo2016
<p>
@param mc Whether to use camera motion compensation.
@param nSamples Number of samples to maintain at each point of the frame.
@param LSBPRadius LSBP descriptor radius.
@param Tlower Lower bound for T-values. See \cite LGuo2016 for details.
@param Tupper Upper bound for T-values. See \cite LGuo2016 for details.
@param Tinc Increase step for T-values. See \cite LGuo2016 for details.
@param Tdec Decrease step for T-values. See \cite LGuo2016 for details.
@param Rscale Scale coefficient for threshold values.
@param Rincdec Increase/Decrease step for threshold values.
@param noiseRemovalThresholdFacBG Strength of the noise removal for background points.
@param noiseRemovalThresholdFacFG Strength of the noise removal for foreground points.
@param LSBPthreshold Threshold for LSBP binary string.
@param minCount Minimal number of matches for sample to be considered as foreground.
 */
@Namespace("cv::bgsegm") public static native @Ptr BackgroundSubtractorLSBP createBackgroundSubtractorLSBP(int mc/*=cv::bgsegm::LSBP_CAMERA_MOTION_COMPENSATION_NONE*/, int nSamples/*=20*/, int LSBPRadius/*=16*/, float Tlower/*=2.0f*/, float Tupper/*=32.0f*/, float Tinc/*=1.0f*/, float Tdec/*=0.05f*/, float Rscale/*=10.0f*/, float Rincdec/*=0.005f*/, float noiseRemovalThresholdFacBG/*=0.0004f*/, float noiseRemovalThresholdFacFG/*=0.0008f*/, int LSBPthreshold/*=8*/, int minCount/*=2*/);
@Namespace("cv::bgsegm") public static native @Ptr BackgroundSubtractorLSBP createBackgroundSubtractorLSBP();
// Targeting ../opencv_bgsegm/SyntheticSequenceGenerator.java



/** \brief Creates an instance of SyntheticSequenceGenerator.
<p>
@param background Background image for object.
@param object Object image which will move slowly over the background.
@param amplitude Amplitude of wave distortion applied to background.
@param wavelength Length of waves in distortion applied to background.
@param wavespeed How fast waves will move.
@param objspeed How fast object will fly over background.
 */
@Namespace("cv::bgsegm") public static native @Ptr SyntheticSequenceGenerator createSyntheticSequenceGenerator(@ByVal Mat background, @ByVal Mat object, double amplitude/*=2.0*/, double wavelength/*=20.0*/, double wavespeed/*=0.2*/, double objspeed/*=6.0*/);
@Namespace("cv::bgsegm") public static native @Ptr SyntheticSequenceGenerator createSyntheticSequenceGenerator(@ByVal Mat background, @ByVal Mat object);
@Namespace("cv::bgsegm") public static native @Ptr SyntheticSequenceGenerator createSyntheticSequenceGenerator(@ByVal UMat background, @ByVal UMat object, double amplitude/*=2.0*/, double wavelength/*=20.0*/, double wavespeed/*=0.2*/, double objspeed/*=6.0*/);
@Namespace("cv::bgsegm") public static native @Ptr SyntheticSequenceGenerator createSyntheticSequenceGenerator(@ByVal UMat background, @ByVal UMat object);
@Namespace("cv::bgsegm") public static native @Ptr SyntheticSequenceGenerator createSyntheticSequenceGenerator(@ByVal GpuMat background, @ByVal GpuMat object, double amplitude/*=2.0*/, double wavelength/*=20.0*/, double wavespeed/*=0.2*/, double objspeed/*=6.0*/);
@Namespace("cv::bgsegm") public static native @Ptr SyntheticSequenceGenerator createSyntheticSequenceGenerator(@ByVal GpuMat background, @ByVal GpuMat object);

/** \} */




// #endif
// #endif


}
