// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;




/////////////////////////////////// NAryMatIterator //////////////////////////////////

/** \brief n-ary multi-dimensional array iterator.
<p>
Use the class to implement unary, binary, and, generally, n-ary element-wise operations on
multi-dimensional arrays. Some of the arguments of an n-ary function may be continuous arrays, some
may be not. It is possible to use conventional MatIterator 's for each array but incrementing all of
the iterators after each small operations may be a big overhead. In this case consider using
NAryMatIterator to iterate through several matrices simultaneously as long as they have the same
geometry (dimensionality and all the dimension sizes are the same). On each iteration {@code it.planes[0]},
{@code it.planes[1]},... will be the slices of the corresponding matrices.
<p>
The example below illustrates how you can compute a normalized and threshold 3D color histogram:
<pre>{@code
    void computeNormalizedColorHist(const Mat& image, Mat& hist, int N, double minProb)
    {
        const int histSize[] = {N, N, N};

        // make sure that the histogram has a proper size and type
        hist.create(3, histSize, CV_32F);

        // and clear it
        hist = Scalar(0);

        // the loop below assumes that the image
        // is a 8-bit 3-channel. check it.
        CV_Assert(image.type() == CV_8UC3);
        MatConstIterator_<Vec3b> it = image.begin<Vec3b>(),
                                 it_end = image.end<Vec3b>();
        for( ; it != it_end; ++it )
        {
            const Vec3b& pix = *it;
            hist.at<float>(pix[0]*N/256, pix[1]*N/256, pix[2]*N/256) += 1.f;
        }

        minProb *= image.rows*image.cols;

        // initialize iterator (the style is different from STL).
        // after initialization the iterator will contain
        // the number of slices or planes the iterator will go through.
        // it simultaneously increments iterators for several matrices
        // supplied as a null terminated list of pointers
        const Mat* arrays[] = {&hist, 0};
        Mat planes[1];
        NAryMatIterator itNAry(arrays, planes, 1);
        double s = 0;
        // iterate through the matrix. on each iteration
        // itNAry.planes[i] (of type Mat) will be set to the current plane
        // of the i-th n-dim matrix passed to the iterator constructor.
        for(int p = 0; p < itNAry.nplanes; p++, ++itNAry)
        {
            threshold(itNAry.planes[0], itNAry.planes[0], minProb, 0, THRESH_TOZERO);
            s += sum(itNAry.planes[0])[0];
        }

        s = 1./s;
        itNAry = NAryMatIterator(arrays, planes, 1);
        for(int p = 0; p < itNAry.nplanes; p++, ++itNAry)
            itNAry.planes[0] *= s;
    }
}</pre>
 */
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class NAryMatIterator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NAryMatIterator(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NAryMatIterator(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public NAryMatIterator position(long position) {
        return (NAryMatIterator)super.position(position);
    }

    /** the default constructor */
    public NAryMatIterator() { super((Pointer)null); allocate(); }
    private native void allocate();
    /** the full constructor taking arbitrary number of n-dim matrices */
    public NAryMatIterator(@Cast("const cv::Mat**") PointerPointer arrays, @Cast("uchar**") PointerPointer ptrs, int narrays/*=-1*/) { super((Pointer)null); allocate(arrays, ptrs, narrays); }
    private native void allocate(@Cast("const cv::Mat**") PointerPointer arrays, @Cast("uchar**") PointerPointer ptrs, int narrays/*=-1*/);
    public NAryMatIterator(@Const @ByPtrPtr Mat arrays, @Cast("uchar**") @ByPtrPtr BytePointer ptrs) { super((Pointer)null); allocate(arrays, ptrs); }
    private native void allocate(@Const @ByPtrPtr Mat arrays, @Cast("uchar**") @ByPtrPtr BytePointer ptrs);
    public NAryMatIterator(@Const @ByPtrPtr Mat arrays, @Cast("uchar**") @ByPtrPtr BytePointer ptrs, int narrays/*=-1*/) { super((Pointer)null); allocate(arrays, ptrs, narrays); }
    private native void allocate(@Const @ByPtrPtr Mat arrays, @Cast("uchar**") @ByPtrPtr BytePointer ptrs, int narrays/*=-1*/);
    public NAryMatIterator(@Const @ByPtrPtr Mat arrays, @Cast("uchar**") @ByPtrPtr ByteBuffer ptrs, int narrays/*=-1*/) { super((Pointer)null); allocate(arrays, ptrs, narrays); }
    private native void allocate(@Const @ByPtrPtr Mat arrays, @Cast("uchar**") @ByPtrPtr ByteBuffer ptrs, int narrays/*=-1*/);
    public NAryMatIterator(@Const @ByPtrPtr Mat arrays, @Cast("uchar**") @ByPtrPtr ByteBuffer ptrs) { super((Pointer)null); allocate(arrays, ptrs); }
    private native void allocate(@Const @ByPtrPtr Mat arrays, @Cast("uchar**") @ByPtrPtr ByteBuffer ptrs);
    public NAryMatIterator(@Const @ByPtrPtr Mat arrays, @Cast("uchar**") @ByPtrPtr byte[] ptrs, int narrays/*=-1*/) { super((Pointer)null); allocate(arrays, ptrs, narrays); }
    private native void allocate(@Const @ByPtrPtr Mat arrays, @Cast("uchar**") @ByPtrPtr byte[] ptrs, int narrays/*=-1*/);
    public NAryMatIterator(@Const @ByPtrPtr Mat arrays, @Cast("uchar**") @ByPtrPtr byte[] ptrs) { super((Pointer)null); allocate(arrays, ptrs); }
    private native void allocate(@Const @ByPtrPtr Mat arrays, @Cast("uchar**") @ByPtrPtr byte[] ptrs);
    /** the full constructor taking arbitrary number of n-dim matrices */
    public NAryMatIterator(@Cast("const cv::Mat**") PointerPointer arrays, Mat planes, int narrays/*=-1*/) { super((Pointer)null); allocate(arrays, planes, narrays); }
    private native void allocate(@Cast("const cv::Mat**") PointerPointer arrays, Mat planes, int narrays/*=-1*/);
    public NAryMatIterator(@Const @ByPtrPtr Mat arrays, Mat planes) { super((Pointer)null); allocate(arrays, planes); }
    private native void allocate(@Const @ByPtrPtr Mat arrays, Mat planes);
    public NAryMatIterator(@Const @ByPtrPtr Mat arrays, Mat planes, int narrays/*=-1*/) { super((Pointer)null); allocate(arrays, planes, narrays); }
    private native void allocate(@Const @ByPtrPtr Mat arrays, Mat planes, int narrays/*=-1*/);
    /** the separate iterator initialization method */
    public native void init(@Cast("const cv::Mat**") PointerPointer arrays, Mat planes, @Cast("uchar**") PointerPointer ptrs, int narrays/*=-1*/);
    public native void init(@Const @ByPtrPtr Mat arrays, Mat planes, @Cast("uchar**") @ByPtrPtr BytePointer ptrs);
    public native void init(@Const @ByPtrPtr Mat arrays, Mat planes, @Cast("uchar**") @ByPtrPtr BytePointer ptrs, int narrays/*=-1*/);
    public native void init(@Const @ByPtrPtr Mat arrays, Mat planes, @Cast("uchar**") @ByPtrPtr ByteBuffer ptrs, int narrays/*=-1*/);
    public native void init(@Const @ByPtrPtr Mat arrays, Mat planes, @Cast("uchar**") @ByPtrPtr ByteBuffer ptrs);
    public native void init(@Const @ByPtrPtr Mat arrays, Mat planes, @Cast("uchar**") @ByPtrPtr byte[] ptrs, int narrays/*=-1*/);
    public native void init(@Const @ByPtrPtr Mat arrays, Mat planes, @Cast("uchar**") @ByPtrPtr byte[] ptrs);

    /** proceeds to the next plane of every iterated matrix */
    public native @ByRef @Name("operator ++") NAryMatIterator increment();
    /** proceeds to the next plane of every iterated matrix (postfix increment operator) */
    public native @ByVal @Name("operator ++") NAryMatIterator increment(int arg0);

    /** the iterated arrays */
    public native @Const Mat arrays(int i); public native NAryMatIterator arrays(int i, Mat setter);
    @MemberGetter public native @Cast("const cv::Mat**") PointerPointer arrays();
    /** the current planes */
    public native Mat planes(); public native NAryMatIterator planes(Mat setter);
    /** data pointers */
    public native @Cast("uchar*") BytePointer ptrs(int i); public native NAryMatIterator ptrs(int i, BytePointer setter);
    public native @Cast("uchar**") PointerPointer ptrs(); public native NAryMatIterator ptrs(PointerPointer setter);
    /** the number of arrays */
    public native int narrays(); public native NAryMatIterator narrays(int setter);
    /** the number of hyper-planes that the iterator steps through */
    public native @Cast("size_t") long nplanes(); public native NAryMatIterator nplanes(long setter);
    /** the size of each segment (in elements) */
    public native @Cast("size_t") long size(); public native NAryMatIterator size(long setter);
}
