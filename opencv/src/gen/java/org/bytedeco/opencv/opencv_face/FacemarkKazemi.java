// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_face;

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
import org.bytedeco.opencv.opencv_objdetect.*;
import static org.bytedeco.opencv.global.opencv_objdetect.*;
import org.bytedeco.opencv.opencv_photo.*;
import static org.bytedeco.opencv.global.opencv_photo.*;

import static org.bytedeco.opencv.global.opencv_face.*;

@Namespace("cv::face") @Properties(inherit = org.bytedeco.opencv.presets.opencv_face.class)
public class FacemarkKazemi extends Facemark {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FacemarkKazemi(Pointer p) { super(p); }

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
    
        /**
        * \brief Constructor
        */
        public Params() { super((Pointer)null); allocate(); }
        private native void allocate();
        /** cascade_depth This stores the deapth of cascade used for training. */
        public native @Cast("unsigned long") long cascade_depth(); public native Params cascade_depth(long setter);
        /** tree_depth This stores the max height of the regression tree built. */
        public native @Cast("unsigned long") long tree_depth(); public native Params tree_depth(long setter);
        /** num_trees_per_cascade_level This stores number of trees fit per cascade level. */
        public native @Cast("unsigned long") long num_trees_per_cascade_level(); public native Params num_trees_per_cascade_level(long setter);
        /** learning_rate stores the learning rate in gradient boosting, also reffered as shrinkage. */
        public native float learning_rate(); public native Params learning_rate(float setter);
        /** oversampling_amount stores number of initialisations used to create training samples. */
        public native @Cast("unsigned long") long oversampling_amount(); public native Params oversampling_amount(long setter);
        /** num_test_coordinates stores number of test coordinates. */
        public native @Cast("unsigned long") long num_test_coordinates(); public native Params num_test_coordinates(long setter);
        /** lambda stores a value to calculate probability of closeness of two coordinates. */
        public native float lambda(); public native Params lambda(float setter);
        /** num_test_splits stores number of random test splits generated. */
        public native @Cast("unsigned long") long num_test_splits(); public native Params num_test_splits(long setter);
        /** configfile stores the name of the file containing the values of training parameters */
        public native @Str BytePointer configfile(); public native Params configfile(BytePointer setter);
    }
    public static native @Ptr FacemarkKazemi create(@Const @ByRef(nullValue = "cv::face::FacemarkKazemi::Params()") Params parameters);
    public static native @Ptr FacemarkKazemi create();

    /** \brief This function is used to train the model using gradient boosting to get a cascade of regressors
    *which can then be used to predict shape.
    *@param images A vector of type cv::Mat which stores the images which are used in training samples.
    *@param landmarks A vector of vectors of type cv::Point2f which stores the landmarks detected in a particular image.
    *@param scale A size of type cv::Size to which all images and landmarks have to be scaled to.
    *@param configfile A variable of type std::string which stores the name of the file storing parameters for training the model.
    *@param modelFilename A variable of type std::string which stores the name of the trained model file that has to be saved.
    *@return A boolean value. The function returns true if the model is trained properly or false if it is not trained.
    */
    public native @Cast("bool") boolean training(@ByRef MatVector images, @ByRef Point2fVectorVector landmarks,@StdString BytePointer configfile,@ByVal Size scale,@StdString BytePointer modelFilename/*="face_landmarks.dat"*/);
    public native @Cast("bool") boolean training(@ByRef MatVector images, @ByRef Point2fVectorVector landmarks,@StdString BytePointer configfile,@ByVal Size scale);
    public native @Cast("bool") boolean training(@ByRef MatVector images, @ByRef Point2fVectorVector landmarks,@StdString String configfile,@ByVal Size scale,@StdString String modelFilename/*="face_landmarks.dat"*/);
    public native @Cast("bool") boolean training(@ByRef MatVector images, @ByRef Point2fVectorVector landmarks,@StdString String configfile,@ByVal Size scale);

    /** set the custom face detector */
    public native @Cast("bool") boolean setFaceDetector(@Cast("bool (*)(cv::InputArray, cv::OutputArray, void*)") Pointer f, Pointer userData);
    /** get faces using the custom detector */
    public native @Cast("bool") boolean getFaces(@ByVal Mat image, @ByRef RectVector faces);
}
