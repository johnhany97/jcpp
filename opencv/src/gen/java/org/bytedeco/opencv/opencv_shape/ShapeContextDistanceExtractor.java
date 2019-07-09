// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_shape;

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

import static org.bytedeco.opencv.global.opencv_shape.*;


/***********************************************************************************/
/***********************************************************************************/
/***********************************************************************************/
/** \brief Implementation of the Shape Context descriptor and matching algorithm
<p>
proposed by Belongie et al. in "Shape Matching and Object Recognition Using Shape Contexts" (PAMI
2002). This implementation is packaged in a generic scheme, in order to allow you the
implementation of the common variations of the original pipeline.
*/
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_shape.class)
public class ShapeContextDistanceExtractor extends ShapeDistanceExtractor {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ShapeContextDistanceExtractor(Pointer p) { super(p); }

    /** \brief Establish the number of angular bins for the Shape Context Descriptor used in the shape matching
    pipeline.
    <p>
    @param nAngularBins The number of angular bins in the shape context descriptor.
     */
    public native void setAngularBins(int nAngularBins);
    public native int getAngularBins();

    /** \brief Establish the number of radial bins for the Shape Context Descriptor used in the shape matching
    pipeline.
    <p>
    @param nRadialBins The number of radial bins in the shape context descriptor.
     */
    public native void setRadialBins(int nRadialBins);
    public native int getRadialBins();

    /** \brief Set the inner radius of the shape context descriptor.
    <p>
    @param innerRadius The value of the inner radius.
     */
    public native void setInnerRadius(float innerRadius);
    public native float getInnerRadius();

    /** \brief Set the outer radius of the shape context descriptor.
    <p>
    @param outerRadius The value of the outer radius.
     */
    public native void setOuterRadius(float outerRadius);
    public native float getOuterRadius();

    public native void setRotationInvariant(@Cast("bool") boolean rotationInvariant);
    public native @Cast("bool") boolean getRotationInvariant();

    /** \brief Set the weight of the shape context distance in the final value of the shape distance. The shape
    context distance between two shapes is defined as the symmetric sum of shape context matching costs
    over best matching points. The final value of the shape distance is a user-defined linear
    combination of the shape context distance, an image appearance distance, and a bending energy.
    <p>
    @param shapeContextWeight The weight of the shape context distance in the final distance value.
     */
    public native void setShapeContextWeight(float shapeContextWeight);
    public native float getShapeContextWeight();

    /** \brief Set the weight of the Image Appearance cost in the final value of the shape distance. The image
    appearance cost is defined as the sum of squared brightness differences in Gaussian windows around
    corresponding image points. The final value of the shape distance is a user-defined linear
    combination of the shape context distance, an image appearance distance, and a bending energy. If
    this value is set to a number different from 0, is mandatory to set the images that correspond to
    each shape.
    <p>
    @param imageAppearanceWeight The weight of the appearance cost in the final distance value.
     */
    public native void setImageAppearanceWeight(float imageAppearanceWeight);
    public native float getImageAppearanceWeight();

    /** \brief Set the weight of the Bending Energy in the final value of the shape distance. The bending energy
    definition depends on what transformation is being used to align the shapes. The final value of the
    shape distance is a user-defined linear combination of the shape context distance, an image
    appearance distance, and a bending energy.
    <p>
    @param bendingEnergyWeight The weight of the Bending Energy in the final distance value.
     */
    public native void setBendingEnergyWeight(float bendingEnergyWeight);
    public native float getBendingEnergyWeight();

    /** \brief Set the images that correspond to each shape. This images are used in the calculation of the Image
    Appearance cost.
    <p>
    @param image1 Image corresponding to the shape defined by contours1.
    @param image2 Image corresponding to the shape defined by contours2.
     */
    public native void setImages(@ByVal Mat image1, @ByVal Mat image2);
    public native void setImages(@ByVal UMat image1, @ByVal UMat image2);
    public native void setImages(@ByVal GpuMat image1, @ByVal GpuMat image2);
    public native void getImages(@ByVal Mat image1, @ByVal Mat image2);
    public native void getImages(@ByVal UMat image1, @ByVal UMat image2);
    public native void getImages(@ByVal GpuMat image1, @ByVal GpuMat image2);

    public native void setIterations(int iterations);
    public native int getIterations();

    /** \brief Set the algorithm used for building the shape context descriptor cost matrix.
    <p>
    @param comparer Smart pointer to a HistogramCostExtractor, an algorithm that defines the cost
    matrix between descriptors.
     */
    public native void setCostExtractor(@Ptr HistogramCostExtractor comparer);
    public native @Ptr HistogramCostExtractor getCostExtractor();

    /** \brief Set the value of the standard deviation for the Gaussian window for the image appearance cost.
    <p>
    @param sigma Standard Deviation.
     */
    public native void setStdDev(float sigma);
    public native float getStdDev();

    /** \brief Set the algorithm used for aligning the shapes.
    <p>
    @param transformer Smart pointer to a ShapeTransformer, an algorithm that defines the aligning
    transformation.
     */
    public native void setTransformAlgorithm(@Ptr ShapeTransformer transformer);
    public native @Ptr ShapeTransformer getTransformAlgorithm();
}
