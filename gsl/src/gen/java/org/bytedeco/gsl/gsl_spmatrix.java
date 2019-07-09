// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


/*
 * Triplet format:
 *
 * If data[n] = A_{ij}, then:
 *   i = A->i[n]
 *   j = A->p[n]
 *
 * Compressed column format (CCS):
 *
 * If data[n] = A_{ij}, then:
 *   i = A->i[n]
 *   A->p[j] <= n < A->p[j+1]
 * so that column j is stored in
 * [ data[p[j]], data[p[j] + 1], ..., data[p[j+1] - 1] ]
 *
 * Compressed row format (CRS):
 *
 * If data[n] = A_{ij}, then:
 *   j = A->i[n]
 *   A->p[i] <= n < A->p[i+1]
 * so that row i is stored in
 * [ data[p[i]], data[p[i] + 1], ..., data[p[i+1] - 1] ]
 */

@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_spmatrix extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_spmatrix() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_spmatrix(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_spmatrix(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_spmatrix position(long position) {
        return (gsl_spmatrix)super.position(position);
    }

  public native @Cast("size_t") long size1(); public native gsl_spmatrix size1(long setter);  /* number of rows */
  public native @Cast("size_t") long size2(); public native gsl_spmatrix size2(long setter);  /* number of columns */

  /* i (size nzmax) contains:
   *
   * Triplet/CCS: row indices
   * CRS: column indices
   */
  public native @Cast("size_t*") SizeTPointer i(); public native gsl_spmatrix i(SizeTPointer setter);

  public native DoublePointer data(); public native gsl_spmatrix data(DoublePointer setter);  /* matrix elements of size nzmax */

  /*
   * p contains the column indices (triplet) or column pointers (compcol)
   *
   * triplet: p[n] = column number of element data[n]
   * CCS:     p[j] = index in data of first non-zero element in column j
   * CRS:     p[i] = index in data of first non-zero element in row i
   */
  public native @Cast("size_t*") SizeTPointer p(); public native gsl_spmatrix p(SizeTPointer setter);

  public native @Cast("size_t") long nzmax(); public native gsl_spmatrix nzmax(long setter);  /* maximum number of matrix elements */
  public native @Cast("size_t") long nz(); public native gsl_spmatrix nz(long setter);     /* number of non-zero values in matrix */

  public native gsl_spmatrix_tree tree_data(); public native gsl_spmatrix tree_data(gsl_spmatrix_tree setter); /* binary tree for sorting triplet data */

  /*
   * workspace of size MAX(size1,size2)*MAX(sizeof(double),sizeof(size_t))
   * used in various routines
   */
      public native Pointer work(); public native gsl_spmatrix work(Pointer setter);
      public native @Cast("size_t*") SizeTPointer work_sze(); public native gsl_spmatrix work_sze(SizeTPointer setter);
      public native DoublePointer work_dbl(); public native gsl_spmatrix work_dbl(DoublePointer setter);

  public native @Cast("size_t") long sptype(); public native gsl_spmatrix sptype(long setter); /* sparse storage type */
}
