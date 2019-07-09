// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;




/////////////////////////////// SparseMatConstIterator ///////////////////////////////

/**  \brief Read-Only Sparse Matrix Iterator.
 <p>
 Here is how to use the iterator to compute the sum of floating-point sparse matrix elements:
 <p>
 <pre>{@code
 SparseMatConstIterator it = m.begin(), it_end = m.end();
 double s = 0;
 CV_Assert( m.type() == CV_32F );
 for( ; it != it_end; ++it )
    s += it.value<float>();
 }</pre>
*/
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class SparseMatConstIterator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SparseMatConstIterator(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SparseMatConstIterator(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SparseMatConstIterator position(long position) {
        return (SparseMatConstIterator)super.position(position);
    }

    /** the default constructor */
    public SparseMatConstIterator() { super((Pointer)null); allocate(); }
    private native void allocate();
    /** the full constructor setting the iterator to the first sparse matrix element */
    public SparseMatConstIterator(@Const SparseMat _m) { super((Pointer)null); allocate(_m); }
    private native void allocate(@Const SparseMat _m);
    /** the copy constructor */
    public SparseMatConstIterator(@Const @ByRef SparseMatConstIterator it) { super((Pointer)null); allocate(it); }
    private native void allocate(@Const @ByRef SparseMatConstIterator it);

    /** the assignment operator */
    public native @ByRef @Name("operator =") SparseMatConstIterator put(@Const @ByRef SparseMatConstIterator it);

    /** template method returning the current matrix element */
    /** returns the current node of the sparse matrix. it.node->idx is the current element index */
    public native @Const SparseMat.Node node();

    /** moves iterator to the previous element */
    
    /** moves iterator to the previous element */
    
    /** moves iterator to the next element */
    public native @ByRef @Name("operator ++") SparseMatConstIterator increment();
    /** moves iterator to the next element */
    public native @ByVal @Name("operator ++") SparseMatConstIterator increment(int arg0);

    /** moves iterator to the element after the last element */
    public native void seekEnd();

    public native @Const SparseMat m(); public native SparseMatConstIterator m(SparseMat setter);
    public native @Cast("size_t") long hashidx(); public native SparseMatConstIterator hashidx(long setter);
    public native @Cast("uchar*") BytePointer ptr(); public native SparseMatConstIterator ptr(BytePointer setter);
}
