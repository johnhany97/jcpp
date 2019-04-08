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

@Name("std::vector<caffe::Datum>") @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class DatumVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DatumVector(Pointer p) { super(p); }
    public DatumVector(Datum value) { this(1); put(0, value); }
    public DatumVector(Datum ... array) { this(array.length); put(array); }
    public DatumVector()       { allocate();  }
    public DatumVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef DatumVector put(@ByRef DatumVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @ByRef Datum get(@Cast("size_t") long i);
    public native DatumVector put(@Cast("size_t") long i, Datum value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @ByRef Datum value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator++") @ByRef Iterator increment();
        public native @Name("operator==") boolean equals(@ByRef Iterator it);
        public native @Name("operator*") @ByRef @Const Datum get();
    }

    public Datum[] get() {
        Datum[] array = new Datum[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public Datum pop_back() {
        long size = size();
        Datum value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public DatumVector push_back(Datum value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public DatumVector put(Datum value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public DatumVector put(Datum ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

