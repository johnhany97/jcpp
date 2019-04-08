// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_ximgproc;

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

import static org.bytedeco.opencv.global.opencv_ximgproc.*;


/** \brief Disparity map filter based on Weighted Least Squares filter (in form of Fast Global Smoother that
is a lot faster than traditional Weighted Least Squares filter implementations) and optional use of
left-right-consistency-based confidence to refine the results in half-occlusions and uniform areas.
 */
@Namespace("cv::ximgproc") @Properties(inherit = org.bytedeco.opencv.presets.opencv_ximgproc.class)
public class DisparityWLSFilter extends DisparityFilter {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DisparityWLSFilter(Pointer p) { super(p); }

    /** filter parameters */

    /** \brief Lambda is a parameter defining the amount of regularization during filtering. Larger values force
    filtered disparity map edges to adhere more to source image edges. Typical value is 8000.
     */
    public native double getLambda();
    /** @see getLambda */
    public native void setLambda(double _lambda);
    /** \brief SigmaColor is a parameter defining how sensitive the filtering process is to source image edges.
    Large values can lead to disparity leakage through low-contrast edges. Small values can make the filter too
    sensitive to noise and textures in the source image. Typical values range from 0.8 to 2.0.
     */
    public native double getSigmaColor();
    /** @see getSigmaColor */
    public native void setSigmaColor(double _sigma_color);

    /** confidence-related parameters */

    /** \brief LRCthresh is a threshold of disparity difference used in left-right-consistency check during
    confidence map computation. The default value of 24 (1.5 pixels) is virtually always good enough.
     */
    public native int getLRCthresh();
    /** @see getLRCthresh */
    public native void setLRCthresh(int _LRC_thresh);
    /** \brief DepthDiscontinuityRadius is a parameter used in confidence computation. It defines the size of
    low-confidence regions around depth discontinuities.
     */
    public native int getDepthDiscontinuityRadius();
    /** @see getDepthDiscontinuityRadius */
    public native void setDepthDiscontinuityRadius(int _disc_radius);
    /** \brief Get the confidence map that was used in the last filter call. It is a CV_32F one-channel image
    with values ranging from 0.0 (totally untrusted regions of the raw disparity map) to 255.0 (regions containing
    correct disparity values with a high degree of confidence).
     */
    public native @ByVal Mat getConfidenceMap();
    /** \brief Get the ROI used in the last filter call
     */
    public native @ByVal Rect getROI();
}
