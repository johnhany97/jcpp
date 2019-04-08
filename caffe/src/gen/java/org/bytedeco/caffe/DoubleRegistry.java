// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.caffe;

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
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.caffe.global.caffe.*;

@Name("std::map<std::string,caffe::LayerRegistry<double>::Creator>") @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class DoubleRegistry extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DoubleRegistry(Pointer p) { super(p); }
    public DoubleRegistry()       { allocate();  }
    private native void allocate();
    public native @Name("operator=") @ByRef DoubleRegistry put(@ByRef DoubleRegistry x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native DoubleLayerRegistry.Creator get(@StdString BytePointer i);
    public native DoubleRegistry put(@StdString BytePointer i, DoubleLayerRegistry.Creator value);

    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator++") @ByRef Iterator increment();
        public native @Name("operator==") boolean equals(@ByRef Iterator it);
        public native @Name("operator*().first") @MemberGetter @StdString BytePointer first();
        public native @Name("operator*().second") @MemberGetter DoubleLayerRegistry.Creator second();
    }
}

