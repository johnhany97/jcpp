// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow::compute") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class ReplaceSubstringOptions extends FunctionOptions {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ReplaceSubstringOptions(Pointer p) { super(p); }

  public ReplaceSubstringOptions(@StdString String pattern, @StdString String replacement,
                                     @Cast("int64_t") long max_replacements/*=-1*/) { super((Pointer)null); allocate(pattern, replacement, max_replacements); }
  private native void allocate(@StdString String pattern, @StdString String replacement,
                                     @Cast("int64_t") long max_replacements/*=-1*/);
  public ReplaceSubstringOptions(@StdString String pattern, @StdString String replacement) { super((Pointer)null); allocate(pattern, replacement); }
  private native void allocate(@StdString String pattern, @StdString String replacement);
  public ReplaceSubstringOptions(@StdString BytePointer pattern, @StdString BytePointer replacement,
                                     @Cast("int64_t") long max_replacements/*=-1*/) { super((Pointer)null); allocate(pattern, replacement, max_replacements); }
  private native void allocate(@StdString BytePointer pattern, @StdString BytePointer replacement,
                                     @Cast("int64_t") long max_replacements/*=-1*/);
  public ReplaceSubstringOptions(@StdString BytePointer pattern, @StdString BytePointer replacement) { super((Pointer)null); allocate(pattern, replacement); }
  private native void allocate(@StdString BytePointer pattern, @StdString BytePointer replacement);

  /** Pattern to match, literal, or regular expression depending on which kernel is used */
  public native @StdString String pattern(); public native ReplaceSubstringOptions pattern(String setter);
  /** String to replace the pattern with */
  public native @StdString String replacement(); public native ReplaceSubstringOptions replacement(String setter);
  /** Max number of substrings to replace (-1 means unbounded) */
  public native @Cast("int64_t") long max_replacements(); public native ReplaceSubstringOptions max_replacements(long setter);
}
