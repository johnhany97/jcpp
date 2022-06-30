// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;

/** SymIntArrayRef - Represent a constant reference to an array (0 or more
 *  elements consecutively in memory), i.e. a start pointer and a length.  It
 *  allows various APIs to take consecutive elements easily and conveniently.
 * 
 *  This class does not own the underlying data, it is expected to be used in
 *  situations where the data resides in some other buffer, whose lifetime
 *  extends past that of the SymIntArrayRef. For this reason, it is not in
 *  general safe to store an SymIntArrayRef.
 * 
 *  This is intended to be trivially copyable, so it should be passed by
 *  value. */

@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SymIntArrayRef extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SymIntArrayRef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SymIntArrayRef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SymIntArrayRef position(long position) {
        return (SymIntArrayRef)super.position(position);
    }
    @Override public SymIntArrayRef getPointer(long i) {
        return new SymIntArrayRef((Pointer)this).offsetAddress(i);
    }

  /** \name Constructors
   *  \{
   <p>
   *  Construct an empty SymIntArrayRef. */
  /* implicit */ public SymIntArrayRef() { super((Pointer)null); allocate(); }
private native void allocate();

  /* implicit */ public SymIntArrayRef(@StdVector SymInt Vec) { super((Pointer)null); allocate(Vec); }
private native void allocate(@StdVector SymInt Vec);

  /** Construct an SymIntArrayRef from a pointer and length. */
  public SymIntArrayRef(
        @Const SymInt data,
        @Cast("size_t") long length) { super((Pointer)null); allocate(data, length); }
  private native void allocate(
        @Const SymInt data,
        @Cast("size_t") long length);

  /** Construct an SymIntArrayRef from a range. */
  public SymIntArrayRef(
        @Const SymInt begin,
        @Const SymInt end) { super((Pointer)null); allocate(begin, end); }
  private native void allocate(
        @Const SymInt begin,
        @Const SymInt end);

  /** Construct an SymIntArrayRef from a C array. */

  /** \}
   *  \name Simple Operations
   *  \{ */

  public native @ByVal @Cast("const c10::SymIntArrayRef::iterator*") SymInt begin();
  public native @ByVal @Cast("const c10::SymIntArrayRef::iterator*") SymInt end();

  // These are actually the same as iterator, since SymIntArrayRef only
  // gives you const iterators.
  public native @ByVal @Cast("const c10::SymIntArrayRef::const_iterator*") SymInt cbegin();
  public native @ByVal @Cast("const c10::SymIntArrayRef::const_iterator*") SymInt cend();

  /** empty - Check if the array is empty. */
  public native @Cast("const bool") boolean empty();

  public native @Const SymInt data();

  /** size - Get the array size. */
  public native @Cast("const size_t") long size();

  /** front - Get the first element. */
  public native @Const @ByRef SymInt front();

  /** back - Get the last element. */
  public native @Const @ByRef SymInt back();

  /** equals - Check for element-wise equality. */
  public native @Cast("const bool") boolean equals(@ByVal SymIntArrayRef RHS);

  /** slice(n, m) - Take M elements of the array starting at element N */
  public native @Const @ByVal SymIntArrayRef slice(@Cast("size_t") long N, @Cast("size_t") long M);

  /** slice(n) - Chop off the first N elements of the array. */
  public native @Const @ByVal SymIntArrayRef slice(@Cast("size_t") long N);

  /** \}
   *  \name Operator Overloads
   *  \{ */
  public native @Const @ByRef @Name("operator []") SymInt get(@Cast("size_t") long Index);

  /** Vector compatibility */
  
  ///
  public native @Const @ByRef SymInt at(@Cast("size_t") long Index);

  /** Disallow accidental assignment from a temporary.
   * 
   *  The declaration here is extra complicated so that "arrayRef = {}"
   *  continues to select the move assignment operator. */
  

  /** Disallow accidental assignment from a temporary.
   * 
   *  The declaration here is extra complicated so that "arrayRef = {}"
   *  continues to select the move assignment operator. */
  

  /** \}
   *  \name Expensive Operations
   *  \{ */
  public native @StdVector SymInt vec();

  
  /** \} */
}
