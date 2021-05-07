// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief An type-checking interface to permit customizable validation rules
 *  for use with InputType and KernelSignature. This is for scenarios where the
 *  acceptance is not an exact type instance, such as a TIMESTAMP type for a
 *  specific TimeUnit, but permitting any time zone. */
@Namespace("arrow::compute") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class TypeMatcher extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TypeMatcher(Pointer p) { super(p); }


  /** \brief Return true if this matcher accepts the data type. */
  public native @Cast("bool") boolean Matches(@Const @ByRef DataType type);

  /** \brief A human-interpretable string representation of what the type
   *  matcher checks for, usable when printing KernelSignature or formatting
   *  error messages. */
  public native @StdString String ToString();

  /** \brief Return true if this TypeMatcher contains the same matching rule as
   *  the other. Currently depends on RTTI. */
  public native @Cast("bool") boolean Equals(@Const @ByRef TypeMatcher other);
}
