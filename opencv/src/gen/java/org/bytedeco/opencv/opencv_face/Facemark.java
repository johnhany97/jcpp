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



/** \brief Abstract base class for all facemark models
<p>
To utilize this API in your program, please take a look at the \ref tutorial_table_of_content_facemark
### Description
<p>
Facemark is a base class which provides universal access to any specific facemark algorithm.
Therefore, the users should declare a desired algorithm before they can use it in their application.
<p>
Here is an example on how to declare a facemark algorithm:
<pre>{@code
// Using Facemark in your code:
Ptr<Facemark> facemark = createFacemarkLBF();
}</pre>
<p>
The typical pipeline for facemark detection is as follows:
- Load the trained model using Facemark::loadModel.
- Perform the fitting on an image via Facemark::fit.
*/
@Namespace("cv::face") @Properties(inherit = org.bytedeco.opencv.presets.opencv_face.class)
public class Facemark extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Facemark(Pointer p) { super(p); }


    /** \brief A function to load the trained model before the fitting process.
    @param model A string represent the filename of a trained model.
    <p>
    <B>Example of usage</B>
    <pre>{@code
    facemark->loadModel("../data/lbf.model");
    }</pre>
    */
    public native void loadModel( @Str BytePointer model );
    public native void loadModel( @Str String model );
    // virtual void saveModel(String fs)=0;

    /** \brief Detect facial landmarks from an image.
    @param image Input image.
    @param faces Output of the function which represent region of interest of the detected faces.
    Each face is stored in cv::Rect container.
    @param landmarks The detected landmark points for each faces.
    <p>
    <B>Example of usage</B>
    <pre>{@code
    Mat image = imread("image.jpg");
    std::vector<Rect> faces;
    std::vector<std::vector<Point2f> > landmarks;
    facemark->fit(image, faces, landmarks);
    }</pre>
    */
    public native @Cast("bool") boolean fit( @ByVal Mat image,
                          @ByRef RectVector faces,
                          @ByRef Point2fVectorVector landmarks);
}
