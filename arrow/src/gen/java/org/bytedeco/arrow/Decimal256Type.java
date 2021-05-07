// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Concrete type class for 256-bit decimal data
 * 
 *  Arrow decimals are fixed-point decimal numbers encoded as a scaled
 *  integer.  The precision is the number of significant digits that the
 *  decimal type can represent; the scale is the number of digits after
 *  the decimal point (note the scale can be negative).
 * 
 *  Decimal256Type has a maximum precision of 76 significant digits.
 *  (also available as Decimal256Type::kMaxPrecision).
 * 
 *  For most use cases, the maximum precision offered by Decimal128Type
 *  is sufficient, and it will result in a more compact and more efficient
 *  encoding. */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class Decimal256Type extends DecimalType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Decimal256Type(Pointer p) { super(p); }

  @MemberGetter public static native @Cast("const arrow::Type::type") int type_id();
  public static final int type_id = type_id();

  public static native String type_name();

  /** Decimal256Type constructor that aborts on invalid input. */
  public Decimal256Type(int precision, int scale) { super((Pointer)null); allocate(precision, scale); }
  private native void allocate(int precision, int scale);

  /** Decimal256Type constructor that returns an error on invalid input. */
  public static native @ByVal DataTypeResult Make(int precision, int scale);

  public native @StdString String ToString();
  public native @StdString String name();

  @MemberGetter public static native int kMinPrecision();
  public static final int kMinPrecision = kMinPrecision();
  @MemberGetter public static native int kMaxPrecision();
  public static final int kMaxPrecision = kMaxPrecision();
  @MemberGetter public static native int kByteWidth();
  public static final int kByteWidth = kByteWidth();
}
