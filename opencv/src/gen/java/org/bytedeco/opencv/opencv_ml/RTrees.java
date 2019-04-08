// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_ml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;

import static org.bytedeco.opencv.global.opencv_ml.*;


/****************************************************************************************\
*                                   Random Trees Classifier                              *
\****************************************************************************************/

/** \brief The class implements the random forest predictor.
<p>
@see \ref ml_intro_rtrees
 */
@Namespace("cv::ml") @Properties(inherit = org.bytedeco.opencv.presets.opencv_ml.class)
public class RTrees extends DTrees {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RTrees(Pointer p) { super(p); }


    /** If true then variable importance will be calculated and then it can be retrieved by RTrees::getVarImportance.
    Default value is false.*/
    /** @see setCalculateVarImportance */
    public native @Cast("bool") boolean getCalculateVarImportance();
    /** \copybrief getCalculateVarImportance @see getCalculateVarImportance */
    public native void setCalculateVarImportance(@Cast("bool") boolean val);

    /** The size of the randomly selected subset of features at each tree node and that are used
    to find the best split(s).
    If you set it to 0 then the size will be set to the square root of the total number of
    features. Default value is 0.*/
    /** @see setActiveVarCount */
    public native int getActiveVarCount();
    /** \copybrief getActiveVarCount @see getActiveVarCount */
    public native void setActiveVarCount(int val);

    /** The termination criteria that specifies when the training algorithm stops.
    Either when the specified number of trees is trained and added to the ensemble or when
    sufficient accuracy (measured as OOB error) is achieved. Typically the more trees you have the
    better the accuracy. However, the improvement in accuracy generally diminishes and asymptotes
    pass a certain number of trees. Also to keep in mind, the number of tree increases the
    prediction time linearly. Default value is TermCriteria(TermCriteria::MAX_ITERS +
    TermCriteria::EPS, 50, 0.1)*/
    /** @see setTermCriteria */
    public native @ByVal TermCriteria getTermCriteria();
    /** \copybrief getTermCriteria @see getTermCriteria */
    public native void setTermCriteria(@Const @ByRef TermCriteria val);

    /** Returns the variable importance array.
    The method returns the variable importance vector, computed at the training stage when
    CalculateVarImportance is set to true. If this flag was set to false, the empty matrix is
    returned.
     */
    public native @ByVal Mat getVarImportance();

    /** Returns the result of each individual tree in the forest.
    In case the model is a regression problem, the method will return each of the trees'
    results for each of the sample cases. If the model is a classifier, it will return
    a Mat with samples + 1 rows, where the first row gives the class number and the
    following rows return the votes each class had for each sample.
        @param samples Array containing the samples for which votes will be calculated.
        @param results Array where the result of the calculation will be written.
        @param flags Flags for defining the type of RTrees.
    */
    public native void getVotes(@ByVal Mat samples, @ByVal Mat results, int flags);
    public native void getVotes(@ByVal UMat samples, @ByVal UMat results, int flags);
    public native void getVotes(@ByVal GpuMat samples, @ByVal GpuMat results, int flags);

    /** Creates the empty model.
    Use StatModel::train to train the model, StatModel::train to create and train the model,
    Algorithm::load to load the pre-trained model.
     */
    public static native @Ptr RTrees create();

    /** \brief Loads and creates a serialized RTree from a file
     *
     * Use RTree::save to serialize and store an RTree to disk.
     * Load the RTree from this file again, by calling this function with the path to the file.
     * Optionally specify the node for the file containing the classifier
     *
     * @param filepath path to serialized RTree
     * @param nodeName name of node containing the classifier
     */
    public static native @Ptr RTrees load(@Str BytePointer filepath, @Str BytePointer nodeName/*=cv::String()*/);
    public static native @Ptr RTrees load(@Str BytePointer filepath);
    public static native @Ptr RTrees load(@Str String filepath, @Str String nodeName/*=cv::String()*/);
    public static native @Ptr RTrees load(@Str String filepath);
}
