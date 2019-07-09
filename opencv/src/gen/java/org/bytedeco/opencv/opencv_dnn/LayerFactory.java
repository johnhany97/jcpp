// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_dnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.opencv.global.opencv_dnn.*;

/** \addtogroup dnn
 *  \{
 * 
 *  \defgroup dnnLayerFactory Utilities for New Layers Registration
 *  \{
<p>
/** \brief %Layer factory allows to create instances of registered layers. */
@Namespace("cv::dnn") @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class LayerFactory extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LayerFactory(Pointer p) { super(p); }


    /** Each Layer class must provide this function to the factory */
    @Convention(value="", extern="C++") public static class Constructor extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Constructor(Pointer p) { super(p); }
        protected Constructor() { allocate(); }
        private native void allocate();
        public native @Ptr Layer call(@ByRef LayerParams params);
    }

    /** Registers the layer class with typename \p type and specified \p constructor. Thread-safe. */
    public static native void registerLayer(@Str BytePointer type, Constructor constructor);
    public static native void registerLayer(@Str String type, Constructor constructor);

    /** Unregisters registered layer with specified type name. Thread-safe. */
    public static native void unregisterLayer(@Str BytePointer type);
    public static native void unregisterLayer(@Str String type);

    /** \brief Creates instance of registered layer.
     *  @param type type name of creating layer.
     *  @param params parameters which will be used for layer initialization.
     *  \note Thread-safe.
     */
    public static native @Ptr Layer createLayerInstance(@Str BytePointer type, @ByRef LayerParams params);
    public static native @Ptr Layer createLayerInstance(@Str String type, @ByRef LayerParams params);
}
