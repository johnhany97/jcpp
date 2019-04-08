// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_features2d;

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

import static org.bytedeco.opencv.global.opencv_features2d.*;


/** \brief Maximally stable extremal region extractor
<p>
The class encapsulates all the parameters of the %MSER extraction algorithm (see [wiki
article](http://en.wikipedia.org/wiki/Maximally_stable_extremal_regions)).
<p>
- there are two different implementation of %MSER: one for grey image, one for color image
<p>
- the grey image algorithm is taken from: \cite nister2008linear ;  the paper claims to be faster
than union-find method; it actually get 1.5~2m/s on my centrino L7200 1.2GHz laptop.
<p>
- the color image algorithm is taken from: \cite forssen2007maximally ; it should be much slower
than grey image method ( 3~4 times ); the chi_table.h file is taken directly from paper's source
code which is distributed under GPL.
<p>
- (Python) A complete example showing the use of the %MSER detector can be found at samples/python/mser.py
*/
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_features2d.class)
public class MSER extends Feature2D {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MSER(Pointer p) { super(p); }

    /** \brief Full consturctor for %MSER detector
    <p>
    @param _delta it compares {@code (size_{i}-size_{i-delta})/size_{i-delta}}
    @param _min_area prune the area which smaller than minArea
    @param _max_area prune the area which bigger than maxArea
    @param _max_variation prune the area have similar size to its children
    @param _min_diversity for color image, trace back to cut off mser with diversity less than min_diversity
    @param _max_evolution  for color image, the evolution steps
    @param _area_threshold for color image, the area threshold to cause re-initialize
    @param _min_margin for color image, ignore too small margin
    @param _edge_blur_size for color image, the aperture size for edge blur
     */
    public static native @Ptr MSER create( int _delta/*=5*/, int _min_area/*=60*/, int _max_area/*=14400*/,
              double _max_variation/*=0.25*/, double _min_diversity/*=.2*/,
              int _max_evolution/*=200*/, double _area_threshold/*=1.01*/,
              double _min_margin/*=0.003*/, int _edge_blur_size/*=5*/ );
    public static native @Ptr MSER create( );

    /** \brief Detect %MSER regions
    <p>
    @param image input image (8UC1, 8UC3 or 8UC4, must be greater or equal than 3x3)
    @param msers resulting list of point sets
    @param bboxes resulting bounding boxes
    */
    public native void detectRegions( @ByVal Mat image,
                                            @ByRef PointVectorVector msers,
                                            @ByRef RectVector bboxes );
    public native void detectRegions( @ByVal UMat image,
                                            @ByRef PointVectorVector msers,
                                            @ByRef RectVector bboxes );
    public native void detectRegions( @ByVal GpuMat image,
                                            @ByRef PointVectorVector msers,
                                            @ByRef RectVector bboxes );

    public native void setDelta(int delta);
    public native int getDelta();

    public native void setMinArea(int minArea);
    public native int getMinArea();

    public native void setMaxArea(int maxArea);
    public native int getMaxArea();

    public native void setPass2Only(@Cast("bool") boolean f);
    public native @Cast("bool") boolean getPass2Only();
    public native @Str @Override BytePointer getDefaultName();
}
