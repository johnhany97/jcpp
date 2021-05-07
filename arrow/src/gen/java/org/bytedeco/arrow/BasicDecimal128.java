// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** Represents a signed 128-bit integer in two's complement.
 * 
 *  This class is also compiled into LLVM IR - so, it should not have cpp references like
 *  streams and boost. */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class BasicDecimal128 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BasicDecimal128(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BasicDecimal128(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BasicDecimal128 position(long position) {
        return (BasicDecimal128)super.position(position);
    }
    @Override public BasicDecimal128 getPointer(long i) {
        return new BasicDecimal128((Pointer)this).offsetAddress(i);
    }

  @MemberGetter public static native int bit_width();
  public static final int bit_width = bit_width();

  /** \brief Create a BasicDecimal128 from the two's complement representation. */
  public BasicDecimal128(@Cast("int64_t") long high, @Cast("uint64_t") long low) { super((Pointer)null); allocate(high, low); }
  @NoException private native void allocate(@Cast("int64_t") long high, @Cast("uint64_t") long low);

  /** \brief Empty constructor creates a BasicDecimal128 with a value of 0. */
  public BasicDecimal128() { super((Pointer)null); allocate(); }
  @NoException private native void allocate();

  /** \brief Convert any integer value into a BasicDecimal128. */

  /** \brief Create a BasicDecimal128 from an array of bytes. Bytes are assumed to be in
   *  native-endian byte order. */
  public BasicDecimal128(@Cast("const uint8_t*") BytePointer bytes) { super((Pointer)null); allocate(bytes); }
  private native void allocate(@Cast("const uint8_t*") BytePointer bytes);
  public BasicDecimal128(@Cast("const uint8_t*") ByteBuffer bytes) { super((Pointer)null); allocate(bytes); }
  private native void allocate(@Cast("const uint8_t*") ByteBuffer bytes);
  public BasicDecimal128(@Cast("const uint8_t*") byte[] bytes) { super((Pointer)null); allocate(bytes); }
  private native void allocate(@Cast("const uint8_t*") byte[] bytes);

  /** \brief Negate the current value (in-place) */
  public native @ByRef BasicDecimal128 Negate();

  /** \brief Absolute value (in-place) */
  public native @ByRef BasicDecimal128 Abs();

  /** \brief Absolute value */
  public static native @ByVal BasicDecimal128 Abs(@Const @ByRef BasicDecimal128 left);

  /** \brief Add a number to this one. The result is truncated to 128 bits. */
  public native @ByRef @Name("operator +=") BasicDecimal128 addPut(@Const @ByRef BasicDecimal128 right);

  /** \brief Subtract a number from this one. The result is truncated to 128 bits. */
  public native @ByRef @Name("operator -=") BasicDecimal128 subtractPut(@Const @ByRef BasicDecimal128 right);

  /** \brief Multiply this number by another number. The result is truncated to 128 bits. */
  
  ///
  public native @ByRef @Name("operator *=") BasicDecimal128 multiplyPut(@Const @ByRef BasicDecimal128 right);

  /** Divide this number by right and return the result.
   * 
   *  This operation is not destructive.
   *  The answer rounds to zero. Signs work like:
   *    21 /  5 ->  4,  1
   *   -21 /  5 -> -4, -1
   *    21 / -5 -> -4,  1
   *   -21 / -5 ->  4, -1
   *  @param divisor [in] the number to divide by
   *  @param result [out] the quotient
   *  @param remainder [out] the remainder after the division */
  public native DecimalStatus Divide(@Const @ByRef BasicDecimal128 divisor, BasicDecimal128 result,
                         BasicDecimal128 remainder);

  /** \brief In-place division. */
  public native @ByRef @Name("operator /=") BasicDecimal128 dividePut(@Const @ByRef BasicDecimal128 right);

  /** \brief Bitwise "or" between two BasicDecimal128. */
  public native @ByRef @Name("operator |=") BasicDecimal128 orPut(@Const @ByRef BasicDecimal128 right);

  /** \brief Bitwise "and" between two BasicDecimal128. */
  public native @ByRef @Name("operator &=") BasicDecimal128 andPut(@Const @ByRef BasicDecimal128 right);

  /** \brief Shift left by the given number of bits. */
  public native @ByRef @Name("operator <<=") BasicDecimal128 shiftLeftPut(@Cast("uint32_t") int bits);

  /** \brief Shift right by the given number of bits. Negative values will */
  public native @ByRef @Name("operator >>=") BasicDecimal128 shiftRightPut(@Cast("uint32_t") int bits);

  /** \brief Get the high bits of the two's complement representation of the number. */
  public native @Cast("const int64_t") long high_bits();

  /** \brief Get the low bits of the two's complement representation of the number. */
  public native @Cast("const uint64_t") long low_bits();

  /** \brief Return the raw bytes of the value in native-endian byte order. */
  public native @ByVal Byte16Array ToBytes();
  public native void ToBytes(@Cast("uint8_t*") BytePointer out);
  public native void ToBytes(@Cast("uint8_t*") ByteBuffer out);
  public native void ToBytes(@Cast("uint8_t*") byte[] out);

  /** \brief separate the integer and fractional parts for the given scale. */
  public native void GetWholeAndFraction(int scale, BasicDecimal128 whole,
                             BasicDecimal128 fraction);

  /** \brief Scale multiplier for given scale value. */
  public static native @Const @ByRef BasicDecimal128 GetScaleMultiplier(int scale);

  /** \brief Convert BasicDecimal128 from one scale to another */
  public native DecimalStatus Rescale(int original_scale, int new_scale,
                          BasicDecimal128 out);

  /** \brief Scale up. */
  public native @ByVal BasicDecimal128 IncreaseScaleBy(int increase_by);

  /** \brief Scale down.
   *  - If 'round' is true, the right-most digits are dropped and the result value is
   *    rounded up (+1 for +ve, -1 for -ve) based on the value of the dropped digits
   *    (>= 10^reduce_by / 2).
   *  - If 'round' is false, the right-most digits are simply dropped. */
  
  ///
  public native @ByVal BasicDecimal128 ReduceScaleBy(int reduce_by, @Cast("bool") boolean round/*=true*/);
  public native @ByVal BasicDecimal128 ReduceScaleBy(int reduce_by);

  /** \brief Whether this number fits in the given precision
   * 
   *  Return true if the number of significant digits is less or equal to {@code precision}. */
  public native @Cast("bool") boolean FitsInPrecision(int precision);

  // returns 1 for positive and zero decimal values, -1 for negative decimal values.
  public native @Cast("int64_t") long Sign();

  /** \brief count the number of leading binary zeroes. */
  public native int CountLeadingBinaryZeros();

  /** \brief Get the maximum valid unscaled decimal value. */
  public static native @Const @ByRef BasicDecimal128 GetMaxValue();
}
