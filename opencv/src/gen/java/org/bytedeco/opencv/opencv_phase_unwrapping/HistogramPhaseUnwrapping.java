// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_phase_unwrapping;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.opencv.global.opencv_phase_unwrapping.*;

/** \addtogroup phase_unwrapping
 *  \{
    <p>
    /** \brief Class implementing two-dimensional phase unwrapping based on \cite histogramUnwrapping
     * This algorithm belongs to the quality-guided phase unwrapping methods.
     * First, it computes a reliability map from second differences between a pixel and its eight neighbours.
     * Reliability values lie between 0 and 16*pi*pi. Then, this reliability map is used to compute
     * the reliabilities of "edges". An edge is an entity defined by two pixels that are connected
     * horizontally or vertically. Its reliability is found by adding the the reliabilities of the
     * two pixels connected through it. Edges are sorted in a histogram based on their reliability values.
     * This histogram is then used to unwrap pixels, starting from the highest quality pixel.
     <p>
     * The wrapped phase map and the unwrapped result are stored in CV_32FC1 Mat.
     */
@Namespace("cv::phase_unwrapping") @Properties(inherit = org.bytedeco.opencv.presets.opencv_phase_unwrapping.class)
public class HistogramPhaseUnwrapping extends PhaseUnwrapping {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HistogramPhaseUnwrapping(Pointer p) { super(p); }

    /**
     * \brief Parameters of phaseUnwrapping constructor.
     <p>
     * @param width Phase map width.
     * @param height Phase map height.
     * @param histThresh Bins in the histogram are not of equal size. Default value is 3*pi*pi. The one before "histThresh" value are smaller.
     * @param nbrOfSmallBins Number of bins between 0 and "histThresh". Default value is 10.
     * @param nbrOfLargeBins Number of bins between "histThresh" and 32*pi*pi (highest edge reliability value). Default value is 5.
     */
    @NoOffset public static class Params extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Params(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public Params(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public Params position(long position) {
            return (Params)super.position(position);
        }
    
        public Params() { super((Pointer)null); allocate(); }
        private native void allocate();
        public native int width(); public native Params width(int setter);
        public native int height(); public native Params height(int setter);
        public native float histThresh(); public native Params histThresh(float setter);
        public native int nbrOfSmallBins(); public native Params nbrOfSmallBins(int setter);
        public native int nbrOfLargeBins(); public native Params nbrOfLargeBins(int setter);
    }
    /**
     * \brief Constructor
     <p>
     * @param parameters HistogramPhaseUnwrapping parameters HistogramPhaseUnwrapping::Params: width,height of the phase map and histogram characteristics.
     */
    public static native @Ptr HistogramPhaseUnwrapping create( @Const @ByRef(nullValue = "cv::phase_unwrapping::HistogramPhaseUnwrapping::Params()") Params parameters );
    public static native @Ptr HistogramPhaseUnwrapping create( );

    /**
     * \brief Get the reliability map computed from the wrapped phase map.
     <p>
     * @param reliabilityMap Image where the reliability map is stored.
     */
    public native void getInverseReliabilityMap( @ByVal Mat reliabilityMap );
    public native void getInverseReliabilityMap( @ByVal UMat reliabilityMap );
    public native void getInverseReliabilityMap( @ByVal GpuMat reliabilityMap );
}
